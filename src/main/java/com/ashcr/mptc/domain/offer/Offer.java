package com.ashcr.mptc.domain.offer;

import com.ashcr.mptc.domain.company.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Offer {

    private Company company;

    private Plan plan;

    private String zipCode;

}
