/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tracks when a change was made to a tracked entity, by whom, and by which
 * application.
 */
public class Audit {
    /**
     * Gets or sets when the change was made.
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * Gets or sets who made the change.
     */
    @JsonProperty(value = "personId")
    private String personId;

    /**
     * Gets or sets which application that made the change.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /**
     * Gets or sets the audit action for the change. Possible values include:
     * 'Unknown', 'Created', 'Updated', 'Deleted'.
     */
    @JsonProperty(value = "auditAction")
    private String auditAction;

    /**
     * Get the timestamp value.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp value.
     *
     * @param timestamp the timestamp value to set
     * @return the Audit object itself.
     */
    public Audit withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the personId value.
     *
     * @return the personId value
     */
    public String personId() {
        return this.personId;
    }

    /**
     * Set the personId value.
     *
     * @param personId the personId value to set
     * @return the Audit object itself.
     */
    public Audit withPersonId(String personId) {
        this.personId = personId;
        return this;
    }

    /**
     * Get the applicationId value.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId value.
     *
     * @param applicationId the applicationId value to set
     * @return the Audit object itself.
     */
    public Audit withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the auditAction value.
     *
     * @return the auditAction value
     */
    public String auditAction() {
        return this.auditAction;
    }

    /**
     * Set the auditAction value.
     *
     * @param auditAction the auditAction value to set
     * @return the Audit object itself.
     */
    public Audit withAuditAction(String auditAction) {
        this.auditAction = auditAction;
        return this;
    }

}
