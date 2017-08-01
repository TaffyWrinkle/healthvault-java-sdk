//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetApplication.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.core.application.AppWithLogos;
import com.microsoft.healthvault.core.application.StatementInfo;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetApplication" xmlns:wc-app="urn:com.microsoft.wc.application" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *           The extended application data.
 *         &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Application complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.microsoft.wc.application}AppWithLogos">
 *       &lt;sequence>
 *         &lt;element name="eprep-welcome" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="eprep-description" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application", namespace = "urn:com.microsoft.wc.methods.response.GetApplication", propOrder = {
    "eprepWelcome",
    "eprepDescription"
})
public class Application
    extends AppWithLogos
{

    @XmlElement(name = "eprep-welcome")
    protected StatementInfo eprepWelcome;
    @XmlElement(name = "eprep-description")
    protected StatementInfo eprepDescription;

    /**
     * Gets the value of the eprepWelcome property.
     * 
     * @return
     *     possible object is
     *     {@link StatementInfo }
     *     
     */
    public StatementInfo getEprepWelcome() {
        return eprepWelcome;
    }

    /**
     * Sets the value of the eprepWelcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementInfo }
     *     
     */
    public void setEprepWelcome(StatementInfo value) {
        this.eprepWelcome = value;
    }

    /**
     * Gets the value of the eprepDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StatementInfo }
     *     
     */
    public StatementInfo getEprepDescription() {
        return eprepDescription;
    }

    /**
     * Sets the value of the eprepDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementInfo }
     *     
     */
    public void setEprepDescription(StatementInfo value) {
        this.eprepDescription = value;
    }

}
