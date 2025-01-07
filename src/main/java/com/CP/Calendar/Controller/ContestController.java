package com.CP.Calendar.Controller;

import com.CP.Calendar.Model.CodeForces.Leetcode.ContestObject;
import com.CP.Calendar.Model.CodeForces.Leetcode.FilterRequest;
import com.CP.Calendar.Service.ContestService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("/contest")
@RestController
public class ContestController {

    @Autowired
    ContestService contestService;

    @Operation(summary = "Get Upcoming Contest Data from Codeforces")
    @PostMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContestObject> getContestData(@RequestBody FilterRequest request) {
        return contestService.getContestData(request);
    }
}
