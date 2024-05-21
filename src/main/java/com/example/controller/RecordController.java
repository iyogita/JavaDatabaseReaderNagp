package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;

    @GetMapping("/records")
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }
}
