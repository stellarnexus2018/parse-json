package ru.master.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class LifeInsuranceSeriesDto {
  private Long id;
  private Long seriesId;
  private Long seriesDescriptionId;
  private String channel;
  private Integer years;
  private Integer snsRisk;
  private String guarantee;
  private BigDecimal guaranteeFund;
  private BigDecimal investmentFund;
  private BigDecimal icCommissionContractConclusionOption;
  private BigDecimal bankCommissionContractConclusionOption;
  private BigDecimal icCommissionAdditionalPaymentOption;
  private BigDecimal bankCommissionAdditionalPaymentOption;
  private BigDecimal guaranteedProfit;
  private BigDecimal planningProfit;
  private BigDecimal guaranteeRate;
  private BigDecimal icCommissionChangeFundOption;
  private BigDecimal icCommissionAttachmentOption;
  private String paymentFrequency;
  private String couponScheme;
  private String productGroup;
  private String description;
  private BigDecimal guaranteedCouponRate;
  private String deathRiskPaymentErrorType;
  private BigDecimal accidentRate;
  private BigDecimal zFactor;
  private String currencyCode;
  private LocalDate seriesBeginDate;
  private LocalDate seriesEndDate;
  private BigDecimal icAdditionalPayment;
  private BigDecimal icAttachment;
  private BigDecimal change;
}