//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetThingOperatorHistory.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThingOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThingOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="person"/>
 *     &lt;enumeration value="application"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThingOperatorType", namespace = "urn:com.microsoft.wc.methods.GetThingOperatorHistory")
@XmlEnum
public enum ThingOperatorType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetThingOperatorHistory" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("person")
    PERSON("person"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetThingOperatorHistory" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("application")
    APPLICATION("application");
    private final String value;

    ThingOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThingOperatorType fromValue(String v) {
        for (ThingOperatorType c: ThingOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
