package com.waterplant.khata.repositories;

import com.waterplant.khata.entities.Grahak;
import com.waterplant.khata.entities.Khata;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface GrahakRepository extends JpaRepository<Grahak, Long> {

//    @Query(value = "DELETE FROM grahak WHERE account_acc_id IN (?);",nativeQuery = true)
    @Transactional
    Optional deleteByaccountAccId(long accId);

    @Query(value = "SELECT * FROM grahak p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')", nativeQuery = true)
    List<Grahak> searchGrahak(String query);

    List<Grahak> findByOrderByNameAsc();
}
