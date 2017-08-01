//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.CreatePersonAccount2.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.core.authentication.SimpleFacebookCredential;
import com.microsoft.healthvault.core.authentication.SimpleOpenIdCredential;
import com.microsoft.healthvault.core.authentication.SimplePassportCredential;
import com.microsoft.healthvault.core.authentication.UserPassCred;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.CreatePersonAccount2" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-person="urn:com.microsoft.wc.person" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     The primary set of credentials for the account that is
 *                     being created.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.CreatePersonAccount2" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-person="urn:com.microsoft.wc.person" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     When an account is created a set of credentials must be
 *                     associated with the account. These credentials allow the
 *                     person to logon and if desired associate other credentials
 *                     with the account.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PrimaryCredential complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimaryCredential">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="simple-encrypted" type="{urn:com.microsoft.wc.types}stringnz"/>
 *           &lt;element name="simple-userpass" type="{urn:com.microsoft.wc.auth}UserPassCred"/>
 *           &lt;element name="simple-passport" type="{urn:com.microsoft.wc.auth}SimplePassportCredential"/>
 *           &lt;element name="simple-openid" type="{urn:com.microsoft.wc.auth}SimpleOpenIdCredential"/>
 *           &lt;element name="simple-facebook" type="{urn:com.microsoft.wc.auth}SimpleFacebookCredential"/>
 *         &lt;/choice>
 *         &lt;element name="credential-name" type="{urn:com.microsoft.wc.types}string128" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryCredential", namespace = "urn:com.microsoft.wc.methods.CreatePersonAccount2", propOrder = {
    "simpleEncrypted",
    "simpleUserpass",
    "simplePassport",
    "simpleOpenid",
    "simpleFacebook",
    "credentialName"
})
public class PrimaryCredential {

    @XmlElement(name = "simple-encrypted")
    protected String simpleEncrypted;
    @XmlElement(name = "simple-userpass")
    protected UserPassCred simpleUserpass;
    @XmlElement(name = "simple-passport")
    protected SimplePassportCredential simplePassport;
    @XmlElement(name = "simple-openid")
    protected SimpleOpenIdCredential simpleOpenid;
    @XmlElement(name = "simple-facebook")
    protected SimpleFacebookCredential simpleFacebook;
    @XmlElement(name = "credential-name")
    protected String credentialName;

    /**
     * Gets the value of the simpleEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleEncrypted() {
        return simpleEncrypted;
    }

    /**
     * Sets the value of the simpleEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleEncrypted(String value) {
        this.simpleEncrypted = value;
    }

    /**
     * Gets the value of the simpleUserpass property.
     * 
     * @return
     *     possible object is
     *     {@link UserPassCred }
     *     
     */
    public UserPassCred getSimpleUserpass() {
        return simpleUserpass;
    }

    /**
     * Sets the value of the simpleUserpass property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPassCred }
     *     
     */
    public void setSimpleUserpass(UserPassCred value) {
        this.simpleUserpass = value;
    }

    /**
     * Gets the value of the simplePassport property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePassportCredential }
     *     
     */
    public SimplePassportCredential getSimplePassport() {
        return simplePassport;
    }

    /**
     * Sets the value of the simplePassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePassportCredential }
     *     
     */
    public void setSimplePassport(SimplePassportCredential value) {
        this.simplePassport = value;
    }

    /**
     * Gets the value of the simpleOpenid property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleOpenIdCredential }
     *     
     */
    public SimpleOpenIdCredential getSimpleOpenid() {
        return simpleOpenid;
    }

    /**
     * Sets the value of the simpleOpenid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleOpenIdCredential }
     *     
     */
    public void setSimpleOpenid(SimpleOpenIdCredential value) {
        this.simpleOpenid = value;
    }

    /**
     * Gets the value of the simpleFacebook property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleFacebookCredential }
     *     
     */
    public SimpleFacebookCredential getSimpleFacebook() {
        return simpleFacebook;
    }

    /**
     * Sets the value of the simpleFacebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleFacebookCredential }
     *     
     */
    public void setSimpleFacebook(SimpleFacebookCredential value) {
        this.simpleFacebook = value;
    }

    /**
     * Gets the value of the credentialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialName() {
        return credentialName;
    }

    /**
     * Sets the value of the credentialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialName(String value) {
        this.credentialName = value;
    }

}
