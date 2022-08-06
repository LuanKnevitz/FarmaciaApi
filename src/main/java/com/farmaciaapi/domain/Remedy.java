package com.farmaciaapi.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "remedy")
public class Remedy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    @Column(name = "category",columnDefinition ="varchar(15)")
    private String categoryEnum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCategoryEnum() {
        return categoryEnum;
    }

    public void setCategoryEnum(String categoryEnum) {
        this.categoryEnum = categoryEnum;
    }
}
