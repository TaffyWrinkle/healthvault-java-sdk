//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.core.meaningfuluse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.MeaningfulUse" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Specifies filters for the DOPU report data to be returned.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.MeaningfulUse" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DopuDocumentFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DopuDocumentFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="available-date-filter" type="{urn:com.microsoft.wc.MeaningfulUse}DateFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DopuDocumentFilter", namespace = "urn:com.microsoft.wc.MeaningfulUse", propOrder = {
    "availableDateFilter"
})
public class DopuDocumentFilter {

    @XmlElement(name = "available-date-filter", required = true)
    protected DateFilter availableDateFilter;

    /**
     * Gets the value of the availableDateFilter property.
     * 
     * @return
     *     possible object is
     *     {@link DateFilter }
     *     
     */
    public DateFilter getAvailableDateFilter() {
        return availableDateFilter;
    }

    /**
     * Sets the value of the availableDateFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFilter }
     *     
     */
    public void setAvailableDateFilter(DateFilter value) {
        this.availableDateFilter = value;
    }

}