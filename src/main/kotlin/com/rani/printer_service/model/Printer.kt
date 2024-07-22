package com.rani.printer_service.model

import com.rani.printer_service.emuns.Models
import java.util.UUID

data class Printer(
    val id: UUID,
    val name: String,
    val model: Models
)