package com.CP.Calendar.Model.CodeForces.Leetcode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
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

    }

