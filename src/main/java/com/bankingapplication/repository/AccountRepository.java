package com.bankingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingapplication.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
