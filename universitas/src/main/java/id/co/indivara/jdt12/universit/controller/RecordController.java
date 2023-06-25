package id.co.indivara.jdt12.universit.controller;

import id.co.indivara.jdt12.universit.entity.Record;
import id.co.indivara.jdt12.universit.repo.RecordRepository;
import id.co.indivara.jdt12.universit.repo.ResponMessage;
import id.co.indivara.jdt12.universit.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RecordController {
    @Autowired
    RecordService recordService;

    @PostMapping("add/grade")
    public Record createRecord(@RequestBody Record record)throws Exception{
        return recordService.createRecord(record);
    }
}
