package com.CP.Calendar.Service;

import com.CP.Calendar.Model.CodeForces.Leetcode.ContestObject;
import com.CP.Calendar.Model.CodeForces.Leetcode.FilterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContestService {

    @Autowired
    ServiceInvoker invoker;


    public List<ContestObject> getContestData(FilterRequest request) {
        List<ContestObject> responseList = new ArrayList<>();
        List<ContestObject> contestData = invoker.getCachedData();
        LocalDate todayDate = LocalDate.now();

        if (!contestData.isEmpty()) {
            if (request.isToday()) {
                responseList = contestData.stream().filter(contest -> contest.getContestStartDate().isEqual(todayDate)).collect(Collectors.toList());
            } else {
                responseList = contestData.stream().filter(contest -> !contest.getContestStartDate().isEqual(todayDate)).collect(Collectors.toList());
            }

            if (request.getPlatformName() != null && !request.getPlatformName().isEmpty()) {
                responseList = responseList.stream()
                        .filter(contest -> request.getPlatformName().stream()
                                .anyMatch(platform -> contest.getHost().toLowerCase().contains(platform)))
                        .collect(Collectors.toList());
            }
        }
        return responseList;
    }

}
