package com.ashcr.mptc.domain.offer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Getter
public class Pricing {

    private Integer kWhUsage;

    private BigDecimal rate;

}
