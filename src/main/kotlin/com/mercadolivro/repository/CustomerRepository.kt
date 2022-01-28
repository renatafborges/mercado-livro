package com.mercadolivro.repository

import com.mercadolivro.model.CustomerResponse
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<CustomerResponse, Int> {

    fun findByNameContaining(name: String): List<CustomerResponse>
    fun existsByEmail(email: String): Boolean

}