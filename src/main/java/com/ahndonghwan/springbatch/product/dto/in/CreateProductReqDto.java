package com.ahndonghwan.springbatch.product.dto.in;

import com.ahndonghwan.springbatch.product.entity.Product;
import com.ahndonghwan.springbatch.product.enums.Status;
import com.ahndonghwan.springbatch.product.vo.in.CreateProductReqVo;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateProductReqDto {

    private String code;
    private String name;
    private String category;
    private Long price;

    @Builder
    public CreateProductReqDto(String code, String name, String category, Long price) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public static CreateProductReqDto from(CreateProductReqVo vo) {

        return CreateProductReqDto.builder()
                .code(vo.getCode())
                .name(vo.getName())
                .category(vo.getCategory())
                .price(vo.getPrice())
                .build();
    }

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
