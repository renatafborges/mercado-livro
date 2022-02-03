package com.mercadolivro.controller.response

import java.net.ContentHandler
import javax.print.attribute.standard.PagesPerMinute

class PageResponse<T>(
    var itens: List<T>,
    var currentPage: Int,
    var totalItens: Long,
    var totalPages: Int,
)