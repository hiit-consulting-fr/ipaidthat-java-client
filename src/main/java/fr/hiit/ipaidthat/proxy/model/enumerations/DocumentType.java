package fr.hiit.ipaidthat.proxy.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum DocumentType {
    INVOICE("invoice"),
    QUOTE("quote"),
    ORDER("order"),
    CREDIT("credit"),
    OTHER("other");

    @JsonValue
    private final String type;
}
