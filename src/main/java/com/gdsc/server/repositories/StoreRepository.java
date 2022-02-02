package com.gdsc.server.repositories;

import com.gdsc.server.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Set;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 1/29/2022, Sat
 **/
@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    Optional<Store> getByName(final String name);

    Set<Store> getAllByDepartment(final String department);

    @Modifying(clearAutomatically = true)
    @Query("update Store  s set s.name = ?1 where s.id = ?2")
    void updateStoreName(final String name, final Long id);

}
