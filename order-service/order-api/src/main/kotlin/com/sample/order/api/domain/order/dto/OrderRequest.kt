package com.sample.order.api.domain.order.dto

import java.math.BigDecimal
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty

data class OrderRequest(
    @get:NotEmpty
    val name: String,
    @get:Min(1)
    val price: BigDecimal
)
