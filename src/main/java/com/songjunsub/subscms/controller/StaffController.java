package com.songjunsub.subscms.controller;

import com.songjunsub.subscms.domain.Staff;
import com.songjunsub.subscms.repository.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/staffs")
@RequiredArgsConstructor
public class StaffController {
    private final StaffRepository staffRepository;
    @GetMapping
    public List<Staff> getAll() { return staffRepository.findAll(); }
    @PostMapping
    public Staff create(@RequestBody Staff s) { return staffRepository.save(s); }
}

