package com.songjunsub.subscms.repository;

import com.songjunsub.subscms.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}

