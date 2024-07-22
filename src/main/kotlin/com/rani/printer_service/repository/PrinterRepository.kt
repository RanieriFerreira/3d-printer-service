package com.rani.printer_service.repository

import com.rani.printer_service.emuns.Models
import com.rani.printer_service.model.Printer
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class PrinterRepository {

    private val printers = listOf(
        Printer(id = UUID.randomUUID(), name = "Home Printer", model = Models.ENDER),
        Printer(id = UUID.randomUUID(), name = "Office Printer", model = Models.PRUSA)
    )

    fun findAll(): List<Printer> =
        printers
}