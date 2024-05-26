package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;

    @GetMapping("/records")
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    //part of version 2
    @GetMapping("/")
    public String get() {
        return "Welcome to kubernetes demo by Yogita !!!";
    }

}
