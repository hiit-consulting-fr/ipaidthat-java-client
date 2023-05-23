package fr.hiit.ipaidthat.configuration;

import feign.Logger;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Configuration
@ConfigurationProperties(prefix = "app.i-paid-that")
public class IPTProperties {

    /**
     * Token d'authentification iPaidThat
     */
    @NotNull
    private String token;

    /**
     * Niveau de log de l'api
     */
    private Logger.Level feignLogLevel = Logger.Level.FULL;
}
