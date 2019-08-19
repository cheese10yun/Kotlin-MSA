package com.msa.commerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class OrderApplication

fun main(args: Array<String>) {
    runApplication<OrderApplication>(*args)
}
