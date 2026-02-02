package com.example.concurrency_demo.service;

import com.example.concurrency_demo.model.Color;
import com.example.concurrency_demo.repository.ClientColorStateRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientColorStateService {

    private final ClientColorStateRepository repository;

    public ClientColorStateService(ClientColorStateRepository repository) {
        this.repository = repository;
    }

    public Color getColor(Long clientId) {
        return repository.findById(clientId)
                .orElseThrow(() -> new IllegalArgumentException("ClientColorState not found for clientId=" + clientId))
                .getColor();
    }

    public String getColorAsString(Long clientId) {
        return getColor(clientId).toString();
    }
}