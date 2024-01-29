package com.waterplant.khata.repositories;


import com.waterplant.khata.entities.Khata;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KhataRepository extends JpaRepository<Khata,Long> {
//    @Query(value = "DELETE FROM khata WHERE account_acc_id IN (?);",nativeQuery = true)
    @Transactional
    Optional deleteByaccountAccId(long accId);

    List<Khata> findByaccountAccId(long accId);
}
