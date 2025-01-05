package com.CP.Calendar.Model.CodeForces.Leetcode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseClass {

    @JsonProperty("meta")
    public Meta meta;
    @JsonProperty("objects")
    public List<ContestObject> objects;

}

