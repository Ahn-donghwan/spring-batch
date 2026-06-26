package com.ahndonghwan.springbatch.product.controller;

import com.ahndonghwan.springbatch.product.dto.in.CreateProductReqDto;
import com.ahndonghwan.springbatch.product.service.ProductService;
import com.ahndonghwan.springbatch.product.vo.in.CreateProductReqVo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    /**
     * 1. 상품 생성
     *
     */

    @PostMapping
    public void createProduct(
            @Valid @RequestBody CreateProductReqVo vo
    ) {
        productService.createProduct(CreateProductReqDto.from(vo));
    }
}
