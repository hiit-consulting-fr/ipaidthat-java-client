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
public class Invoice {

    private Long id;

    @Size(max = 64)
    private String externalId;

    private LocalDate issueDate;

    private DocumentType type;

    private String invoiceNumber;

    private LocalDate dueDate;

    private Double shipping;

    @Size(max = 30)
    private String cFieldName1;

    @Size(max = 30)
    private String cFieldValue1;

    @Size(max = 30)
    private String cFieldName2;

    @Size(max = 30)
    private String cFieldValue2;

    private Integer sender;

    private Integer customer;

    private Boolean draft;

    private Boolean multiPage;

    private DocumentStatus status;

    private Boolean paid;
}
