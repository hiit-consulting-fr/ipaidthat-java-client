package fr.hiit.ipaidthat.configuration;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class IPTErrorDecoder implements ErrorDecoder {
    @SneakyThrows
    @Override
    public Exception decode(String methodKey, Response response) {
        HttpStatus status = HttpStatus.resolve(response.status());
        return status != null ?
            new ResponseStatusException(status, response.reason()) :
            new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Generic error");
    }
}
