package com.mercadolivro.request

import javax.validation.constraints.NotNull
import javax.validation.constraints.Positive

data class PostPurchaseRequest(

    @field:Positive
    @field:NotNull
    val customerId: Int,

    @field:NotNull
    val bookIds: Set<Int>

)