package com.CP.Calendar.Model.CodeForces.Leetcode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseClass {

    @JsonProperty("meta")
    public Meta meta;
    @JsonProperty("objects")
    public List<ContestObject> objects;


    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<ContestObject> getContestObjects() {
        return objects;
    }

    public void setContestObjects(List<ContestObject> contestObjects) {
        this.objects = contestObjects;
    }
}

