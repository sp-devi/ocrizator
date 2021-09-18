package com.tech.phreeoni.ocrizator

import com.tech.phreeoni.ocrizator.controller.OCRController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.File

@SpringBootApplication
class OcrizatorApplication

fun main(args: Array<String>) {
    runApplication<OcrizatorApplication>(*args)
    System.out.println("Starting image ocr...")
    var ocrController = OCRController()
	ocrController.processImageFile()
}
