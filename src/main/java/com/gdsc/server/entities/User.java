package com.gdsc.server.entities;

import com.gdsc.server.enums.UserRole;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 1/22/2022, Sat
 **/
@Getter
@Setter
@Entity
@Table(name = "USER")
public class User extends BaseEntity{

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLE")
    private UserRole role;
}
