package com.mercadolivro.exception

class BadResquestException(override val message: String, val errorCode: String): Exception() {




}