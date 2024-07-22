package com.rani.printer_service.controller

import com.rani.printer_service.controller.printer.PrinterResponse
import com.rani.printer_service.model.Printer
import com.rani.printer_service.service.PrinterService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/printer")
class PrinterController (
    private val printerService: PrinterService
){

    @GetMapping
    fun listAll(): List<PrinterResponse> =
        printerService.findAll().map { it.toResponse() }

    private fun Printer.toResponse() : PrinterResponse =
        PrinterResponse(
            id = this.id,
            name = this.name,
            model = this.model
        )
}