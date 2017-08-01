//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.core.application;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.healthvault.types.CultureSpecificString;
import com.microsoft.healthvault.types.CultureSpecificString255;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for App complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="App">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.types}CultureSpecificString255" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="app-auth-required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="restrict-app-users" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is-published" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="action-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:com.microsoft.wc.types}CultureSpecificString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auth-reason" type="{urn:com.microsoft.wc.types}CultureSpecificString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="domain-name" type="{urn:com.microsoft.wc.types}string255" minOccurs="0"/>
 *         &lt;element name="client-service-token" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="persistent-tokens" type="{urn:com.microsoft.wc.application}AppPersistentTokens" minOccurs="0"/>
 *         &lt;element name="privacy-statement" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="terms-of-use" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="dtc-success-message" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="app-attributes" type="{urn:com.microsoft.wc.application}ApplicationAttributes" minOccurs="0"/>
 *         &lt;element name="app-type" type="{urn:com.microsoft.wc.types}string32"/>
 *         &lt;element name="master-app-id" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="master-app-name" type="{urn:com.microsoft.wc.types}CultureSpecificString255" minOccurs="0"/>
 *         &lt;element name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updated-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bulk-extraction-settings" type="{urn:com.microsoft.wc.application}BulkExtractionSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "App", namespace = "urn:com.microsoft.wc.application", propOrder = {
    "id",
    "name",
    "appAuthRequired",
    "restrictAppUsers",
    "isPublished",
    "actionUrl",
    "description",
    "authReason",
    "domainName",
    "clientServiceToken",
    "persistentTokens",
    "privacyStatement",
    "termsOfUse",
    "dtcSuccessMessage",
    "appAttributes",
    "appType",
    "masterAppId",
    "masterAppName",
    "createdDate",
    "updatedDate",
    "bulkExtractionSettings"
})
public class App {

    @XmlElement(required = true)
    protected String id;
    protected List<CultureSpecificString255> name;
    @XmlElement(name = "app-auth-required")
    protected boolean appAuthRequired;
    @XmlElement(name = "restrict-app-users")
    protected boolean restrictAppUsers;
    @XmlElement(name = "is-published")
    protected boolean isPublished;
    @XmlElement(name = "action-url")
    protected String actionUrl;
    protected List<CultureSpecificString> description;
    @XmlElement(name = "auth-reason")
    protected List<CultureSpecificString> authReason;
    @XmlElement(name = "domain-name")
    protected String domainName;
    @XmlElement(name = "client-service-token")
    protected String clientServiceToken;
    @XmlElement(name = "persistent-tokens")
    protected AppPersistentTokens persistentTokens;
    @XmlElement(name = "privacy-statement")
    protected StatementInfo privacyStatement;
    @XmlElement(name = "terms-of-use")
    protected StatementInfo termsOfUse;
    @XmlElement(name = "dtc-success-message")
    protected StatementInfo dtcSuccessMessage;
    @XmlElement(name = "app-attributes")
    protected ApplicationAttributes appAttributes;
    @XmlElement(name = "app-type", required = true)
    protected String appType;
    @XmlElement(name = "master-app-id")
    protected String masterAppId;
    @XmlElement(name = "master-app-name")
    protected CultureSpecificString255 masterAppName;
    @XmlElement(name = "created-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "updated-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    @XmlElement(name = "bulk-extraction-settings")
    protected BulkExtractionSettings bulkExtractionSettings;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificString255 }
     * 
     * 
     */
    public List<CultureSpecificString255> getName() {
        if (name == null) {
            name = new ArrayList<CultureSpecificString255>();
        }
        return this.name;
    }

    /**
     * Gets the value of the appAuthRequired property.
     * 
     */
    public boolean isAppAuthRequired() {
        return appAuthRequired;
    }

    /**
     * Sets the value of the appAuthRequired property.
     * 
     */
    public void setAppAuthRequired(boolean value) {
        this.appAuthRequired = value;
    }

    /**
     * Gets the value of the restrictAppUsers property.
     * 
     */
    public boolean isRestrictAppUsers() {
        return restrictAppUsers;
    }

    /**
     * Sets the value of the restrictAppUsers property.
     * 
     */
    public void setRestrictAppUsers(boolean value) {
        this.restrictAppUsers = value;
    }

    /**
     * Gets the value of the isPublished property.
     * 
     */
    public boolean isIsPublished() {
        return isPublished;
    }

    /**
     * Sets the value of the isPublished property.
     * 
     */
    public void setIsPublished(boolean value) {
        this.isPublished = value;
    }

    /**
     * Gets the value of the actionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionUrl() {
        return actionUrl;
    }

    /**
     * Sets the value of the actionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionUrl(String value) {
        this.actionUrl = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificString }
     * 
     * 
     */
    public List<CultureSpecificString> getDescription() {
        if (description == null) {
            description = new ArrayList<CultureSpecificString>();
        }
        return this.description;
    }

    /**
     * Gets the value of the authReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificString }
     * 
     * 
     */
    public List<CultureSpecificString> getAuthReason() {
        if (authReason == null) {
            authReason = new ArrayList<CultureSpecificString>();
        }
        return this.authReason;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the clientServiceToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientServiceToken() {
        return clientServiceToken;
    }

    /**
     * Sets the value of the clientServiceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientServiceToken(String value) {
        this.clientServiceToken = value;
    }

    /**
     * Gets the value of the persistentTokens property.
     * 
     * @return
     *     possible object is
     *     {@link AppPersistentTokens }
     *     
     */
    public AppPersistentTokens getPersistentTokens() {
        return persistentTokens;
    }

    /**
     * Sets the value of the persistentTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppPersistentTokens }
     *     
     */
    public void setPersistentTokens(AppPersistentTokens value) {
        this.persistentTokens = value;
    }

    /**
     * Gets the value of the privacyStatement property.
     * 
     * @return
     *     possible object is
     *     {@link StatementInfo }
     *     
     */
    public StatementInfo getPrivacyStatement() {
        return privacyStatement;
    }

    /**
     * Sets the value of the privacyStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementInfo }
     *     
     */
    public void setPrivacyStatement(StatementInfo value) {
        this.privacyStatement = value;
    }

    /**
     * Gets the value of the termsOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link StatementInfo }
     *     
     */
    public StatementInfo getTermsOfUse() {
        return termsOfUse;
    }

    /**
     * Sets the value of the termsOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementInfo }
     *     
     */
    public void setTermsOfUse(StatementInfo value) {
        this.termsOfUse = value;
    }

    /**
     * Gets the value of the dtcSuccessMessage property.
     * 
     * @return
     *     possible object is
     *     {@link StatementInfo }
     *     
     */
    public StatementInfo getDtcSuccessMessage() {
        return dtcSuccessMessage;
    }

    /**
     * Sets the value of the dtcSuccessMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementInfo }
     *     
     */
    public void setDtcSuccessMessage(StatementInfo value) {
        this.dtcSuccessMessage = value;
    }

    /**
     * Gets the value of the appAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationAttributes }
     *     
     */
    public ApplicationAttributes getAppAttributes() {
        return appAttributes;
    }

    /**
     * Sets the value of the appAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationAttributes }
     *     
     */
    public void setAppAttributes(ApplicationAttributes value) {
        this.appAttributes = value;
    }

    /**
     * Gets the value of the appType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppType() {
        return appType;
    }

    /**
     * Sets the value of the appType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppType(String value) {
        this.appType = value;
    }

    /**
     * Gets the value of the masterAppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterAppId() {
        return masterAppId;
    }

    /**
     * Sets the value of the masterAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterAppId(String value) {
        this.masterAppId = value;
    }

    /**
     * Gets the value of the masterAppName property.
     * 
     * @return
     *     possible object is
     *     {@link CultureSpecificString255 }
     *     
     */
    public CultureSpecificString255 getMasterAppName() {
        return masterAppName;
    }

    /**
     * Sets the value of the masterAppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CultureSpecificString255 }
     *     
     */
    public void setMasterAppName(CultureSpecificString255 value) {
        this.masterAppName = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the bulkExtractionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link BulkExtractionSettings }
     *     
     */
    public BulkExtractionSettings getBulkExtractionSettings() {
        return bulkExtractionSettings;
    }

    /**
     * Sets the value of the bulkExtractionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkExtractionSettings }
     *     
     */
    public void setBulkExtractionSettings(BulkExtractionSettings value) {
        this.bulkExtractionSettings = value;
    }

}
