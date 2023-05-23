package fr.hiit.ipaidthat.proxy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Customer {

    private Long id;

    private LocalDate created;

    @Size(max = 64)
    private String externalId;

    @Size(max = 64)
    private String name;

    @Size(max = 64)
    private String firstName;

    @Size(max = 64)
    private String lastName;

    @Size(max = 30)
    private String siren;

    @Size(max = 30)
    private String vat;

    @Size(max = 500)
    private String address;

    @Size(max = 64)
    private String email;

    @Size(max = 32)
    private String phone;

    private String extra;
}
