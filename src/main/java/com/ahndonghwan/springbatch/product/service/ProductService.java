package com.ahndonghwan.springbatch.product.service;

import com.ahndonghwan.springbatch.product.dto.in.CreateProductReqDto;

public interface ProductService {

    void createProduct(CreateProductReqDto dto);

    void createBulkMockProduct(CreateProductReqDto dto);
}
