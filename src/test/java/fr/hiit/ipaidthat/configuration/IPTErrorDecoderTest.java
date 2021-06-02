package fr.hiit.ipaidthat.configuration;

import feign.Request;
import feign.Response;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class IPTErrorDecoderTest {

    @Test
    void decode() {
        //Prepare
        Request request = Request.create(Request.HttpMethod.GET, "", new HashMap<>(), (Request.Body) null, null);
        Response response = Response.builder()
                .request(request)
                .reason("Test")
                .status(403)
                .build();

        //Execute
        Exception exception = new IPTErrorDecoder().decode("method", response);

        //Validate
        assertThat(exception).isNotNull()
                .hasFieldOrPropertyWithValue("status", HttpStatus.FORBIDDEN)
                .hasFieldOrPropertyWithValue("reason", "Test");
    }
}
