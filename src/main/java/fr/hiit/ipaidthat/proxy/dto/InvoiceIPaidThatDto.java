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
public class InvoiceIPaidThatDto {

    private Integer id;

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
