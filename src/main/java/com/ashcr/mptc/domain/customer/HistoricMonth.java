package com.ashcr.mptc.domain.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.UUID;

@AllArgsConstructor
@Builder
@Getter
public class HistoricMonth {

    private YearMonth month;

    private Integer daysFromLastRead;

    private Integer kWhUsage;

    private BigDecimal billAmount;

}
