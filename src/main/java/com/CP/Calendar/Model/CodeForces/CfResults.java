package com.CP.Calendar.Model.CodeForces;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CfResults {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private ContestType type;
    @JsonProperty("phase")
    private ContestPhase phase;
    @JsonProperty("frozen")
    private boolean frozen;
    @JsonProperty("durationSeconds")
    private long durationSeconds;
    @JsonProperty("freezeDurationSeconds")
    private long freezeDurationSeconds; // Optional
    @JsonProperty("startTimeSeconds")
    private long startTimeSeconds;      // Optional
    @JsonProperty("relativeTimeSeconds")
    private long relativeTimeSeconds;   // Optional
    private String websiteUrl;


    private LocalDateTime startDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContestType getType() {
        return type;
    }

    public void setType(ContestType type) {
        this.type = type;
    }

    public ContestPhase getPhase() {
        return phase;
    }

    public void setPhase(ContestPhase phase) {
        this.phase = phase;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public long getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(long durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public long getFreezeDurationSeconds() {
        return freezeDurationSeconds;
    }

    public void setFreezeDurationSeconds(long freezeDurationSeconds) {
        this.freezeDurationSeconds = freezeDurationSeconds;
    }

    public long getStartTimeSeconds() {
        return startTimeSeconds;
    }

    public void setStartTimeSeconds(long startTimeSeconds) {
        this.startTimeSeconds = startTimeSeconds;
    }

    public long getRelativeTimeSeconds() {
        return relativeTimeSeconds;
    }

    public void setRelativeTimeSeconds(long relativeTimeSeconds) {
        this.relativeTimeSeconds = relativeTimeSeconds;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    // Enum for ContestType
    public enum ContestType {
        CF, IOI, ICPC
    }

    // Enum for ContestPhase
    public enum ContestPhase {
        BEFORE, CODING, PENDING_SYSTEM_TEST, SYSTEM_TEST, FINISHED
    }
}
