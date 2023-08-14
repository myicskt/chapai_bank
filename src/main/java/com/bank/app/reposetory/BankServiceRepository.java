package com.bank.app.reposetory;

import com.bank.app.model.BankServiceList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankServiceRepository extends JpaRepository<BankServiceList, Long> {
}
