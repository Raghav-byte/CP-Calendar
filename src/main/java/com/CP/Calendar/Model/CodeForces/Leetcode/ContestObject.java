package com.CP.Calendar.Model.CodeForces.Leetcode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestObject {

    @JsonProperty("duration")
    private Integer duration;

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
        // Getters and Setters
        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getNProblems() {
            return nProblems;
        }

        public void setNProblems(Integer nProblems) {
            this.nProblems = nProblems;
        }

        public Integer getNStatistics() {
            return nStatistics;
        }

        public void setNStatistics(Integer nStatistics) {
            this.nStatistics = nStatistics;
        }

        public String getParsedAt() {
            return parsedAt;
        }

        public void setParsedAt(String parsedAt) {
            this.parsedAt = parsedAt;
        }

        public String getProblems() {
            return problems;
        }

        public void setProblems(String problems) {
            this.problems = problems;
        }

        public String getResource() {
            return resource;
        }

        public void setResource(String resource) {
            this.resource = resource;
        }

        public Integer getResourceId() {
            return resourceId;
        }

        public void setResourceId(Integer resourceId) {
            this.resourceId = resourceId;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }
    }

