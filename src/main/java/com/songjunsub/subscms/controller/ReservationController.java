package com.songjunsub.subscms.controller;

import com.songjunsub.subscms.domain.Reservation;
import com.songjunsub.subscms.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservations")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationRepository reservationRepository;
    @GetMapping
    public List<Reservation> getAll() { return reservationRepository.findAll(); }
    @PostMapping
    public Reservation create(@RequestBody Reservation r) { return reservationRepository.save(r); }
}

