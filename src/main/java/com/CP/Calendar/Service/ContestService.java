package com.CP.Calendar.Service;

import com.CP.Calendar.Model.CodeForces.CfResults;
import com.CP.Calendar.Model.CodeForces.CodeforcesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContestService {

    @Autowired
    ServiceInvoker invoker;

    public List<CfResults> getCodeForcesContestData() throws IOException {
        List<CfResults> response = new ArrayList<>();

        CodeforcesResponse res = invoker.callCfContest();
        if (res != null && res.getResult() != null && !res.getResult().isEmpty()) {
            response = res.getResult().stream().filter(f -> f.getPhase().equals(CfResults.ContestPhase.BEFORE))
                    .collect(Collectors.toList());
        }

        for (CfResults ff : response) {
            long epochTimeMillis = ff.getStartTimeSeconds() * 1000; // Example epoch time in milliseconds
            Instant instant = Instant.ofEpochMilli(epochTimeMillis);
            ZoneId zoneId = ZoneId.systemDefault(); // Use the system default time zone
            LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
            ff.setStartDate(localDateTime);

            String sb = "https:/codeforces.com/contests/" + ff.getId();
            ff.setWebsiteUrl(sb);
        }


        return response;
    }

}
