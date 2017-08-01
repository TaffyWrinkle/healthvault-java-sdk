//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;wrapper-class-name xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;AerobicSessionSamples&lt;/wrapper-class-name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     Defines sample sets for an aerobic session.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for aerobic-session-samples complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aerobic-session-samples">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heartrate-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="distance-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="position-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="speed-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="pace-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="power-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="torque-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="cadence-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="temperature-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="altitude-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="air-pressure-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="number-of-steps-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="number-of-aerobic-steps-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *         &lt;element name="aerobic-step-minutes-samples" type="{urn:com.microsoft.wc.thing.types}sample-set" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aerobic-session-samples", namespace = "urn:com.microsoft.wc.thing.types", propOrder = {
    "heartrateSamples",
    "distanceSamples",
    "positionSamples",
    "speedSamples",
    "paceSamples",
    "powerSamples",
    "torqueSamples",
    "cadenceSamples",
    "temperatureSamples",
    "altitudeSamples",
    "airPressureSamples",
    "numberOfStepsSamples",
    "numberOfAerobicStepsSamples",
    "aerobicStepMinutesSamples"
})
public class AerobicSessionSamples {

    @XmlElement(name = "heartrate-samples")
    protected SampleSet heartrateSamples;
    @XmlElement(name = "distance-samples")
    protected SampleSet distanceSamples;
    @XmlElement(name = "position-samples")
    protected SampleSet positionSamples;
    @XmlElement(name = "speed-samples")
    protected SampleSet speedSamples;
    @XmlElement(name = "pace-samples")
    protected SampleSet paceSamples;
    @XmlElement(name = "power-samples")
    protected SampleSet powerSamples;
    @XmlElement(name = "torque-samples")
    protected SampleSet torqueSamples;
    @XmlElement(name = "cadence-samples")
    protected SampleSet cadenceSamples;
    @XmlElement(name = "temperature-samples")
    protected SampleSet temperatureSamples;
    @XmlElement(name = "altitude-samples")
    protected SampleSet altitudeSamples;
    @XmlElement(name = "air-pressure-samples")
    protected SampleSet airPressureSamples;
    @XmlElement(name = "number-of-steps-samples")
    protected SampleSet numberOfStepsSamples;
    @XmlElement(name = "number-of-aerobic-steps-samples")
    protected SampleSet numberOfAerobicStepsSamples;
    @XmlElement(name = "aerobic-step-minutes-samples")
    protected SampleSet aerobicStepMinutesSamples;

    /**
     * Gets the value of the heartrateSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getHeartrateSamples() {
        return heartrateSamples;
    }

    /**
     * Sets the value of the heartrateSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setHeartrateSamples(SampleSet value) {
        this.heartrateSamples = value;
    }

    /**
     * Gets the value of the distanceSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getDistanceSamples() {
        return distanceSamples;
    }

    /**
     * Sets the value of the distanceSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setDistanceSamples(SampleSet value) {
        this.distanceSamples = value;
    }

    /**
     * Gets the value of the positionSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getPositionSamples() {
        return positionSamples;
    }

    /**
     * Sets the value of the positionSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setPositionSamples(SampleSet value) {
        this.positionSamples = value;
    }

    /**
     * Gets the value of the speedSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getSpeedSamples() {
        return speedSamples;
    }

    /**
     * Sets the value of the speedSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setSpeedSamples(SampleSet value) {
        this.speedSamples = value;
    }

    /**
     * Gets the value of the paceSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getPaceSamples() {
        return paceSamples;
    }

    /**
     * Sets the value of the paceSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setPaceSamples(SampleSet value) {
        this.paceSamples = value;
    }

    /**
     * Gets the value of the powerSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getPowerSamples() {
        return powerSamples;
    }

    /**
     * Sets the value of the powerSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setPowerSamples(SampleSet value) {
        this.powerSamples = value;
    }

    /**
     * Gets the value of the torqueSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getTorqueSamples() {
        return torqueSamples;
    }

    /**
     * Sets the value of the torqueSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setTorqueSamples(SampleSet value) {
        this.torqueSamples = value;
    }

    /**
     * Gets the value of the cadenceSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getCadenceSamples() {
        return cadenceSamples;
    }

    /**
     * Sets the value of the cadenceSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setCadenceSamples(SampleSet value) {
        this.cadenceSamples = value;
    }

    /**
     * Gets the value of the temperatureSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getTemperatureSamples() {
        return temperatureSamples;
    }

    /**
     * Sets the value of the temperatureSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setTemperatureSamples(SampleSet value) {
        this.temperatureSamples = value;
    }

    /**
     * Gets the value of the altitudeSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getAltitudeSamples() {
        return altitudeSamples;
    }

    /**
     * Sets the value of the altitudeSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setAltitudeSamples(SampleSet value) {
        this.altitudeSamples = value;
    }

    /**
     * Gets the value of the airPressureSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getAirPressureSamples() {
        return airPressureSamples;
    }

    /**
     * Sets the value of the airPressureSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setAirPressureSamples(SampleSet value) {
        this.airPressureSamples = value;
    }

    /**
     * Gets the value of the numberOfStepsSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getNumberOfStepsSamples() {
        return numberOfStepsSamples;
    }

    /**
     * Sets the value of the numberOfStepsSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setNumberOfStepsSamples(SampleSet value) {
        this.numberOfStepsSamples = value;
    }

    /**
     * Gets the value of the numberOfAerobicStepsSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getNumberOfAerobicStepsSamples() {
        return numberOfAerobicStepsSamples;
    }

    /**
     * Sets the value of the numberOfAerobicStepsSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setNumberOfAerobicStepsSamples(SampleSet value) {
        this.numberOfAerobicStepsSamples = value;
    }

    /**
     * Gets the value of the aerobicStepMinutesSamples property.
     * 
     * @return
     *     possible object is
     *     {@link SampleSet }
     *     
     */
    public SampleSet getAerobicStepMinutesSamples() {
        return aerobicStepMinutesSamples;
    }

    /**
     * Sets the value of the aerobicStepMinutesSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleSet }
     *     
     */
    public void setAerobicStepMinutesSamples(SampleSet value) {
        this.aerobicStepMinutesSamples = value;
    }

}
