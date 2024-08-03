package com.anderson.controller;
import com.anderson.dto.ContractDto;
import com.anderson.model.Contract;
import com.anderson.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contract/")
public class ContractController {

    @Autowired
    ContractService service;

    @GetMapping("getAll")
    public List<Contract> getAll(){
        return service.getAll();
    }


    @PostMapping("create")
    public ContractDto create(@RequestBody ContractDto dto){
        service.saveContract(dto);
        return dto;
    }


}
