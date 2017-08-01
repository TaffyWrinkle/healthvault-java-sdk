//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetClaims.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.core.authentication.AuthXml;


/**
 * <p>Java class for AppRecordAuth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppRecordAuth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person-online-auth-xml" type="{urn:com.microsoft.wc.auth}AuthXml" minOccurs="0"/>
 *         &lt;element name="person-offline-auth-xml" type="{urn:com.microsoft.wc.auth}AuthXml" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppRecordAuth", namespace = "urn:com.microsoft.wc.methods.response.GetClaims", propOrder = {
    "personOnlineAuthXml",
    "personOfflineAuthXml"
})
public class AppRecordAuth {

    @XmlElement(name = "person-online-auth-xml")
    protected AuthXml personOnlineAuthXml;
    @XmlElement(name = "person-offline-auth-xml")
    protected AuthXml personOfflineAuthXml;

    /**
     * Gets the value of the personOnlineAuthXml property.
     * 
     * @return
     *     possible object is
     *     {@link AuthXml }
     *     
     */
    public AuthXml getPersonOnlineAuthXml() {
        return personOnlineAuthXml;
    }

    /**
     * Sets the value of the personOnlineAuthXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthXml }
     *     
     */
    public void setPersonOnlineAuthXml(AuthXml value) {
        this.personOnlineAuthXml = value;
    }

    /**
     * Gets the value of the personOfflineAuthXml property.
     * 
     * @return
     *     possible object is
     *     {@link AuthXml }
     *     
     */
    public AuthXml getPersonOfflineAuthXml() {
        return personOfflineAuthXml;
    }

    /**
     * Sets the value of the personOfflineAuthXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthXml }
     *     
     */
    public void setPersonOfflineAuthXml(AuthXml value) {
        this.personOfflineAuthXml = value;
    }

}
