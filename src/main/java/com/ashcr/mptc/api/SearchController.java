package com.ashcr.mptc.api;

import com.ashcr.mptc.domain.company.Company;
import com.ashcr.mptc.domain.company.CompanyRating;
import com.ashcr.mptc.domain.customer.Customer;
import com.ashcr.mptc.domain.customer.HistoricMonth;
import com.ashcr.mptc.domain.offer.Offer;
import com.ashcr.mptc.domain.offer.Plan;
import com.ashcr.mptc.domain.offer.Pricing;
import com.ashcr.mptc.domain.offer.RateType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class SearchController {

    @RequestMapping("/search")
    public List<Offer> searchOffers(String zipCode) {
        return makeDummyOfferData(zipCode);
    }

    private List<Offer> makeDummyOfferData(String zipCode) {

        Company company1 = getCompany1();
        Company company2 = getCompany2();

        Plan plan1 = makePlan1();
        Plan plan2 = makePlan2();

        List<Offer> offers = new ArrayList<>();

        offers.add(Offer.builder()
                .company(company1)
                .plan(plan1)
                .zipCode(zipCode)
                .build());

        offers.add(Offer.builder()
                .company(company2)
                .plan(plan2)
                .zipCode(zipCode)
                .build());

        return offers;
    }

    private Company getCompany2() {
        return Company.builder()
                    .id(UUID.randomUUID())
                    .name("TXU")
                    .dateEstablished(YearMonth.of(2001, 10))
                    .companyRatings(new ArrayList<CompanyRating>())
                    .aliases(new ArrayList<String>())
                    .build();
    }

    private Company getCompany1() {
        CompanyRating rating1 = CompanyRating.builder()
                .date(YearMonth.of(2015, 1))
                .score(5)
                .build();

        CompanyRating rating2 = CompanyRating.builder()
                .date(YearMonth.of(2014, 1))
                .score(4)
                .build();

        return Company.builder()
                .id(UUID.randomUUID())
                .name("TXU")
                .dateEstablished(YearMonth.of(2001, 10))
                .companyRatings(Arrays.asList(rating1, rating2))
                .aliases(new ArrayList<String>())
                .build();
    }

    private Plan makePlan1() {

        Pricing pricing500 = Pricing.builder().kWhUsage(500).rate(new BigDecimal("0.12")).build();
        Pricing pricing1000 = Pricing.builder().kWhUsage(1000).rate(new BigDecimal("0.10")).build();
        Pricing pricing2000 = Pricing.builder().kWhUsage(2000).rate(new BigDecimal("0.08")).build();
        List<Pricing> pricingList1 = Arrays.asList(pricing500, pricing1000, pricing2000);

        return Plan.builder()
                    .name("The Best 12 Month Plan")
                    .rateType(RateType.FIXED)
                    .termMonths(12)
                    .prepaid(Boolean.FALSE)
                    .pricing(pricingList1)
                    .pricingDetails("Plan 1 pricing details")
                    .cancellationFee(new BigDecimal("150"))
                    .factSheetUrl("http://www.facts.com/")
                    .termsOfServiceUrl("http://www.terms.com/")
                    .enrollmentUrl("http://www.enroll.com/")
                    .enrollmentPhone("800-555-1212")
                    .build();
    }

    private Plan makePlan2() {

        Pricing pricing500 = Pricing.builder().kWhUsage(500).rate(new BigDecimal("0.11")).build();
        Pricing pricing1000 = Pricing.builder().kWhUsage(1000).rate(new BigDecimal("0.09")).build();
        Pricing pricing2000 = Pricing.builder().kWhUsage(2000).rate(new BigDecimal("0.07")).build();
        List<Pricing> pricingList2 = Arrays.asList(pricing500, pricing1000, pricing2000);

        return Plan.builder()
                .name("The Best 24 Month Plan")
                .rateType(RateType.FIXED)
                .termMonths(24)
                .prepaid(Boolean.FALSE)
                .pricing(pricingList2)
                .pricingDetails("Plan 2 pricing details")
                .cancellationFee(new BigDecimal("150"))
                .factSheetUrl("http://www.facts.com/")
                .termsOfServiceUrl("http://www.terms.com/")
                .enrollmentUrl("http://www.enroll.com/")
                .enrollmentPhone("800-555-1212")
                .build();

    }

    private Customer getCustomer(String customerId) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .firstName("Richard")
                .lastName("Ashcraft")
                .zipCode("77396")
                .historicMonths(makeDummyHistoricMonths())
                .build();
    }


    private List<HistoricMonth> makeDummyHistoricMonths() {
        List<HistoricMonth> historicMonths = new ArrayList<>();

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 1))
                .daysFromLastRead(30)
                .kWhUsage(200)
                .billAmount(new BigDecimal("25.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 2))
                .daysFromLastRead(30)
                .kWhUsage(400)
                .billAmount(new BigDecimal("45.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 3))
                .daysFromLastRead(30)
                .kWhUsage(600)
                .billAmount(new BigDecimal("65.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 4))
                .daysFromLastRead(30)
                .kWhUsage(800)
                .billAmount(new BigDecimal("85.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 5))
                .daysFromLastRead(30)
                .kWhUsage(1000)
                .billAmount(new BigDecimal("105.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 6))
                .daysFromLastRead(30)
                .kWhUsage(1200)
                .billAmount(new BigDecimal("125.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 7))
                .daysFromLastRead(30)
                .kWhUsage(1400)
                .billAmount(new BigDecimal("145.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 8))
                .daysFromLastRead(30)
                .kWhUsage(1600)
                .billAmount(new BigDecimal("165.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 9))
                .daysFromLastRead(30)
                .kWhUsage(1800)
                .billAmount(new BigDecimal("185.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 10))
                .daysFromLastRead(30)
                .kWhUsage(2000)
                .billAmount(new BigDecimal("205.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 11))
                .daysFromLastRead(30)
                .kWhUsage(2200)
                .billAmount(new BigDecimal("225.88"))
                .build());

        historicMonths.add(HistoricMonth.builder()
                .month(YearMonth.of(2015, 12))
                .daysFromLastRead(30)
                .kWhUsage(2400)
                .billAmount(new BigDecimal("245.88"))
                .build());

        return historicMonths;
    }

}
