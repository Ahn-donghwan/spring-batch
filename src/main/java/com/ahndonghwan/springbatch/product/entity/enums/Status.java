package com.ahndonghwan.springbatch.product.entity.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Status {

    SALE("판매중"),
    SOLD_OUT("품절")
    ;

    private final String status;

    @JsonValue
    public String getStatus() {
        return status;
    }

    @JsonCreator
    public static Status fromString(String status) {
        for (Status s : Status.values()) {
            if (s.getStatus().equals(status)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Invalid status: " + status);
    }
}
