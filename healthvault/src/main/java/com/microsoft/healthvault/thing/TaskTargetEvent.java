//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.thing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task"&gt;
 *                     A filter to be performed on a collection of health measurements or activities.
 *                     This determines which items should be further evaluated for task
 *                     occurrence and completion.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for task-target-event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="task-target-event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="element-xpath" type="{urn:com.microsoft.wc.thing.types}stringnznw"/>
 *         &lt;element name="is-negated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="element-values" type="{urn:com.microsoft.wc.thing.task}strings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task-target-event", namespace = "urn:com.microsoft.wc.thing.task", propOrder = {
    "elementXpath",
    "isNegated",
    "elementValues"
})
public class TaskTargetEvent {

    @XmlElement(name = "element-xpath", required = true)
    protected String elementXpath;
    @XmlElement(name = "is-negated")
    protected Boolean isNegated;
    @XmlElement(name = "element-values")
    protected Strings elementValues;

    /**
     * Gets the value of the elementXpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementXpath() {
        return elementXpath;
    }

    /**
     * Sets the value of the elementXpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementXpath(String value) {
        this.elementXpath = value;
    }

    /**
     * Gets the value of the isNegated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNegated() {
        return isNegated;
    }

    /**
     * Sets the value of the isNegated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNegated(Boolean value) {
        this.isNegated = value;
    }

    /**
     * Gets the value of the elementValues property.
     * 
     * @return
     *     possible object is
     *     {@link Strings }
     *     
     */
    public Strings getElementValues() {
        return elementValues;
    }

    /**
     * Sets the value of the elementValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strings }
     *     
     */
    public void setElementValues(Strings value) {
        this.elementValues = value;
    }

}
