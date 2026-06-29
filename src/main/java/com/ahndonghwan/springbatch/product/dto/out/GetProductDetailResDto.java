package com.ahndonghwan.springbatch.product.dto.out;

import com.ahndonghwan.springbatch.product.entity.Product;
import lombok.Builder;

@Builder
public record GetProductDetailResDto(String code, String name, String category, Long price) {

    public static GetProductDetailResDto from(Product product) {

        return GetProductDetailResDto.builder()
                .code(product.getCode())
                .name(product.getName())
                .category(product.getCategory())
                .price(product.getPrice())
                .build();
    }
}
