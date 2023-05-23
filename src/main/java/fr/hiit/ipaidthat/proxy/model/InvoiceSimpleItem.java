package fr.hiit.ipaidthat.proxy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class InvoiceSimpleItem {

    private Long id;

    @NotNull
    private Long invoice;

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
