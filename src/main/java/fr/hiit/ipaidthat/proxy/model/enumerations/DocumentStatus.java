package fr.hiit.ipaidthat.proxy.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum DocumentStatus {
    DRAFT("draft"),
    UPDATING("updating"),
    NOT_PAID("not paid"),
    PAID("paid");

    @JsonValue
    private final String status;
}
