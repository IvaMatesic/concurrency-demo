package com.example.concurrency_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ClientColorState {
    @Id
    private Long clientId;

    private Color color;
}
