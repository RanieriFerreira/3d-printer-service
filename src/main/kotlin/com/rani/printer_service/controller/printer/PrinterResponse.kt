package com.rani.printer_service.controller.printer

import com.rani.printer_service.emuns.Models
import java.util.*

data class PrinterResponse(
    val id: UUID,
    val name: String,
    val model: Models
)