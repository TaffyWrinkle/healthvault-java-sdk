//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.core.location;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     The list of application supported record locations.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AppSupportedRecordLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppSupportedRecordLocations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="app-supported-record-location" type="{urn:com.microsoft.wc.location}AppSupportedRecordLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppSupportedRecordLocations", namespace = "urn:com.microsoft.wc.location", propOrder = {
    "appSupportedRecordLocation"
})
public class AppSupportedRecordLocations {

    @XmlElement(name = "app-supported-record-location")
    protected List<AppSupportedRecordLocation> appSupportedRecordLocation;

    /**
     * Gets the value of the appSupportedRecordLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appSupportedRecordLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppSupportedRecordLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppSupportedRecordLocation }
     * 
     * 
     */
    public List<AppSupportedRecordLocation> getAppSupportedRecordLocation() {
        if (appSupportedRecordLocation == null) {
            appSupportedRecordLocation = new ArrayList<AppSupportedRecordLocation>();
        }
        return this.appSupportedRecordLocation;
    }

}
