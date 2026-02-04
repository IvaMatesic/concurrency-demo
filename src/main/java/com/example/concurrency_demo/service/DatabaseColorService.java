package com.example.concurrency_demo.service;

import com.example.concurrency_demo.model.ClientColorState;
import com.example.concurrency_demo.model.Color;
import com.example.concurrency_demo.repository.ClientColorStateRepository;
import org.springframework.stereotype.Service;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class DatabaseColorService implements ColorService {

    private final ClientColorStateRepository repository;

    public DatabaseColorService(ClientColorStateRepository repository) {
        this.repository = repository;
    }

    @Override
    public Color getColor() {
        return repository.findAll().stream().findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No current color present"))
                .getColor();
    }

    @Override
    public void setColor(Color newColor) {
        ClientColorState currentColor = repository.findAll().stream().findFirst().orElseThrow(() -> new IllegalArgumentException("No current color present"));
        currentColor.setColor(newColor);
        repository.save(currentColor);
    }
}