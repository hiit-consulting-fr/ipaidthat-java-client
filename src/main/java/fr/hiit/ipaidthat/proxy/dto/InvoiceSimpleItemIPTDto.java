package fr.hiit.ipaidthat.proxy.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InvoiceSimpleItemIPTDto {

    private Integer id;

    @NotNull
    private Integer invoice;

    @NotNull
    @Size(min = 1, max = 64)
    private String name;

    private String additionalInfo;

    @NotNull
    private Double unitPrice;

    private Double quantity;

    private Double taxPercent;

    private Double discountPercent;

    private Integer position;
}
