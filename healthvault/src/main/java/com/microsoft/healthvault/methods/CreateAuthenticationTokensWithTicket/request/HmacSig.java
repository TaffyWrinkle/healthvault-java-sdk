//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.CreateAuthenticationTokensWithTicket.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for HmacSig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HmacSig">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:com.microsoft.wc.types>string512">
 *       &lt;attribute name="algName" use="required" type="{urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket}hmac" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HmacSig", namespace = "urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket", propOrder = {
    "value"
})
public class HmacSig {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "algName", required = true)
    protected Hmac algName;

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"/&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"/&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the algName property.
     * 
     * @return
     *     possible object is
     *     {@link Hmac }
     *     
     */
    public Hmac getAlgName() {
        return algName;
    }

    /**
     * Sets the value of the algName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hmac }
     *     
     */
    public void setAlgName(Hmac value) {
        this.algName = value;
    }

}
