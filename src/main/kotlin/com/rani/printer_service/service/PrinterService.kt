package com.rani.printer_service.service

import com.rani.printer_service.model.Printer
import com.rani.printer_service.repository.PrinterRepository
import org.springframework.stereotype.Service

@Service
class PrinterService (private val printerRepository: PrinterRepository) {
    fun findAll(): List<Printer> = printerRepository.findAll()
}