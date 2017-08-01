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
 *                     The rules for tracking task completion.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for task-tracking-policy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="task-tracking-policy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="is-auto-trackable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="source-types" type="{urn:com.microsoft.wc.thing.task}tracking-source-types"/>
 *         &lt;element name="trigger-types" type="{urn:com.microsoft.wc.thing.task}tracking-trigger-types"/>
 *         &lt;element name="occurrence-metrics" type="{urn:com.microsoft.wc.thing.task}task-occurrence-metrics" minOccurs="0"/>
 *         &lt;element name="completion-metrics" type="{urn:com.microsoft.wc.thing.task}task-completion-metrics"/>
 *         &lt;element name="target-events" type="{urn:com.microsoft.wc.thing.task}task-target-events" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task-tracking-policy", namespace = "urn:com.microsoft.wc.thing.task", propOrder = {
    "isAutoTrackable",
    "sourceTypes",
    "triggerTypes",
    "occurrenceMetrics",
    "completionMetrics",
    "targetEvents"
})
public class TaskTrackingPolicy {

    @XmlElement(name = "is-auto-trackable")
    protected Boolean isAutoTrackable;
    @XmlElement(name = "source-types", required = true)
    protected TrackingSourceTypes sourceTypes;
    @XmlElement(name = "trigger-types", required = true)
    protected TrackingTriggerTypes triggerTypes;
    @XmlElement(name = "occurrence-metrics")
    protected TaskOccurrenceMetrics occurrenceMetrics;
    @XmlElement(name = "completion-metrics", required = true)
    protected TaskCompletionMetrics completionMetrics;
    @XmlElement(name = "target-events")
    protected TaskTargetEvents targetEvents;

    /**
     * Gets the value of the isAutoTrackable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutoTrackable() {
        return isAutoTrackable;
    }

    /**
     * Sets the value of the isAutoTrackable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutoTrackable(Boolean value) {
        this.isAutoTrackable = value;
    }

    /**
     * Gets the value of the sourceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingSourceTypes }
     *     
     */
    public TrackingSourceTypes getSourceTypes() {
        return sourceTypes;
    }

    /**
     * Sets the value of the sourceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingSourceTypes }
     *     
     */
    public void setSourceTypes(TrackingSourceTypes value) {
        this.sourceTypes = value;
    }

    /**
     * Gets the value of the triggerTypes property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingTriggerTypes }
     *     
     */
    public TrackingTriggerTypes getTriggerTypes() {
        return triggerTypes;
    }

    /**
     * Sets the value of the triggerTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingTriggerTypes }
     *     
     */
    public void setTriggerTypes(TrackingTriggerTypes value) {
        this.triggerTypes = value;
    }

    /**
     * Gets the value of the occurrenceMetrics property.
     * 
     * @return
     *     possible object is
     *     {@link TaskOccurrenceMetrics }
     *     
     */
    public TaskOccurrenceMetrics getOccurrenceMetrics() {
        return occurrenceMetrics;
    }

    /**
     * Sets the value of the occurrenceMetrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskOccurrenceMetrics }
     *     
     */
    public void setOccurrenceMetrics(TaskOccurrenceMetrics value) {
        this.occurrenceMetrics = value;
    }

    /**
     * Gets the value of the completionMetrics property.
     * 
     * @return
     *     possible object is
     *     {@link TaskCompletionMetrics }
     *     
     */
    public TaskCompletionMetrics getCompletionMetrics() {
        return completionMetrics;
    }

    /**
     * Sets the value of the completionMetrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskCompletionMetrics }
     *     
     */
    public void setCompletionMetrics(TaskCompletionMetrics value) {
        this.completionMetrics = value;
    }

    /**
     * Gets the value of the targetEvents property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTargetEvents }
     *     
     */
    public TaskTargetEvents getTargetEvents() {
        return targetEvents;
    }

    /**
     * Sets the value of the targetEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTargetEvents }
     *     
     */
    public void setTargetEvents(TaskTargetEvents value) {
        this.targetEvents = value;
    }

}
