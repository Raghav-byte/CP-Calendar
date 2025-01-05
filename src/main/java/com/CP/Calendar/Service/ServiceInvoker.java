package com.CP.Calendar.Service;

import com.CP.Calendar.Model.CodeForces.Leetcode.ResponseClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ServiceInvoker {

    private final Map<String, ResponseClass> cache = new ConcurrentHashMap<>();

    @Autowired
    RestTemplate restTemplate;


    //https://clist.by/api/v4/doc/#!/account/account_list

    public void getClist () throws JsonProcessingException {
        System.out.println("CLEARING CACHE");
        cache.clear();
        System.out.println("HITTING EXTERNAL API AT " + LocalTime.now());


        String url = "https://clist.by/api/v4/contest/";


        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("limit", "1000").
                queryParam("total_count","true").
                queryParam("with_problems","false").
                queryParam("upcoming","true").
                queryParam("host__regex","").
                queryParam("start__gt","2025-01-05T00:00:00").
                queryParam("order_by","start");


        HttpHeaders headers = new HttpHeaders();
        headers.set("cookie","calendar_view=dayGridMonth; csrftoken=uUmr1Eg4JjnBEoUxVZ9nRCaQCtcpUpuY; sessionid=fng1hraz7qtumoc8xdl8eo500k8x3hnl");
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                String.class
        );

        String responseBody = response.getBody();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true);

        ResponseClass contest = objectMapper.readValue(responseBody, ResponseClass.class);
        cache.put("apiData", contest);
    }

    public Object getCachedData() {
        ResponseClass res = cache.get("apiData");
        return res.getObjects();
    }

}
