//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//


package com.microsoft.hsg.methods.jaxb.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Represents the confirmed claimed id of a user who
 *                     has been authenticated to an Open Id Provider.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Authentication is performed to an Open Id Provider through
 *                     Shell which passes it to platform for verification 
 *                     against a HealthVault account.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SimpleOpenIdCredential complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleOpenIdCredential">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimed-id" type="{urn:com.microsoft.wc.types}string128"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleOpenIdCredential", propOrder = {
    "claimedId"
})
public class SimpleOpenIdCredential {

    @XmlElement(name = "claimed-id", required = true)
    protected String claimedId;

    /**
     * Gets the value of the claimedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimedId() {
        return claimedId;
    }

    /**
     * Sets the value of the claimedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimedId(String value) {
        this.claimedId = value;
    }

}