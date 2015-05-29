package com.ashcr.mptc.domain.company;

import java.time.YearMonth;
import java.util.List;

public class Company {

    private Integer id;

    private String name;

    private YearMonth dateEstablished;

    private List<CompanyRating> companyRatings;

    private List<String> aliases;
}
