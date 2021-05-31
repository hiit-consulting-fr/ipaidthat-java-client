package fr.hiit.ipaidthat.configuration;

import feign.Logger;
import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(IPTProperties.class)
public class IPTAutoConfiguration {

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
