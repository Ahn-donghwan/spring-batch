package com.ahndonghwan.springbatch.common.response;

import org.springframework.http.HttpStatus;

public record BaseResponse<T>(HttpStatus httpStatus, boolean success, int code, String message, T data) {

    public BaseResponse(String message, T data) {
        this(HttpStatus.OK, true, 200, message, data);
    }

    public BaseResponse(String message) {
        this(HttpStatus.OK, true, 200, message, null);
    }
}
