package com.ahndonghwan.springbatch.product.entity;

import com.ahndonghwan.springbatch.common.Timestamp;
import com.ahndonghwan.springbatch.product.enums.Status;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Product extends Timestamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Long price;

    @Column(nullable = false)
    private Long stock;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Builder
    public Product(
            Long id, String code, String name, String category, Long price, Long stock, Status status
    ) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.status = status;
    }
}
