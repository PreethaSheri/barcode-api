package com.example.barcodeapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BarcodeRequest {

    @NotBlank
    @Size(max = 256)
    private String barcode;

    private String createdBy;

    public BarcodeRequest() {}

    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }
}
