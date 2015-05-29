package com.ashcr.mptc.domain.company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.YearMonth;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Builder
@Getter
public class Company {

    private UUID id;

    private String name;

    private YearMonth dateEstablished;

    private List<CompanyRating> companyRatings;

    private List<String> aliases;

}
