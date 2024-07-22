package com.rani.printer_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrinterServiceApplication

fun main(args: Array<String>) {
	runApplication<PrinterServiceApplication>(*args)
}
