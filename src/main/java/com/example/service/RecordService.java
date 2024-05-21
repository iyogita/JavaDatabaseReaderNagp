package com.example.service;

import com.example.entity.Record;
import com.example.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }
}
