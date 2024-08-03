package com.anderson.repository;
import com.anderson.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ContractRepository extends JpaRepository <Contract, UUID> {
    List<Optional> findByNumber(int number);
}
