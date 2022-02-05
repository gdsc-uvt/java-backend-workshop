package com.gdsc.server.entities;

import com.gdsc.server.enums.StoreType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 1/29/2022, Sat
 **/
@Getter
@Setter
@Entity
@Table(name = "STORE")
public class Store extends BaseEntity{

    @Column(name = "NAME")
    private String name;

    @Column(name = "STORE_TYPE")
    private StoreType storeType;

    @OneToMany
    @JoinColumn(name = "STORE_ID")
    private List<Product> products;
}
