package com.ahndonghwan.springbatch.product.controller;

import com.ahndonghwan.springbatch.common.response.ApiResponse;
import com.ahndonghwan.springbatch.common.response.ResponseMessage;
import com.ahndonghwan.springbatch.product.dto.in.CreateProductReqDto;
import com.ahndonghwan.springbatch.product.dto.out.GetProductDetailResDto;
import com.ahndonghwan.springbatch.product.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    /**
     * 1. 상품 생성 (단건)
     * 2. 상품 생성 (벌크)
     * 3. 상품 단건 조회 by 코드
     *
     */

    /**
     * 1. 상품 생성
     *
     * @param dto
     */
    @PostMapping
    public ApiResponse<Void> createProduct(@Valid @RequestBody CreateProductReqDto dto) {
        productService.createProduct(dto);
        return new ApiResponse<>(ResponseMessage.SUCCESS_TO_CREATE_PRODUCT);
    }

    /**
     * 2. 상품 벌크 생성
     *
     * @param dto
     */
    @PostMapping("/bulk/mock/1000")
    public void createBulkMockProduct(@Valid @RequestBody CreateProductReqDto dto) {
        productService.createBulkMockProduct(dto);
    }

    /**
     * 3. 상품 단건 조회 by 코드
     *
     * @param code
     * @return
     */
    @GetMapping("/{code}")
    public GetProductDetailResDto getProductDetailByCode(@PathVariable String code) {
        return productService.getProductDetailByCode(code);
    }
}
