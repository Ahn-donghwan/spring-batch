package com.ahndonghwan.springbatch.product.service;

import com.ahndonghwan.springbatch.product.dto.in.CreateProductReqDto;
import com.ahndonghwan.springbatch.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Transactional
    @Override
    public void createProduct(CreateProductReqDto dto) {

        productRepository.save(dto.toEntity());
    }
}
