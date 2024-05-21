package com.example.nagp.service;

import com.example.nagp.entity.Record;
import com.example.nagp.repository.RecordRepository;
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
