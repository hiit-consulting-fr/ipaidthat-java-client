package fr.hiit.ipaidthat.proxy.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CustomerIPaidThatDto {

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
