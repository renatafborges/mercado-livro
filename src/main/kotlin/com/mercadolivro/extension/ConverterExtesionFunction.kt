package com.mercadolivro.extension

import com.mercadolivro.controller.request.PostBookRequest
import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutBookRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.controller.response.BookResponse
import com.mercadolivro.controller.response.CustomerResponse
import com.mercadolivro.enums.BookStatus
import com.mercadolivro.enums.CustomerStatus
import com.mercadolivro.model.BookModel

fun PostCustomerRequest.toCustomerModel(): com.mercadolivro.model.CustomerResponse {
    return com.mercadolivro.model.CustomerResponse(name = name, email = email, status = CustomerStatus.ATIVO)
}

fun PutCustomerRequest.toCustomerModel(previousValue: com.mercadolivro.model.CustomerResponse): com.mercadolivro.model.CustomerResponse {
    return com.mercadolivro.model.CustomerResponse(id = previousValue.id, name = name, email = email, status = previousValue.status)
}

fun PostBookRequest.toBookModel(customer: com.mercadolivro.model.CustomerResponse): BookModel {
    return BookModel(
        name = this.name,
        price = this.price,
        status = BookStatus.ATIVO,
        customer = customer
    )

}

    fun PutBookRequest.toBookModel(previousValue: BookModel): BookModel {
        return BookModel(
            id = previousValue.id,
            name = this.name ?: previousValue.name,
            price = this.price ?: previousValue.price,
            status = previousValue.status,
            customer = previousValue.customer,
        )
    }

fun com.mercadolivro.model.CustomerResponse.toResponse(): CustomerResponse {
    return CustomerResponse(
        id = this.id,
        name = this.name,
        email = this.email,
        status = this.status
    )
}

fun BookModel.toResponse(): BookResponse {
    return BookResponse(
        id = this.id,
        name = this.name,
        price = this.price,
        customer = this.customer,
        status = this.status
    )
}
