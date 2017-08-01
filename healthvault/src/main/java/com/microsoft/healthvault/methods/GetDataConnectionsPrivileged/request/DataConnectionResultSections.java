//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetDataConnectionsPrivileged.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataConnectionResultSections.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataConnectionResultSections">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Core"/>
 *     &lt;enumeration value="Credentials"/>
 *     &lt;enumeration value="Properties"/>
 *     &lt;enumeration value="RefreshTaskInfo"/>
 *     &lt;enumeration value="RefreshHistory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataConnectionResultSections", namespace = "urn:com.microsoft.wc.methods.GetDataConnectionsPrivileged")
@XmlEnum
public enum DataConnectionResultSections {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetDataConnectionsPrivileged" xmlns:wc-dataConnection="urn:com.microsoft.wc.DataConnection" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             The response will contain {connection-id, source-id}.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetDataConnectionsPrivileged" xmlns:wc-dataConnection="urn:com.microsoft.wc.DataConnection" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             Core connection data - {date-created, date-updated, status}.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Core")
    CORE("Core"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetDataConnectionsPrivileged" xmlns:wc-dataConnection="urn:com.microsoft.wc.DataConnection" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             Credentials for the connection.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Credentials")
    CREDENTIALS("Credentials"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetDataConnectionsPrivileged" xmlns:wc-dataConnection="urn:com.microsoft.wc.DataConnection" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             Properties for the connection.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Properties")
    PROPERTIES("Properties"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetDataConnectionsPrivileged" xmlns:wc-dataConnection="urn:com.microsoft.wc.DataConnection" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             Refresh Task info for the connection.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RefreshTaskInfo")
    REFRESH_TASK_INFO("RefreshTaskInfo"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetDataConnectionsPrivileged" xmlns:wc-dataConnection="urn:com.microsoft.wc.DataConnection" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             Refresh history for the connection.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RefreshHistory")
    REFRESH_HISTORY("RefreshHistory");
    private final String value;

    DataConnectionResultSections(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataConnectionResultSections fromValue(String v) {
        for (DataConnectionResultSections c: DataConnectionResultSections.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
