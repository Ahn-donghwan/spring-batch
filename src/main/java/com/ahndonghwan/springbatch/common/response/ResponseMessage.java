package com.ahndonghwan.springbatch.common.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseMessage {

    SUCCESS_TO_CREATE_PRODUCT("상품 생성 성공"),
    ;

    private final String message;
}
