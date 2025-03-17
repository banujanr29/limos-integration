package com.limos4.integration.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientUtil {
    public static WebClient getWebClient() {
        return WebClient.builder().build();
    }

    public static RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
