package com.ahndonghwan.springbatch.product.dto.in;

import com.ahndonghwan.springbatch.product.entity.Product;
import com.ahndonghwan.springbatch.product.enums.Status;

public record CreateProductReqDto(String code, String name, String category, Long price) {

    public Product toEntity() {

        return Product.builder()
                .code(code)
                .name(name)
                .category(category)
                .price(price)
                .status(Status.SALE)
                .stock(0L)
                .build();
    }
}
