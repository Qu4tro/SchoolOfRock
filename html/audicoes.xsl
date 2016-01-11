<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:output method="text"/>
    
    <xsl:template match="/">
        <xsl:result-document href="listarAudicoes.js">
            var ids= [<xsl:apply-templates select="//audicao"/>];
            var nomes=[<xsl:apply-templates select="//nome"/>];
            var datas = [<xsl:apply-templates select="//data"/>];
            var locais = [<xsl:apply-templates select="//local"/>];
        </xsl:result-document>
    </xsl:template>
    
    <xsl:template match="audicao">"<xsl:value-of select="./@id"/>",
    </xsl:template>
    <xsl:template match="nome">"<xsl:value-of select="."/>",
    </xsl:template>
    <xsl:template match="data">"<xsl:value-of select="."/>",
    </xsl:template>
    <xsl:template match="local">"<xsl:value-of select="."/>",
    </xsl:template>
</xsl:stylesheet>