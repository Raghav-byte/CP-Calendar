package com.CP.Calendar.Controller;

import com.CP.Calendar.Model.CodeForces.Leetcode.ContestObject;
import com.CP.Calendar.Model.CodeForces.Leetcode.FilterRequest;
import com.CP.Calendar.Service.ContestService;
import com.CP.Calendar.Service.ServiceInvoker;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequestMapping("/contest")
@RestController
public class ContestController {

    @Autowired
    ContestService contestService;
    @Autowired
    ServiceInvoker serviceInvoker;

    //todo : cookie to private repo , shouldn't be exposed

    @Operation(summary = "Get Upcoming Contest Data from Codeforces")
    @PostMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContestObject> getContestData(@RequestBody FilterRequest request) throws IOException {
         return contestService.getContestData(request);
    }
}
