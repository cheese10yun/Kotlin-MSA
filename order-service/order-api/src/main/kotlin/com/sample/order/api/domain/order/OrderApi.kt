package com.sample.order.api.domain.order

import com.sample.order.api.domain.order.dto.OrderRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("orders")
class OrderApi {

    @PostMapping
    fun order(@RequestBody @Valid orderRequest: OrderRequest): OrderRequest {
        return orderRequest
    }
}