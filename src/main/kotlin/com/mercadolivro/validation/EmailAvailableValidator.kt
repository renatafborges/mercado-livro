package com.mercadolivro.validation

import com.mercadolivro.service.CustomerService
import java.security.Provider
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class EmailAvailableValidator(private var customerService: CustomerService): ConstraintValidator<EmailAvailable, String> {

    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        if(value.isNullOrEmpty()) {
            return false
        }
     return customerService.emailAvailable(value)
    }
}
