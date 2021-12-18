package com.company.api;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/log")
public class LogEndpoint {

    @GetMapping
    public String getDetails() {
        log.debug("get detail method started");
        return internalLogDetail();
    }

    private String internalLogDetail() {
        try {
            log.debug("get detail method started");
            Thread.sleep(1000);
            return "API Message";
        } catch (InterruptedException e) {
            log.error("Error : {} ", e);
        }
        return "";
    }
}
