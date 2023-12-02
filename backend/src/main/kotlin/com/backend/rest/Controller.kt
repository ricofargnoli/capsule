package com.backend.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/health")
    fun health(): ResponseEntity<String> {
        return ResponseEntity.ok("Application is up and running")
    }
}