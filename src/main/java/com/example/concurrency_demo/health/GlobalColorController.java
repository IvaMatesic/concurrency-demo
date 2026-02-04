package com.example.concurrency_demo.health;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/global-color")
@RequiredArgsConstructor
public class GlobalColorController {
}
