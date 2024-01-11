package com.simulatepoc.simulatepoc.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class SimulationController {

    private static final Logger logger = LoggerFactory.getLogger(SimulationController.class);
    @GetMapping("/api/v1/log")
    public ResponseEntity<?> createLog()
    {
        StopWatch watch = new StopWatch();
        watch.start();

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }
        watch.stop();

        logger.info("Time taken for calculation is: {} seconds", watch.getTotalTimeMillis());


        String x = "done from ffvar ";
        return ResponseEntity.ok(x);
    }
}
