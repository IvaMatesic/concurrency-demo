package com.example.concurrency_demo.service;

import com.example.concurrency_demo.model.ClientColorState;
import com.example.concurrency_demo.model.Color;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicReference;

@Service

public class InMemoryColorService implements ColorService  {
    private final AtomicReference<Color> currentColor = new AtomicReference<>(Color.BLUE);


    @Override
    public Color getColor() {
        return currentColor.get();
    }

    @Override
    public void setColor(Color newColor) {
        currentColor.set(newColor);
    }
}
