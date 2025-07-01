package com.songjunsub.subscms.config;

import com.songjunsub.subscms.domain.Room;
import com.songjunsub.subscms.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitConfig {
    @Bean
    public CommandLineRunner dataLoader(RoomRepository roomRepository) {
        return args -> {
            if (roomRepository.count() == 0) {
                roomRepository.save(Room.builder().name("101호").capacity(2).price(100000).description("2인실").build());
                roomRepository.save(Room.builder().name("102호").capacity(4).price(180000).description("4인실").build());
            }
        };
    }
}

