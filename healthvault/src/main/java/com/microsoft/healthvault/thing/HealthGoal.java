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
import com.microsoft.healthvault.types.dates.ApproxDateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.goal"&gt;
 *             A health goal defines a target for a measurement or action to be performed by a user.
 *           &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.goal"&gt;
 *             Example goals: maintain averge blood glucose level below 90 mg/dl, walk 1000 steps per day. 
 *           &lt;/remarks&gt;
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
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="end-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="associated-type-info" type="{urn:com.microsoft.wc.thing.goal}goal-associated-type-info" minOccurs="0"/>
 *         &lt;element name="target-range" type="{urn:com.microsoft.wc.thing.goal}goal-range" minOccurs="0"/>
 *         &lt;element name="goal-additional-ranges" type="{urn:com.microsoft.wc.thing.goal}goal-range" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recurrence" type="{urn:com.microsoft.wc.thing.goal}goal-recurrence" minOccurs="0"/>
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
    "description",
    "startDate",
    "endDate",
    "associatedTypeInfo",
    "targetRange",
    "goalAdditionalRanges",
    "recurrence"
})
@XmlRootElement(name = "health-goal", namespace = "urn:com.microsoft.wc.thing.goal")
public class HealthGoal {

    @XmlElement(required = true)
    protected CodableValue name;
    protected String description;
    @XmlElement(name = "start-date")
    protected ApproxDateTime startDate;
    @XmlElement(name = "end-date")
    protected ApproxDateTime endDate;
    @XmlElement(name = "associated-type-info")
    protected GoalAssociatedTypeInfo associatedTypeInfo;
    @XmlElement(name = "target-range")
    protected GoalRange targetRange;
    @XmlElement(name = "goal-additional-ranges")
    protected List<GoalRange> goalAdditionalRanges;
    protected GoalRecurrence recurrence;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setName(CodableValue value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setStartDate(ApproxDateTime value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setEndDate(ApproxDateTime value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the associatedTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GoalAssociatedTypeInfo }
     *     
     */
    public GoalAssociatedTypeInfo getAssociatedTypeInfo() {
        return associatedTypeInfo;
    }

    /**
     * Sets the value of the associatedTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalAssociatedTypeInfo }
     *     
     */
    public void setAssociatedTypeInfo(GoalAssociatedTypeInfo value) {
        this.associatedTypeInfo = value;
    }

    /**
     * Gets the value of the targetRange property.
     * 
     * @return
     *     possible object is
     *     {@link GoalRange }
     *     
     */
    public GoalRange getTargetRange() {
        return targetRange;
    }

    /**
     * Sets the value of the targetRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalRange }
     *     
     */
    public void setTargetRange(GoalRange value) {
        this.targetRange = value;
    }

    /**
     * Gets the value of the goalAdditionalRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goalAdditionalRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoalAdditionalRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoalRange }
     * 
     * 
     */
    public List<GoalRange> getGoalAdditionalRanges() {
        if (goalAdditionalRanges == null) {
            goalAdditionalRanges = new ArrayList<GoalRange>();
        }
        return this.goalAdditionalRanges;
    }

    /**
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link GoalRecurrence }
     *     
     */
    public GoalRecurrence getRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalRecurrence }
     *     
     */
    public void setRecurrence(GoalRecurrence value) {
        this.recurrence = value;
    }

}