package com.CP.Calendar.Model.CodeForces.Leetcode;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class FilterRequest {

    @NotNull
    private boolean today; // if true give today date else upcoming

//    private String date; // get contest by date

    private List<String> platformName;

}
