//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.vocabulary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.CodableValueDeprecated;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.vocab" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     The strength of the medication is how much drug a specific unit of a medication contains.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.vocab" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     For example, Tylenol 500 MG Tablet, 500 MG is the name.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for medication-strength complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medication-strength">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="display-text" type="{urn:com.microsoft.wc.types}stringnz"/>
 *         &lt;element name="value" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="unit" type="{urn:com.microsoft.wc.types}codable-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medication-strength", namespace = "urn:com.microsoft.wc.vocab", propOrder = {
    "displayText",
    "value",
    "unit"
})
public class MedicationStrength {

    @XmlElement(name = "display-text", required = true)
    protected String displayText;
    protected String value;
    protected CodableValueDeprecated unit;

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the value property.
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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValueDeprecated }
     *     
     */
    public CodableValueDeprecated getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValueDeprecated }
     *     
     */
    public void setUnit(CodableValueDeprecated value) {
        this.unit = value;
    }

}
