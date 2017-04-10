//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.07 at 02:23:59 PM PDT 
//


package com.microsoft.hsg.thing.oxm.jaxb.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
 *                     Basic information about a person.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
 *                     Basic information about a person including their
 *                     name, login name, email address, application
 *                     specific settings, record selected for use by the
 *                     application, and other records that are the person
 *                     authorized the application to use.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person-id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.types}string255"/>
 *         &lt;element name="app-settings" type="{urn:com.microsoft.wc.types}AppSettings" minOccurs="0"/>
 *         &lt;element name="selected-record-id" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="more-records" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="record" type="{urn:com.microsoft.wc.types}Record" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groups" type="{urn:com.microsoft.wc.types}Groups" minOccurs="0"/>
 *         &lt;element name="preferred-culture" type="{urn:com.microsoft.wc.types}Culture" minOccurs="0"/>
 *         &lt;element name="preferred-uiculture" type="{urn:com.microsoft.wc.types}Culture" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:com.microsoft.wc.types}Location" minOccurs="0"/>
 *         &lt;element name="effective-record-permission-list" type="{urn:com.microsoft.wc.types}EffectiveRecordPermissionList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfo", propOrder = {
    "personId",
    "name",
    "appSettings",
    "selectedRecordId",
    "moreRecords",
    "record",
    "groups",
    "preferredCulture",
    "preferredUiculture",
    "location",
    "effectiveRecordPermissionList"
})
public class PersonInfo {

    @XmlElement(name = "person-id", required = true)
    protected String personId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "app-settings")
    protected AppSettings appSettings;
    @XmlElement(name = "selected-record-id")
    protected String selectedRecordId;
    @XmlElement(name = "more-records")
    protected Boolean moreRecords;
    protected List<Record> record;
    protected Groups groups;
    @XmlElement(name = "preferred-culture")
    protected Culture preferredCulture;
    @XmlElement(name = "preferred-uiculture")
    protected Culture preferredUiculture;
    protected Location location;
    @XmlElement(name = "effective-record-permission-list")
    protected EffectiveRecordPermissionList effectiveRecordPermissionList;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the appSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AppSettings }
     *     
     */
    public AppSettings getAppSettings() {
        return appSettings;
    }

    /**
     * Sets the value of the appSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppSettings }
     *     
     */
    public void setAppSettings(AppSettings value) {
        this.appSettings = value;
    }

    /**
     * Gets the value of the selectedRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedRecordId() {
        return selectedRecordId;
    }

    /**
     * Sets the value of the selectedRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedRecordId(String value) {
        this.selectedRecordId = value;
    }

    /**
     * Gets the value of the moreRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreRecords() {
        return moreRecords;
    }

    /**
     * Sets the value of the moreRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreRecords(Boolean value) {
        this.moreRecords = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the record property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Record }
     * 
     * 
     */
    public List<Record> getRecord() {
        if (record == null) {
            record = new ArrayList<Record>();
        }
        return this.record;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroups(Groups value) {
        this.groups = value;
    }

    /**
     * Gets the value of the preferredCulture property.
     * 
     * @return
     *     possible object is
     *     {@link Culture }
     *     
     */
    public Culture getPreferredCulture() {
        return preferredCulture;
    }

    /**
     * Sets the value of the preferredCulture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Culture }
     *     
     */
    public void setPreferredCulture(Culture value) {
        this.preferredCulture = value;
    }

    /**
     * Gets the value of the preferredUiculture property.
     * 
     * @return
     *     possible object is
     *     {@link Culture }
     *     
     */
    public Culture getPreferredUiculture() {
        return preferredUiculture;
    }

    /**
     * Sets the value of the preferredUiculture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Culture }
     *     
     */
    public void setPreferredUiculture(Culture value) {
        this.preferredUiculture = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the effectiveRecordPermissionList property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveRecordPermissionList }
     *     
     */
    public EffectiveRecordPermissionList getEffectiveRecordPermissionList() {
        return effectiveRecordPermissionList;
    }

    /**
     * Sets the value of the effectiveRecordPermissionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveRecordPermissionList }
     *     
     */
    public void setEffectiveRecordPermissionList(EffectiveRecordPermissionList value) {
        this.effectiveRecordPermissionList = value;
    }

}