package com.ashcr.mptc.domain.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Builder
@Getter
public class Customer {

    private UUID id;

    private String firstName;

    private String lastName;

    private String zipCode;

    private List<HistoricMonth> historicMonths;

}
