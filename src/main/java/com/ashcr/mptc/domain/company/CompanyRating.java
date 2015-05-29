package com.ashcr.mptc.domain.company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

@AllArgsConstructor
@Builder
@Getter
public class CompanyRating {

    YearMonth date;

    Integer score;

}
