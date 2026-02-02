package com.example.concurrency_demo.health;

import com.example.concurrency_demo.service.ClientColorStateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/color")
public class ClientColorStateController {

    private final ClientColorStateService clientColorStateService;

    public ClientColorStateController(ClientColorStateService clientColorStateService) {
        this.clientColorStateService = clientColorStateService;
    }

    @GetMapping()
    public String getColor() {
        return clientColorStateService.getColorAsString(1L);
    }
}