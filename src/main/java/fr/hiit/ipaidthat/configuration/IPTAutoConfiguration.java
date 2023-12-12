package fr.hiit.ipaidthat.configuration;

import feign.Logger;
import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(IPTProperties.class)
public class IPTAutoConfiguration {

    @PostConstruct
    public void init() {
        LOGGER.info("Initialized IPaidThat proxy");
    }

    @Bean
    public RequestInterceptor requestInterceptor(IPTProperties properties) {
        return requestTemplate -> requestTemplate.header("Authorization", properties.getToken());
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new IPTErrorDecoder();
    }

    @Bean
    public Logger.Level feignLoggerLevel(IPTProperties properties) {
        return properties.getFeignLogLevel();
    }
}
