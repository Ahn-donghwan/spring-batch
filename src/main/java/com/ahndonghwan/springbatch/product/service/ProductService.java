package com.ahndonghwan.springbatch.product.service;

import com.ahndonghwan.springbatch.product.dto.in.CreateProductReqDto;
import com.ahndonghwan.springbatch.product.dto.out.GetProductDetailResDto;

public interface ProductService {

    void createProduct(CreateProductReqDto dto);

    void createBulkMockProduct(CreateProductReqDto dto);

    GetProductDetailResDto getProductDetailByCode(String code);
}
