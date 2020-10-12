package com.example.demo.gradle

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class DemoApplication {

    private val logger = LoggerFactory.getLogger(javaClass)

    @GetMapping("/test")
    fun test() : String {
        logger.info("Gradle - TEST!!!")

        throw RuntimeException("Gradle - IS EXCEPTION OCCURS")
    }

    @GetMapping("/test2")
    fun test2() : String {
        logger.info("Gradle - TEST22222!!!")

        throw RuntimeException("Gradle - IS EXCEPTION2222 OCCURS")
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
