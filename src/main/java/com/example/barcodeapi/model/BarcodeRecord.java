package com.example.barcodeapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "barcode_records")
public class BarcodeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String barcodeValue;

    private LocalDateTime createdAt = LocalDateTime.now();

    public BarcodeRecord() {}

    public BarcodeRecord(String barcodeValue) {
        this.barcodeValue = barcodeValue;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getBarcodeValue() { return barcodeValue; }
    public void setBarcodeValue(String barcodeValue) { this.barcodeValue = barcodeValue; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
