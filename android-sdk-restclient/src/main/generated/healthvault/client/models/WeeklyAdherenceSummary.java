/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A summary of a tasks weekly adherence.
 */
public class WeeklyAdherenceSummary {
    /**
     * The start of the week.
     */
    @JsonProperty(value = "weekStart")
    private DateTime weekStart;

    /**
     * The # of completions that occurred this week.
     */
    @JsonProperty(value = "completions")
    private Integer completions;

    /**
     * The # of completions that were intended for this week.
     */
    @JsonProperty(value = "intendedCompletions")
    private Integer intendedCompletions;

    /**
     * The # of occurrences that were intended for this week.
     */
    @JsonProperty(value = "intendedOccurrences")
    private Integer intendedOccurrences;

    /**
     * The # of occurrences that were manually tracked this week.
     */
    @JsonProperty(value = "manualTrackedOccurrences")
    private Integer manualTrackedOccurrences;

    /**
     * The # of occurrences that were automatically tracked this week.
     */
    @JsonProperty(value = "automaticTrackedOccurrences")
    private Integer automaticTrackedOccurrences;

    /**
     * A list of evidence (HealthVault Thing IDs) that were automatically
     * tracked.
     */
    @JsonProperty(value = "automaticTrackedOccurrenceEvidence")
    private List<String> automaticTrackedOccurrenceEvidence;

    /**
     * Get the weekStart value.
     *
     * @return the weekStart value
     */
    public DateTime weekStart() {
        return this.weekStart;
    }

    /**
     * Set the weekStart value.
     *
     * @param weekStart the weekStart value to set
     * @return the WeeklyAdherenceSummary object itself.
     */
    public WeeklyAdherenceSummary withWeekStart(DateTime weekStart) {
        this.weekStart = weekStart;
        return this;
    }

    /**
     * Get the completions value.
     *
     * @return the completions value
     */
    public Integer completions() {
        return this.completions;
    }

    /**
     * Set the completions value.
     *
     * @param completions the completions value to set
     * @return the WeeklyAdherenceSummary object itself.
     */
    public WeeklyAdherenceSummary withCompletions(Integer completions) {
        this.completions = completions;
        return this;
    }

    /**
     * Get the intendedCompletions value.
     *
     * @return the intendedCompletions value
     */
    public Integer intendedCompletions() {
        return this.intendedCompletions;
    }

    /**
     * Set the intendedCompletions value.
     *
     * @param intendedCompletions the intendedCompletions value to set
     * @return the WeeklyAdherenceSummary object itself.
     */
    public WeeklyAdherenceSummary withIntendedCompletions(Integer intendedCompletions) {
        this.intendedCompletions = intendedCompletions;
        return this;
    }

    /**
     * Get the intendedOccurrences value.
     *
     * @return the intendedOccurrences value
     */
    public Integer intendedOccurrences() {
        return this.intendedOccurrences;
    }

    /**
     * Set the intendedOccurrences value.
     *
     * @param intendedOccurrences the intendedOccurrences value to set
     * @return the WeeklyAdherenceSummary object itself.
     */
    public WeeklyAdherenceSummary withIntendedOccurrences(Integer intendedOccurrences) {
        this.intendedOccurrences = intendedOccurrences;
        return this;
    }

    /**
     * Get the manualTrackedOccurrences value.
     *
     * @return the manualTrackedOccurrences value
     */
    public Integer manualTrackedOccurrences() {
        return this.manualTrackedOccurrences;
    }

    /**
     * Set the manualTrackedOccurrences value.
     *
     * @param manualTrackedOccurrences the manualTrackedOccurrences value to set
     * @return the WeeklyAdherenceSummary object itself.
     */
    public WeeklyAdherenceSummary withManualTrackedOccurrences(Integer manualTrackedOccurrences) {
        this.manualTrackedOccurrences = manualTrackedOccurrences;
        return this;
    }

    /**
     * Get the automaticTrackedOccurrences value.
     *
     * @return the automaticTrackedOccurrences value
     */
    public Integer automaticTrackedOccurrences() {
        return this.automaticTrackedOccurrences;
    }

    /**
     * Set the automaticTrackedOccurrences value.
     *
     * @param automaticTrackedOccurrences the automaticTrackedOccurrences value to set
     * @return the WeeklyAdherenceSummary object itself.
     */
    public WeeklyAdherenceSummary withAutomaticTrackedOccurrences(Integer automaticTrackedOccurrences) {
        this.automaticTrackedOccurrences = automaticTrackedOccurrences;
        return this;
    }

    /**
     * Get the automaticTrackedOccurrenceEvidence value.
     *
     * @return the automaticTrackedOccurrenceEvidence value
     */
    public List<String> automaticTrackedOccurrenceEvidence() {
        return this.automaticTrackedOccurrenceEvidence;
    }

    /**
     * Set the automaticTrackedOccurrenceEvidence value.
     *
     * @param automaticTrackedOccurrenceEvidence the automaticTrackedOccurrenceEvidence value to set
     * @return the WeeklyAdherenceSummary object itself.
     */
    public WeeklyAdherenceSummary withAutomaticTrackedOccurrenceEvidence(List<String> automaticTrackedOccurrenceEvidence) {
        this.automaticTrackedOccurrenceEvidence = automaticTrackedOccurrenceEvidence;
        return this;
    }

}
