package com.anderson.service;

import com.anderson.dto.ContractDto;
import com.anderson.model.Contract;
import com.anderson.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService{

    @Autowired
    private ContractRepository repository;

    public void saveContract( ContractDto dto){
        Contract contract = new Contract();
        contract.setNumber(dto.number());
        contract.setName(dto.name());
        contract.setStartDate(dto.startDate());
        contract.setEndDate(dto.endDate());
        contract.setDetails(dto.details());
        repository.save(contract);
    }

    public List<Contract> getAll(){
        List<Contract> list = repository.findAll();
        return list;
    }

}
