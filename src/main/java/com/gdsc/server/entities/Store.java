package com.gdsc.server.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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

    private String name;

    private String department;

    @OneToMany
    @JoinColumn(name = "STORE_ID")
    private List<Product> products;
}
