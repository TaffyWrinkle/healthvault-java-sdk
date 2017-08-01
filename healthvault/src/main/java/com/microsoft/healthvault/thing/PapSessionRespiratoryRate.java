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
import com.microsoft.healthvault.types.RespiratoryRateValue;


/**
 * <p>Java class for pap-session-respiratory-rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pap-session-respiratory-rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mean" type="{urn:com.microsoft.wc.thing.types}respiratory-rate-value" minOccurs="0"/>
 *         &lt;element name="median" type="{urn:com.microsoft.wc.thing.types}respiratory-rate-value" minOccurs="0"/>
 *         &lt;element name="maximum" type="{urn:com.microsoft.wc.thing.types}respiratory-rate-value" minOccurs="0"/>
 *         &lt;element name="percentile-95th" type="{urn:com.microsoft.wc.thing.types}respiratory-rate-value" minOccurs="0"/>
 *         &lt;element name="percentile-90th" type="{urn:com.microsoft.wc.thing.types}respiratory-rate-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pap-session-respiratory-rate", namespace = "urn:com.microsoft.wc.thing.pap-session", propOrder = {
    "mean",
    "median",
    "maximum",
    "percentile95Th",
    "percentile90Th"
})
public class PapSessionRespiratoryRate {

    protected RespiratoryRateValue mean;
    protected RespiratoryRateValue median;
    protected RespiratoryRateValue maximum;
    @XmlElement(name = "percentile-95th")
    protected RespiratoryRateValue percentile95Th;
    @XmlElement(name = "percentile-90th")
    protected RespiratoryRateValue percentile90Th;

    /**
     * Gets the value of the mean property.
     * 
     * @return
     *     possible object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public RespiratoryRateValue getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public void setMean(RespiratoryRateValue value) {
        this.mean = value;
    }

    /**
     * Gets the value of the median property.
     * 
     * @return
     *     possible object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public RespiratoryRateValue getMedian() {
        return median;
    }

    /**
     * Sets the value of the median property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public void setMedian(RespiratoryRateValue value) {
        this.median = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public RespiratoryRateValue getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public void setMaximum(RespiratoryRateValue value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the percentile95Th property.
     * 
     * @return
     *     possible object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public RespiratoryRateValue getPercentile95Th() {
        return percentile95Th;
    }

    /**
     * Sets the value of the percentile95Th property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public void setPercentile95Th(RespiratoryRateValue value) {
        this.percentile95Th = value;
    }

    /**
     * Gets the value of the percentile90Th property.
     * 
     * @return
     *     possible object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public RespiratoryRateValue getPercentile90Th() {
        return percentile90Th;
    }

    /**
     * Sets the value of the percentile90Th property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespiratoryRateValue }
     *     
     */
    public void setPercentile90Th(RespiratoryRateValue value) {
        this.percentile90Th = value;
    }

}