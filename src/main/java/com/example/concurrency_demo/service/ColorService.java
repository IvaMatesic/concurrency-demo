package com.example.concurrency_demo.service;

import com.example.concurrency_demo.model.Color;

public interface ColorService {
    Color getColor();
    void setColor(Color color);
}

