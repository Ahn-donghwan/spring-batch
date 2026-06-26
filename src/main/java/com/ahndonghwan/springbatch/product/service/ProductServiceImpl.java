package com.ahndonghwan.springbatch.product.service;

import com.ahndonghwan.springbatch.product.dto.in.CreateProductReqDto;
import com.ahndonghwan.springbatch.product.entity.Product;
import com.ahndonghwan.springbatch.product.enums.Status;
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

    @Transactional
    @Override
    public void createBulkMockProduct(CreateProductReqDto dto) {

        for (int i = 0; i < 1000; i++) {

            productRepository.save(
                    Product.builder()
                        .code(dto.getCode() + i)
                        .name(dto.getName())
                        .category(dto.getCategory())
                        .price(dto.getPrice())
                        .status(Status.SALE)
                        .stock(0L)
                        .build()
            );
        }
    }
}
