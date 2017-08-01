//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetApplicationDirectory.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:directory="urn:com.microsoft.wc.directory" xmlns:this="urn:com.microsoft.wc.methods.response.GetApplicationDirectory" xmlns:wc-application="urn:com.microsoft.wc.application" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *             The application directory items returned for HealthVault.
 *           &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="application-directory" type="{urn:com.microsoft.wc.methods.response.GetApplicationDirectory}ApplicationDirectory" minOccurs="0"/>
 *         &lt;element name="application-directory-id-cursor" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationDirectory",
    "applicationDirectoryIdCursor"
})
public class GetApplicationDirectoryResponse {

    @XmlElement(name = "application-directory")
    protected ApplicationDirectory applicationDirectory;
    @XmlElement(name = "application-directory-id-cursor")
    protected String applicationDirectoryIdCursor;

    /**
     * Gets the value of the applicationDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDirectory }
     *     
     */
    public ApplicationDirectory getApplicationDirectory() {
        return applicationDirectory;
    }

    /**
     * Sets the value of the applicationDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDirectory }
     *     
     */
    public void setApplicationDirectory(ApplicationDirectory value) {
        this.applicationDirectory = value;
    }

    /**
     * Gets the value of the applicationDirectoryIdCursor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDirectoryIdCursor() {
        return applicationDirectoryIdCursor;
    }

    /**
     * Sets the value of the applicationDirectoryIdCursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDirectoryIdCursor(String value) {
        this.applicationDirectoryIdCursor = value;
    }

}
