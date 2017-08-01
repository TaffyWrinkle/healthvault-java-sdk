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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.CodableValue;
import com.microsoft.healthvault.types.Contact;
import com.microsoft.healthvault.types.DurationValue;
import com.microsoft.healthvault.types.dates.ApproxDateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:med="urn:com.microsoft.wc.thing.medication" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Information related to a medication.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:med="urn:com.microsoft.wc.thing.medication" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Note: Please use the new version of this data type instead of this version.
 *                         &lt;br/&gt;
 *                         This thing type describes a medication a person has.
 *                     &lt;/remarks&gt;
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date-discontinued" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="date-filled" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="date-prescribed" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="is-prescribed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount-prescribed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dose-value" type="{urn:com.microsoft.wc.thing.medication}DoseValue" minOccurs="0"/>
 *         &lt;element name="dose-unit" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="strength-value" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="strength-unit" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="route" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration-unit" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="refills" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="refills-left" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="days-supply" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt" minOccurs="0"/>
 *         &lt;element name="prescription-duration" type="{urn:com.microsoft.wc.thing.types}duration-value" minOccurs="0"/>
 *         &lt;element name="instructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substitution-permitted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pharmacy" type="{urn:com.microsoft.wc.thing.types}contact" minOccurs="0"/>
 *         &lt;element name="prescription-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "name",
    "code",
    "dateDiscontinued",
    "dateFilled",
    "datePrescribed",
    "isPrescribed",
    "indication",
    "amountPrescribed",
    "doseValue",
    "doseUnit",
    "strengthValue",
    "strengthUnit",
    "frequency",
    "route",
    "duration",
    "durationUnit",
    "refills",
    "refillsLeft",
    "daysSupply",
    "prescriptionDuration",
    "instructions",
    "substitutionPermitted",
    "pharmacy",
    "prescriptionNumber"
})
@XmlRootElement(name = "medication", namespace = "urn:com.microsoft.wc.thing.medication")
public class Medication {

    protected String name;
    @XmlElement(type = Integer.class)
    protected List<Integer> code;
    @XmlElement(name = "date-discontinued")
    protected ApproxDateTime dateDiscontinued;
    @XmlElement(name = "date-filled")
    protected ApproxDateTime dateFilled;
    @XmlElement(name = "date-prescribed")
    protected ApproxDateTime datePrescribed;
    @XmlElement(name = "is-prescribed")
    protected Boolean isPrescribed;
    protected String indication;
    @XmlElement(name = "amount-prescribed")
    protected String amountPrescribed;
    @XmlElement(name = "dose-value")
    protected DoseValue doseValue;
    @XmlElement(name = "dose-unit")
    protected CodableValue doseUnit;
    @XmlElement(name = "strength-value")
    protected Integer strengthValue;
    @XmlElement(name = "strength-unit")
    protected CodableValue strengthUnit;
    protected String frequency;
    protected CodableValue route;
    protected String duration;
    @XmlElement(name = "duration-unit")
    protected CodableValue durationUnit;
    protected Integer refills;
    @XmlElement(name = "refills-left")
    protected Integer refillsLeft;
    @XmlElement(name = "days-supply")
    protected Integer daysSupply;
    @XmlElement(name = "prescription-duration")
    protected DurationValue prescriptionDuration;
    protected String instructions;
    @XmlElement(name = "substitution-permitted")
    protected Boolean substitutionPermitted;
    protected Contact pharmacy;
    @XmlElement(name = "prescription-number")
    protected String prescriptionNumber;

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
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCode() {
        if (code == null) {
            code = new ArrayList<Integer>();
        }
        return this.code;
    }

    /**
     * Gets the value of the dateDiscontinued property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getDateDiscontinued() {
        return dateDiscontinued;
    }

    /**
     * Sets the value of the dateDiscontinued property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setDateDiscontinued(ApproxDateTime value) {
        this.dateDiscontinued = value;
    }

    /**
     * Gets the value of the dateFilled property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getDateFilled() {
        return dateFilled;
    }

    /**
     * Sets the value of the dateFilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setDateFilled(ApproxDateTime value) {
        this.dateFilled = value;
    }

    /**
     * Gets the value of the datePrescribed property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getDatePrescribed() {
        return datePrescribed;
    }

    /**
     * Sets the value of the datePrescribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setDatePrescribed(ApproxDateTime value) {
        this.datePrescribed = value;
    }

    /**
     * Gets the value of the isPrescribed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrescribed() {
        return isPrescribed;
    }

    /**
     * Sets the value of the isPrescribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrescribed(Boolean value) {
        this.isPrescribed = value;
    }

    /**
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndication(String value) {
        this.indication = value;
    }

    /**
     * Gets the value of the amountPrescribed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountPrescribed() {
        return amountPrescribed;
    }

    /**
     * Sets the value of the amountPrescribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountPrescribed(String value) {
        this.amountPrescribed = value;
    }

    /**
     * Gets the value of the doseValue property.
     * 
     * @return
     *     possible object is
     *     {@link DoseValue }
     *     
     */
    public DoseValue getDoseValue() {
        return doseValue;
    }

    /**
     * Sets the value of the doseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoseValue }
     *     
     */
    public void setDoseValue(DoseValue value) {
        this.doseValue = value;
    }

    /**
     * Gets the value of the doseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getDoseUnit() {
        return doseUnit;
    }

    /**
     * Sets the value of the doseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setDoseUnit(CodableValue value) {
        this.doseUnit = value;
    }

    /**
     * Gets the value of the strengthValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrengthValue() {
        return strengthValue;
    }

    /**
     * Sets the value of the strengthValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrengthValue(Integer value) {
        this.strengthValue = value;
    }

    /**
     * Gets the value of the strengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getStrengthUnit() {
        return strengthUnit;
    }

    /**
     * Sets the value of the strengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setStrengthUnit(CodableValue value) {
        this.strengthUnit = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setRoute(CodableValue value) {
        this.route = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getDurationUnit() {
        return durationUnit;
    }

    /**
     * Sets the value of the durationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setDurationUnit(CodableValue value) {
        this.durationUnit = value;
    }

    /**
     * Gets the value of the refills property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefills() {
        return refills;
    }

    /**
     * Sets the value of the refills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefills(Integer value) {
        this.refills = value;
    }

    /**
     * Gets the value of the refillsLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefillsLeft() {
        return refillsLeft;
    }

    /**
     * Sets the value of the refillsLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefillsLeft(Integer value) {
        this.refillsLeft = value;
    }

    /**
     * Gets the value of the daysSupply property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysSupply() {
        return daysSupply;
    }

    /**
     * Sets the value of the daysSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysSupply(Integer value) {
        this.daysSupply = value;
    }

    /**
     * Gets the value of the prescriptionDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getPrescriptionDuration() {
        return prescriptionDuration;
    }

    /**
     * Sets the value of the prescriptionDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setPrescriptionDuration(DurationValue value) {
        this.prescriptionDuration = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions(String value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the substitutionPermitted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubstitutionPermitted() {
        return substitutionPermitted;
    }

    /**
     * Sets the value of the substitutionPermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubstitutionPermitted(Boolean value) {
        this.substitutionPermitted = value;
    }

    /**
     * Gets the value of the pharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getPharmacy() {
        return pharmacy;
    }

    /**
     * Sets the value of the pharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setPharmacy(Contact value) {
        this.pharmacy = value;
    }

    /**
     * Gets the value of the prescriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionNumber() {
        return prescriptionNumber;
    }

    /**
     * Sets the value of the prescriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionNumber(String value) {
        this.prescriptionNumber = value;
    }

}
