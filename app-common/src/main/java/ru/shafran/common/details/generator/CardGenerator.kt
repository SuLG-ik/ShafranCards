package ru.shafran.common.details.generator

import ru.shafran.common.details.edit.CustomerEditor
import ru.shafran.network.customers.data.CreateCustomerRequest

interface CardGenerator {

    val editor: CustomerEditor

    fun onGenerate(request: CreateCustomerRequest)

}