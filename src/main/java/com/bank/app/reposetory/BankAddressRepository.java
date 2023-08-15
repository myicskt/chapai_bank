package com.bank.app.reposetory;

import com.bank.app.model.BankAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAddressRepository extends JpaRepository<BankAddress, Long> {
}
