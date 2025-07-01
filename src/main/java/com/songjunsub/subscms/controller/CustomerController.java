package com.songjunsub.subscms.controller;

import com.songjunsub.subscms.domain.Customer;
import com.songjunsub.subscms.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerRepository customerRepository;
    @GetMapping
    public List<Customer> getAll() { return customerRepository.findAll(); }
    @PostMapping
    public Customer create(@RequestBody Customer c) { return customerRepository.save(c); }
}

