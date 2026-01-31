package com.example.concurrency_demo.model;

import lombok.Getter;

@Getter
public enum Color {
    GREEN("green"),
    YELLOW("yellow"),
    BLUE("blue"),
    RED("red");

    private final String color;

    Color(String color) {
        this.color = color;
    }

}
