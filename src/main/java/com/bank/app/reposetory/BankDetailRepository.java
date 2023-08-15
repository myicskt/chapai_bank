package com.bank.app.reposetory;

import com.bank.app.model.BankDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankDetailRepository extends JpaRepository<BankDetail, Long> {

 // List<BankDetail> findByState(String state);
}
