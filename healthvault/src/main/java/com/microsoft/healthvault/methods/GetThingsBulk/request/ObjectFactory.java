//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetThingsBulk.request;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.healthvault.methods.GetThingsBulk.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.healthvault.methods.GetThingsBulk.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetThingsBulkRequest }
     * 
     */
    public GetThingsBulkRequest createGetThingsBulkRequest() {
        return new GetThingsBulkRequest();
    }

    /**
     * Create an instance of {@link RequestedThings }
     * 
     */
    public RequestedThings createRequestedThings() {
        return new RequestedThings();
    }

    /**
     * Create an instance of {@link ThingInfoDetails }
     * 
     */
    public ThingInfoDetails createThingInfoDetails() {
        return new ThingInfoDetails();
    }

}