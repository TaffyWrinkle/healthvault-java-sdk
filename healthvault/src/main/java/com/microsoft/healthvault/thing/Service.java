//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.thing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.CodableValue;
import com.microsoft.healthvault.types.DurationValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.explanation-of-benefits"&gt;
 *                     Information about a specific service..
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service-type" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="diagnosis" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="billing-code" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="service-dates" type="{urn:com.microsoft.wc.thing.types}duration-value"/>
 *         &lt;element name="claim-amounts" type="{urn:com.microsoft.wc.thing.explanation-of-benefits}ClaimAmounts"/>
 *         &lt;element name="notes" type="{urn:com.microsoft.wc.thing.types}stringnznw" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", namespace = "urn:com.microsoft.wc.thing.explanation-of-benefits", propOrder = {
    "serviceType",
    "diagnosis",
    "billingCode",
    "serviceDates",
    "claimAmounts",
    "notes"
})
public class Service {

    @XmlElement(name = "service-type", required = true)
    protected CodableValue serviceType;
    protected CodableValue diagnosis;
    @XmlElement(name = "billing-code")
    protected CodableValue billingCode;
    @XmlElement(name = "service-dates", required = true)
    protected DurationValue serviceDates;
    @XmlElement(name = "claim-amounts", required = true)
    protected ClaimAmounts claimAmounts;
    protected List<String> notes;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setServiceType(CodableValue value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the diagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the value of the diagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setDiagnosis(CodableValue value) {
        this.diagnosis = value;
    }

    /**
     * Gets the value of the billingCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getBillingCode() {
        return billingCode;
    }

    /**
     * Sets the value of the billingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setBillingCode(CodableValue value) {
        this.billingCode = value;
    }

    /**
     * Gets the value of the serviceDates property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getServiceDates() {
        return serviceDates;
    }

    /**
     * Sets the value of the serviceDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setServiceDates(DurationValue value) {
        this.serviceDates = value;
    }

    /**
     * Gets the value of the claimAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimAmounts }
     *     
     */
    public ClaimAmounts getClaimAmounts() {
        return claimAmounts;
    }

    /**
     * Sets the value of the claimAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimAmounts }
     *     
     */
    public void setClaimAmounts(ClaimAmounts value) {
        this.claimAmounts = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotes() {
        if (notes == null) {
            notes = new ArrayList<String>();
        }
        return this.notes;
    }

}
