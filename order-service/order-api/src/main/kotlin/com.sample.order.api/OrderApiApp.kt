package com.sample.order.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrderApiApp

fun main(args: Array<String>) {
    runApplication<OrderApiApp>(*args)
}