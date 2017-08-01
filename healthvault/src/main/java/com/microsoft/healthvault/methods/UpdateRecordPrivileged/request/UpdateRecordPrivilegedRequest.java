//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.UpdateRecordPrivileged.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.UpdateRecordPrivileged" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the request that contains the method
 *                         specific parameters.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.UpdateRecordPrivileged" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         All requests contain the info element to pass parameters
 *                         that are specific to each method. If the method does not
 *                         define an info element, the method does not take any
 *                         parameters.
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
 *         &lt;element name="record-state" type="{urn:com.microsoft.wc.methods.UpdateRecordPrivileged}RecordState" minOccurs="0"/>
 *         &lt;element name="max-size-bytes" type="{urn:com.microsoft.wc.types}positiveLong" minOccurs="0"/>
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
    "recordState",
    "maxSizeBytes"
})
public class UpdateRecordPrivilegedRequest {

    @XmlElement(name = "record-state")
    @XmlSchemaType(name = "string")
    protected RecordState recordState;
    @XmlElement(name = "max-size-bytes")
    protected Long maxSizeBytes;

    /**
     * Gets the value of the recordState property.
     * 
     * @return
     *     possible object is
     *     {@link RecordState }
     *     
     */
    public RecordState getRecordState() {
        return recordState;
    }

    /**
     * Sets the value of the recordState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordState }
     *     
     */
    public void setRecordState(RecordState value) {
        this.recordState = value;
    }

    /**
     * Gets the value of the maxSizeBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxSizeBytes() {
        return maxSizeBytes;
    }

    /**
     * Sets the value of the maxSizeBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSizeBytes(Long value) {
        this.maxSizeBytes = value;
    }

}
