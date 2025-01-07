package com.CP.Calendar.Model.CodeForces.Leetcode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestObject {

    @JsonProperty("duration")
    private Integer duration; // in seconds

    @JsonProperty("end")
    private String end;

    @JsonProperty("event")
    private String event;

    @JsonProperty("host")
    private String host;

    @JsonProperty("href")
    private String href;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("n_problems")
    private Integer nProblems;

    @JsonProperty("n_statistics")
    private Integer nStatistics;

    @JsonProperty("parsed_at")
    private String parsedAt;

    @JsonProperty("problems")
    private String problems;

    @JsonProperty("resource")
    private String resource;

    @JsonProperty("resource_id")
    private Integer resourceId;

    @JsonProperty("start")
    private String start;

    private LocalDate contestStartDate;
    private LocalTime contestStartTime;

    private LocalDate contestEndDate;
    private LocalTime contestEndTime;

    private String relativeTime;
    
    // Jackson calls the setter methods for each property during deserialization.
    public void setStart(String start) {
        this.start = start;
        if (start != null && !start.isEmpty()) {
            LocalDateTime dateTime = LocalDateTime.parse(start, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            this.contestStartDate = dateTime.toLocalDate();
            this.contestStartTime = dateTime.toLocalTime();
            this.relativeTime = Utils.getRelativeTime(this.contestStartDate, this.contestStartTime);
        }
    }

    public void setEnd(String end) {
        this.end = end;
        if (end != null && !end.isEmpty()) {
            LocalDateTime dateTime = LocalDateTime.parse(end, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            this.contestEndDate = dateTime.toLocalDate();
            this.contestEndTime = dateTime.toLocalTime();
        }
    }

}

