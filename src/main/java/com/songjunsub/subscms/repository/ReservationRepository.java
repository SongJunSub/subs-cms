package com.songjunsub.subscms.repository;

import com.songjunsub.subscms.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {}

