package com.gdsc.server.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 1/29/2022, Sat
 **/
@Getter
@Setter
@Entity
@Table(name = "STORE")
public class Product extends BaseEntity{

    private String name;

    @ManyToOne
    @JoinColumn(name = "STORE_ID")
    private Store store;
}
