package com.example.barcodeapi.repository;

import com.example.barcodeapi.model.BarcodeRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarcodeRepository extends JpaRepository<BarcodeRecord, Long> {
}
