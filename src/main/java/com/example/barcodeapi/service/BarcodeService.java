package com.example.barcodeapi.service;

import org.springframework.stereotype.Service;

import com.example.barcodeapi.dto.BarcodeRequest;
import com.example.barcodeapi.model.BarcodeRecord;
import com.example.barcodeapi.repository.BarcodeRepository;

@Service
public class BarcodeService {

    private final BarcodeRepository repo;

    public BarcodeService(BarcodeRepository repo) {
        this.repo = repo;
    }

    public BarcodeRecord saveBarcode(BarcodeRequest req) {
        System.out.println(" Inside BarcodeService.saveBarcode()");
        System.out.println("Received barcode from request: " + req.getBarcode());
        System.out.println("CreatedBy: " + req.getCreatedBy());

        BarcodeRecord entity = new BarcodeRecord();
        entity.setBarcodeValue(req.getBarcode());

        BarcodeRecord saved = repo.save(entity);
        System.out.println("Saved barcode to DB with ID: " + saved.getId());

        return saved;
    }

}
