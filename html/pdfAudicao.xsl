<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
    <xsl:output indent="yes"/>
    <xsl:strip-space elements="*"/>
    
    <xsl:variable name="alunos_info" select="document('alunos.xml')"/>
    <xsl:variable name="professores_info" select="document('professores.xml')"/>
    <xsl:variable name="obras_info" select="document('obras.xml')"/>
    
    <xsl:template match="node()|@*">
        <xsl:copy>
            <xsl:apply-templates select="node()|@*"/>
        </xsl:copy>
    </xsl:template>
    
    <xsl:template match="/audicoes">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="my-page" page-width="8.5in" page-height="11in">
                    <fo:region-body margin="1in" margin-top="1.5in" margin-bottom="1.5in"/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            
            <fo:page-sequence master-reference="my-page">
                <fo:flow flow-name="xsl-region-body">
                    <xsl:apply-templates/>
                </fo:flow>
            </fo:page-sequence>
            
        </fo:root>
    </xsl:template>
    
    <xsl:template match="audicao">
        <fo:block>
            <xsl:apply-templates/>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/nome">
        <fo:block text-align="center" font-family="sans-serif" font-size="36px" color="#E45F56">
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/local">
        <fo:block text-align="center" font-family="sans-serif" font-size="30px" color="#35404F">
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/data">
        <fo:block text-align="center" font-family="sans-serif" font-size="24px" color="#A8B6BF">
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/inicio">
        <fo:block text-align="center" font-family="sans-serif" font-size="18px">
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/atuacoes">
        <fo:table background-color="#4AAAA5" margin-top="7%">
            <fo:table-body>
                    <fo:table-row>
                        <xsl:apply-templates/>
                    </fo:table-row>
            </fo:table-body>
        </fo:table>
    </xsl:template>
    
    <xsl:template match="audicao/atuacoes/atuacao">
            <fo:table-cell>
                <xsl:apply-templates/>
            </fo:table-cell>
    </xsl:template>
    
    <xsl:template match="audicao/atuacoes/atuacao/nome">
        <fo:block text-align="center" font-family="sans-serif" font-size="30px" color="#35404F" margin-top="30%">
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/atuacoes/atuacao/alunos">
        <fo:block>
            <xsl:apply-templates/>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/atuacoes/atuacao/alunos/aluno">
        <fo:block text-align="center" font-family="sans-serif" font-size="14px" color="#35404F">
            <xsl:variable name="id" select="."/>
            <xsl:value-of select="$alunos_info/alunos/aluno[@id=$id]/nome"/>  (<xsl:value-of select="$alunos_info/alunos/aluno[@id=$id]/instrumento"/>)
            <xsl:if test="following-sibling::*" >
                &amp;
            </xsl:if>
        </fo:block>  
    </xsl:template>
    
    <xsl:template match="audicao/atuacoes/atuacao/professores">
        <fo:block>
            <xsl:apply-templates/>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/atuacoes/atuacao/professores/professor">
        <fo:block text-align="center" font-family="sans-serif" font-size="13px" color="#A3D39C">
            <xsl:variable name="id" select="."/>
            <xsl:value-of select="$professores_info/professores/professor[@id=$id]/nome"/>
            <xsl:if test="following-sibling::*" >
                &amp;
            </xsl:if>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/atuacoes/atuacao/obras">
        <fo:block margin-bottom="40%">
            <xsl:apply-templates/>
        </fo:block>
    </xsl:template>
    
    <xsl:template match="audicao/atuacoes/atuacao/obras/obra">
        <fo:block text-align="center" font-family="sans-serif" font-size="14px" color="#E45F56">
            <xsl:variable name="id" select="."/>
            <xsl:value-of select="$obras_info/obras/obra[@id=$id]/nome"/>
            <xsl:if test="following-sibling::*" >
                &amp;
            </xsl:if>
        </fo:block>  
    </xsl:template>
    
</xsl:stylesheet>