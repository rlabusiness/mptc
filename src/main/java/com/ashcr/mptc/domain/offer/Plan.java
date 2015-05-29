package com.ashcr.mptc.domain.offer;

import java.math.BigDecimal;
import java.util.List;

public class Plan {

    private String name;

    private RateType rateType;

    private Integer termMonths;

    private Boolean prepaid;

    private List<Pricing> pricing;

    private String pricingDetails;

    private BigDecimal cancellationFee;

    private String factSheetUrl;

    private String termsOfServiceUrl;

    private String enrollmentUrl;

    private String enrollmentPhone;

}
