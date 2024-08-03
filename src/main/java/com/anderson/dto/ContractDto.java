package com.anderson.dto;
import java.time.LocalDate;

public record ContractDto(int number,
                          String name,
                          LocalDate startDate,
                          LocalDate endDate,
                          String details) {
}
