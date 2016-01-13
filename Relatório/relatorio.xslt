<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xd="http://www.oxygenxml.com/ns/doc/xsl" exclude-result-prefixes="xs xd" version="1.0">
    
    <xsl:key name="seccoes" match="section|subsection|subsubsection" use="@id"/>
    
    <xsl:output method="html" indent="yes"/>
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet"
                    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"/>
                <script src="https://code.jquery.com/jquery-1.11.0.min.js"/>
                <style type="text/css">
                    .col-center{
                        float:none;
                        margin-left:auto;
                        margin-right:auto;
                    }</style>
                <title>Relatório</title>
            </head>
            <body>
                <div class="container">
                    <xsl:apply-templates select="report"/>
                    <hr/>
                </div>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="report">
        <xsl:apply-templates select="front-matter"/>
        <hr/>
        <xsl:apply-templates select="body"/>
        <hr/>
        <xsl:apply-templates select="back-matter"/>
    </xsl:template>

    <xsl:template match="front-matter">
        <xsl:apply-templates select="meta"/>
        <xsl:apply-templates select="abstract"/>
        <xsl:apply-templates select="toc"/>
        <xsl:apply-templates select="lot"/>
        <xsl:apply-templates select="lof"/>
    </xsl:template>

    <xsl:template match="toc">
        <div class="col-md-12">
            <div class="row">
                <p class="bg-info">Indíce:</p>
                <xsl:apply-templates mode="toc" select="//section"/>
            </div>
        </div>
    </xsl:template>
    
    <xsl:template mode="toc" match="section">
        <ul>
            <li><a style="color:#2ecc71" href="#{generate-id()}"><xsl:value-of select="title"/></a></li>
            <xsl:apply-templates mode="toc_sub" select="subsection"/>
        </ul>
    </xsl:template>
    
    <xsl:template mode="toc_sub" match="subsection">
        <ul>
            <li><a style="color:#1abc9c" href="#{generate-id()}"><xsl:value-of select="title"/></a></li>
            <xsl:apply-templates mode="toc_subsub" select="subsubsection"/>
        </ul>
    </xsl:template>
    
    <xsl:template mode="toc_subsub" match="subsubsection">
        <ul>
            <li><a style="color:#3498db" href="#{generate-id()}"><xsl:value-of select="title"/></a></li>
        </ul>
    </xsl:template>

    <xsl:template match="lot">
        <div class="col-md-12">
            <div class="row">
                <p class="bg-danger">Indíce de Tabelas:</p>
            </div>
        </div>
    </xsl:template>

    <xsl:template match="lof">
        <div class="col-md-12">
            <div class="row">
                <p class="bg-success">Indíce de Figuras:</p>
                <xsl:apply-templates mode="lof" select="//image"/>
            </div>
        </div>
    </xsl:template>
    
    <xsl:template mode="lof" match="image">
        <ul>
            <li><a style="color:#3498db" href="#{generate-id()}"><xsl:value-of select="."/></a></li>
        </ul>
    </xsl:template>

    <xsl:template match="meta">
        <div class="col-md-12 text-center">
            <div class="row">
                <div class="col-md-12">
                    <h2 style="color:#c0392b">
                        <xsl:value-of select="title"/>
                    </h2>
                    <h3 style="color:#e74c3c">
                        <xsl:value-of select="subtitle"/>
                    </h3>
                </div>
            </div>
            <div class="row">
                <xsl:apply-templates select="authors"/>
            </div>
            <div class="row" style="margin-top:30px">
                <div class="col-md-12">
                    <div class="row">
                        <h4>
                            <xsl:value-of select="date"/>
                        </h4>
                    </div>
                    <div class="row">
                        <h4>
                            <xsl:value-of select="affil"/>
                        </h4>
                    </div>
                </div>
            </div>
        </div>
    </xsl:template>

    <xsl:template match="authors">
        <div class="col-md-6 col-center">
            <xsl:apply-templates select="//author"/>
        </div>
    </xsl:template>

    <xsl:template match="author">
        <div class="col-md-4">
            <div class="row">
                <strong>
                    <xsl:value-of select="name"/>
                </strong>
            </div>
            <div class="row">
                <xsl:value-of select="identifier"/>
            </div>
            <div class="row">
                <a href="mailto:{email}">
                    <xsl:value-of select="email"/>
                </a>
            </div>
            <div class="row">
                <img style="width: 100px" src="{photo/@path}"/>
            </div>
        </div>
    </xsl:template>

    <xsl:template match="body">
        <div class="col-md-12">
            <xsl:apply-templates select="section"/>
        </div>
    </xsl:template>

    <xsl:template match="section">
        <a name="{generate-id()}"/>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="section/title">
        <h2 style="color:#c0392b">
            <xsl:value-of select="."/>
        </h2>
    </xsl:template>

    <xsl:template match="subsection">
        <a name="{generate-id()}"/>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="subsection/title">
        <h3 style="color:#e74c3c">
            <xsl:value-of select="."/>
        </h3>
    </xsl:template>

    <xsl:template match="subsubsection">
        <a name="{generate-id()}"/>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="subsubsection/title">
        <h4 style="color:#2ecc71">
            <xsl:value-of select="."/>
        </h4>
    </xsl:template>

    <xsl:template match="back-matter">
        <div class="col-md-12">
            <div class="row">
                <xsl:apply-templates/>
            </div>
        </div>
    </xsl:template>

    <!--*********************************
        Parágrafo
    **********************************-->

    <xsl:template match="p">
        <p>
            <xsl:apply-templates/>
        </p>
    </xsl:template>

    <xsl:template match="b">
        <strong>
            <xsl:apply-templates/>
        </strong>
    </xsl:template>

    <xsl:template match="i">
        <em>
            <xsl:apply-templates/>
        </em>
    </xsl:template>

    <xsl:template match="u">
        <u>
            <xsl:apply-templates/>
        </u>
    </xsl:template>

    <xsl:template match="xref">
        <a href="{@href}">
            <xsl:value-of select="."/>
        </a>
    </xsl:template>

    <xsl:template match="ackr">
        <abbr title="{@expansion}">
            <xsl:value-of select="."/>
        </abbr>
    </xsl:template>

    <xsl:template match="cite">
        <cite title="{@bibref}">
            <xsl:value-of select="."/>
        </cite>
    </xsl:template>

    <xsl:template match="code">
        <pre style="background-color:#F5FFFA">
            <xsl:value-of select="."/>
        </pre>
    </xsl:template>

    <!--*********************************
        Image
    **********************************-->
    <xsl:template match="image">
        <div class="col-center text-center">
            <a name="{generate-id()}"/>
            <img src="{@path}"/>
            <br/>
            <p style="font-size:11px"><xsl:value-of select="."/></p>
        </div>


    </xsl:template>

    <!--*********************************
        List
    **********************************-->

    <xsl:template match="ol">
        <ol>
            <xsl:apply-templates/>
        </ol>
    </xsl:template>

    <xsl:template match="ul">
        <ul>
            <xsl:apply-templates/>
        </ul>
    </xsl:template>

    <xsl:template match="dl">
        <dl>
            <xsl:apply-templates/>
        </dl>
    </xsl:template>

    <xsl:template match="dt">
        <dt>
            <xsl:value-of select="."/>
        </dt>
    </xsl:template>

    <xsl:template match="dd">
        <dd>
            <xsl:apply-templates/>
        </dd>
    </xsl:template>

    <xsl:template match="li">
        <li>
            <xsl:apply-templates/>
        </li>
    </xsl:template>

    <!--*********************************
        Table
    **********************************-->

    <xsl:template match="table">
        <table>
            <xsl:apply-templates/>
        </table>
    </xsl:template>

    <xsl:template match="th">
        <th>
            <xsl:value-of select="."/>
        </th>
    </xsl:template>

    <xsl:template match="td">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    

</xsl:stylesheet>
