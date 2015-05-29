package com.ashcr.mptc.domain.customer;

import java.math.BigDecimal;
import java.time.Month;
import java.time.Year;

public class HistoricMonth {

    private Year year;

    private Month month;

    private Integer daysFromLastRead;

    private Integer usage;

    private BigDecimal billAmount;

}
