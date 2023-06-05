package com.listeParkings.listeParkings.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "url")
@Data
public class UrlConfig {

    private String parkingListUrl;
    private String parkingNbUrl;
    private String test;
}
