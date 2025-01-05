package com.CP.Calendar.Model.CodeForces.Leetcode;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
    public class Meta {
    @JsonProperty("estimated_count")
    private Integer estimatedCount;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("next")
    private String next;

    @JsonProperty("offset")
    private Integer offset;

    @JsonProperty("previous")
    private String previous;

    @JsonProperty("total_count")
    private Integer totalCount;

    private LocalTime dataTime = LocalTime.now();


    // Getters and Setters
        public Integer getEstimatedCount() {
            return estimatedCount;
        }

        public void setEstimatedCount(Integer estimatedCount) {
            this.estimatedCount = estimatedCount;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }

        public Integer getOffset() {
            return offset;
        }

        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        public String getPrevious() {
            return previous;
        }

        public void setPrevious(String previous) {
            this.previous = previous;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public void setDataTime(){
            this.dataTime = LocalTime.now();
        }

        public LocalTime getDataTime(){
            return this.dataTime;
        }

}
