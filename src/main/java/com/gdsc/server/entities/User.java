package com.gdsc.server.entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

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
}
