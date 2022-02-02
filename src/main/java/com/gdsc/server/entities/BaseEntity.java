package com.gdsc.server.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 1/29/2022, Sat
 **/
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @SequenceGenerator(name = "generator", sequenceName = "seq")
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "DATABASE_VERSION")
    private Long databaseVersion;

    /**
     * Time of entity creation.
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_ON")
    private Date createdOn = new Date(System.currentTimeMillis());

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_ON")
    private Date updatedOn;

    @PreUpdate
    public void setUpdatedOn() {
        updatedOn = new Date(System.currentTimeMillis());
    }

}
