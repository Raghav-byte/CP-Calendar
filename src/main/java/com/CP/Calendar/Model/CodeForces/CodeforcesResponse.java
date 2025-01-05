package com.CP.Calendar.Model.CodeForces;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CodeforcesResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("result")
    private List<CfResults> result;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CfResults> getResult() {
        return result;
    }

    public void setResult(List<CfResults> result) {
        this.result = result;
    }
}
