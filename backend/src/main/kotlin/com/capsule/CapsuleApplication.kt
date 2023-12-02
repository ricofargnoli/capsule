package com.capsule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CapsuleApplication

fun main(args: Array<String>) {
	runApplication<CapsuleApplication>(*args)
}
