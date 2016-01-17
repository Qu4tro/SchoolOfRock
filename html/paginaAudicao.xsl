<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="1.0">
    
    <xsl:output method="html"/>
    
    <xsl:variable name="alunos_info" select="document('alunos.xml')"/>
    <xsl:variable name="professores_info" select="document('professores.xml')"/>
    <xsl:variable name="obras_info" select="document('obras.xml')"/>
    
    <xsl:template match="/">
            <html>
                <head>
                    <meta charset="utf-8"/>
                    <meta name="viewport" content="width=device-width"/>
                    <link rel="stylesheet" href="audicao.css" type="text/css" media="all"/>
                    <title>Audição</title>
                </head>
                <body>
                    <xsl:apply-templates/>
                </body>
            </html>
    </xsl:template>
    
    <xsl:template match="audicao">
        <center><div><xsl:apply-templates/></div></center>
    </xsl:template>
    
    <xsl:template match="audicao/nome">
        <h1><xsl:value-of select="."/></h1>
    </xsl:template>
    
    <xsl:template match="audicao/data">
        <h2><xsl:value-of select="."/></h2>
    </xsl:template>
    
    <xsl:template match="audicao/inicio">
        <h4>às <xsl:value-of select="."/></h4>
    </xsl:template>
    
    <xsl:template match="audicao/local">
        <h3><xsl:value-of select="."/></h3> 
    </xsl:template>
    
    <xsl:template match="audicao/duracao"/>
    
    <xsl:template match="audicao/atuacoes/atuacao/duracao"/>
    
    <xsl:template match="atuacoes">
        <div style="background-color:#4AAAA5;" class="row">
            <xsl:apply-templates/>
        </div>
    </xsl:template>

    <xsl:template match="atuacoes/atuacao">
        <div class="col-md-4">
            <xsl:apply-templates/>
        </div>
    </xsl:template>
    
    <xsl:template match="atuacoes/atuacao/nome">
        <h2 style="margin-top:15%"><xsl:value-of select="."/></h2>
    </xsl:template>
    
    
    <xsl:template match="atuacoes/atuacao/alunos">
        <p style="color:#E45F56">Com a participação de:</p><xsl:apply-templates/>
    </xsl:template>
  
    <xsl:template match="atuacoes/atuacao/alunos/aluno">
        <xsl:variable name="id" select="."/>
        <p style="color:#35404F"><xsl:value-of select="$alunos_info/alunos/aluno[@id=$id]/nome"/>  (<xsl:value-of select="$alunos_info/alunos/aluno[@id=$id]/instrumento"/>)</p>
    </xsl:template>
    
    <xsl:template match="atuacoes/atuacao/professores">
        <p style="color:#A3D39C;font-size:13px">(Orientado por <xsl:apply-templates/>)</p>
    </xsl:template>
    
    <xsl:template match="atuacoes/atuacao/professores/professor">
        <xsl:variable name="id" select="."/>
        <xsl:value-of select="$professores_info/professores/professor[@id=$id]/nome"/>
        <xsl:if test="following-sibling::*" >
            &amp;
        </xsl:if>
    </xsl:template>
    
    <xsl:template match="atuacoes/atuacao/obras">
        <p style="margin-bottom:20%">em <xsl:apply-templates/></p>
    </xsl:template>
    
    <xsl:template match="atuacoes/atuacao/obras/obra">
        <xsl:variable name="id" select="."/>
        <xsl:value-of select="$obras_info/obras/obra[@id=$id]/nome"/>
        <xsl:if test="following-sibling::*" >
            &amp;
        </xsl:if>
    </xsl:template>
    
</xsl:stylesheet>