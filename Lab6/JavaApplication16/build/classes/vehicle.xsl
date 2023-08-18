<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : vehicle.xsl
    Created on : August 18, 2023, 11:51 AM
    Author     : user1
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>vehicle.xsl</title>
            </head>
            <body>
                <table border="1">
                    <tr>
                        <td>Firstname</td>
                        <td>Lastname</td>
                  
                        <td>Fuel</td>
                    
                        <td>Cylinder</td>
                    
                        <td>Size</td>
                   
                        <td>Model</td>
                    
                        <td>Color</td>
                        <td>Year</td>
                        <td>Brand</td>
                    </tr>
                    <xsl:for-each select="vehicle">
                        <tr>
                            <td>
                                <xsl:value-of select="Owner/Firstname"/>
                            </td>
                            <td>
                                <xsl:value-of select="Owner/Lastname"/>
                            </td>
                            <td>
                                <xsl:value-of select="Engine/Fuel"/>
                            </td>
                            <td>
                                <xsl:value-of select="Engine/Cylinder"/>
                            </td>
                            <td>
                                <xsl:value-of select="Engine/Size"/>
                            </td>
                            <td>
                                <xsl:value-of select="Model"/>
                            </td>
                             <td>
                                <xsl:value-of select="Color"/>
                            </td>
                             <td>
                                <xsl:value-of select="year"/>
                            </td>
                             <td>
                                <xsl:value-of select="Brand"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                    
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
