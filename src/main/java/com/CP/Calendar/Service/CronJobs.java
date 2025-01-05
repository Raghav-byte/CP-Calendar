package com.CP.Calendar.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CronJobs {

    @Autowired
    ServiceInvoker serviceInvoker;

    @Scheduled(cron = "*/30 * * * * *")
    public void fetchDataFromServer() throws JsonProcessingException {
        serviceInvoker.getClist();
    }


}
