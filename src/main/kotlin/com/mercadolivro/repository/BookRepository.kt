package com.mercadolivro.repository

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.BookModel
import com.mercadolivro.model.CustomerResponse
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface BookRepository : JpaRepository<BookModel, Int> {
    abstract fun findByStatus(status: BookStatus, pageable: Pageable): Page<BookModel>
    abstract fun findByCustomer(customer: CustomerResponse): List<BookModel>

//    fun findAll(pageable: Pageable): Page<BookModel>

}