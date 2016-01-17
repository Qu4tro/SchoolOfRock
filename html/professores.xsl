<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="1.0">
    
    <xsl:output method="text"/>
    
    <xsl:template match="/">
            var ids= [<xsl:apply-templates select="//professor"/>];
            var nomes=[<xsl:apply-templates select="//nome"/>];
            var cursos = [<xsl:apply-templates select="//curso"/>];
    </xsl:template>
    
    <xsl:template match="professor">"<xsl:value-of select="./@id"/>",
    </xsl:template>
    <xsl:template match="nome">"<xsl:value-of select="."/>",
    </xsl:template>
    <xsl:template match="curso">"<xsl:value-of select="."/>",
    </xsl:template>
</xsl:stylesheet>