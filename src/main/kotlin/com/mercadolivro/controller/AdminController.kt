package com.mercadolivro.controller

import com.mercadolivro.controller.response.CustomerResponse
import com.mercadolivro.extension.toResponse
import com.mercadolivro.service.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("admin")
class AdminController(
    private val customerService : CustomerService
) {

    @GetMapping("/reports")
    fun report(): String {
        return "This is report. Only admin can see it"
    }



}