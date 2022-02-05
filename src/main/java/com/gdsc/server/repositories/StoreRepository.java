package com.gdsc.server.repositories;

import com.gdsc.server.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 1/29/2022, Sat
 **/
@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

}
