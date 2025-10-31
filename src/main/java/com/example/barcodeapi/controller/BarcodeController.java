package com.example.barcodeapi.controller;

import com.example.barcodeapi.model.BarcodeRecord;
import com.example.barcodeapi.repository.BarcodeRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/barcodes")
@CrossOrigin(origins = "*") // allow calls from Android app
public class BarcodeController {

    private final BarcodeRepository repository;

    public BarcodeController(BarcodeRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public BarcodeRecord saveBarcode(@RequestBody BarcodeRecord barcode) {
        System.out.println(" Received request to save barcode!");
        System.out.println(" Barcode value received: " + barcode.getBarcodeValue());
        System.out.println(" CreatedAt: " + barcode.getCreatedAt());

        BarcodeRecord savedRecord = repository.save(barcode);
        System.out.println("✅Barcode saved in DB with ID: " + savedRecord.getId());

        return savedRecord;
    }

}
