package com.gdsc.server.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 1/29/2022, Sat
 **/
@Getter
@Setter
@Entity
@Table(name = "PRODUCT")
public class Product extends BaseEntity{

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private long price;

    @Column(name = "UNITS")
    private long units;

    @ManyToOne
    @JoinColumn(name = "STORE_ID")
    private Store store;
}
