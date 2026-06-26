package com.ahndonghwan.springbatch.product.vo.in;

import lombok.Getter;

@Getter
public class CreateProductReqVo {

    private String code;
    private String name;
    private String category;
    private Long price;
}
