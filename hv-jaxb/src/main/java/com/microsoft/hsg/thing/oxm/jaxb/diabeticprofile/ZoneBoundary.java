//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:39:47 AM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.diabeticprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.BloodGlucoseValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:g="urn:com.microsoft.wc.thing.diabetic-profile" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     A glucose zone boundary.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:g="urn:com.microsoft.wc.thing.diabetic-profile" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     The boundary of a glucose zone may be set as either an
 *                     absolute glucose measurement or as a percentage
 *                     of a person's maximum glucose measurement.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ZoneBoundary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneBoundary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="absolute-glucose" type="{urn:com.microsoft.wc.thing.types}blood-glucose-value"/>
 *         &lt;element name="percent-max-glucose" type="{urn:com.microsoft.wc.thing.types}percentage"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneBoundary", propOrder = {
    "absoluteGlucose",
    "percentMaxGlucose"
})
public class ZoneBoundary {

    @XmlElement(name = "absolute-glucose")
    protected BloodGlucoseValue absoluteGlucose;
    @XmlElement(name = "percent-max-glucose")
    protected Double percentMaxGlucose;

    /**
     * Gets the value of the absoluteGlucose property.
     * 
     * @return
     *     possible object is
     *     {@link BloodGlucoseValue }
     *     
     */
    public BloodGlucoseValue getAbsoluteGlucose() {
        return absoluteGlucose;
    }

    /**
     * Sets the value of the absoluteGlucose property.
     * 
     * @param value
     *     allowed object is
     *     {@link BloodGlucoseValue }
     *     
     */
    public void setAbsoluteGlucose(BloodGlucoseValue value) {
        this.absoluteGlucose = value;
    }

    /**
     * Gets the value of the percentMaxGlucose property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentMaxGlucose() {
        return percentMaxGlucose;
    }

    /**
     * Sets the value of the percentMaxGlucose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentMaxGlucose(Double value) {
        this.percentMaxGlucose = value;
    }

}