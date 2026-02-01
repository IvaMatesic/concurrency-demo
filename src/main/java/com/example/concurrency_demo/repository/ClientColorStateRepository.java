package com.example.concurrency_demo.repository;

import com.example.concurrency_demo.model.ClientColorState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientColorStateRepository extends JpaRepository<ClientColorState, Long> {
}
