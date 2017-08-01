//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetDeviceDirectory.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.core.directory.DeviceDirectoryItem;
import com.microsoft.healthvault.core.directory.DirectoryItemMetadata;


/**
 * <p>Java class for DeviceDirectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDirectory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="device-directory-item" type="{urn:com.microsoft.wc.directory}DeviceDirectoryItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="device-directory-metadata" type="{urn:com.microsoft.wc.directory}DirectoryItemMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDirectory", namespace = "urn:com.microsoft.wc.methods.response.GetDeviceDirectory", propOrder = {
    "deviceDirectoryItem",
    "deviceDirectoryMetadata"
})
public class DeviceDirectory {

    @XmlElement(name = "device-directory-item")
    protected List<DeviceDirectoryItem> deviceDirectoryItem;
    @XmlElement(name = "device-directory-metadata")
    protected List<DirectoryItemMetadata> deviceDirectoryMetadata;

    /**
     * Gets the value of the deviceDirectoryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceDirectoryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceDirectoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceDirectoryItem }
     * 
     * 
     */
    public List<DeviceDirectoryItem> getDeviceDirectoryItem() {
        if (deviceDirectoryItem == null) {
            deviceDirectoryItem = new ArrayList<DeviceDirectoryItem>();
        }
        return this.deviceDirectoryItem;
    }

    /**
     * Gets the value of the deviceDirectoryMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceDirectoryMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceDirectoryMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectoryItemMetadata }
     * 
     * 
     */
    public List<DirectoryItemMetadata> getDeviceDirectoryMetadata() {
        if (deviceDirectoryMetadata == null) {
            deviceDirectoryMetadata = new ArrayList<DirectoryItemMetadata>();
        }
        return this.deviceDirectoryMetadata;
    }

}
