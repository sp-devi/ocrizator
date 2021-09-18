package com.tech.phreeoni.ocrizator.controller

import net.sourceforge.tess4j.*;
import java.io.File;

class OCRController : IOCRController{
    fun processImageFile() {

        try {
            var imageFile = File("/home/spdevi/Pictures/conan_ocr_sample_1.png")
            val tesseract = Tesseract();
            tesseract.setDatapath("/usr/share/tessdata")
            tesseract.setLanguage("jpn")
            var result = tesseract.doOCR(imageFile);
            System.out.println(result)
        } catch(e : Exception) {
            System.out.println(e)
        }
    }
}