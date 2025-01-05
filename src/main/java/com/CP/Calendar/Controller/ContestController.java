package com.CP.Calendar.Controller;

import com.CP.Calendar.Service.ContestService;
import com.CP.Calendar.Service.ServiceInvoker;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequestMapping("/contest")
@RestController
public class ContestController {

    @Autowired
    ContestService contestService;
    @Autowired
    ServiceInvoker serviceInvoker;

    @Operation(summary = "Get Upcoming Contest Data from Codeforces")
    @PostMapping(path = "/codeforces", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getCodeForcesContestData() throws IOException {
         return serviceInvoker.getCachedData();
    }
}
