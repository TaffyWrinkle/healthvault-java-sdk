//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.dates;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.types" xmlns:this="urn:com.microsoft.wc.dates"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.types" xmlns:this="urn:com.microsoft.wc.dates"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="h" type="{urn:com.microsoft.wc.dates}hour"/>
 *         &lt;element name="m" type="{urn:com.microsoft.wc.dates}minute"/>
 *         &lt;element name="s" type="{urn:com.microsoft.wc.dates}second" minOccurs="0"/>
 *         &lt;element name="f" type="{urn:com.microsoft.wc.dates}millisecond" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time", propOrder = {
    "h",
    "m",
    "s",
    "f"
})
public class Time {

    protected int h;
    protected int m;
    protected Integer s;
    protected Integer f;

    /**
     * Gets the value of the h property.
     * 
     */
    public int getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     * 
     */
    public void setH(int value) {
        this.h = value;
    }

    /**
     * Gets the value of the m property.
     * 
     */
    public int getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     * 
     */
    public void setM(int value) {
        this.m = value;
    }

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setS(Integer value) {
        this.s = value;
    }

    /**
     * Gets the value of the f property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     * @param value allowed object is
     * {@link Integer }
     */
    public void setF(Integer value) {
        this.f = value;
    }

    /**
     * Generate instance from calendar.
     * 
     * @param cal the cal
     * 
     * @return the time
     */
    public static Time fromCalendar(Calendar cal)
    {
    	Time time = new Time();
    	
    	time.setH(cal.get(Calendar.HOUR_OF_DAY));
    	time.setM(cal.get(Calendar.MINUTE));
    	time.setS(cal.get(Calendar.SECOND));
    	time.setF(cal.get(Calendar.MILLISECOND));
    	
    	return time;
    }
    
}