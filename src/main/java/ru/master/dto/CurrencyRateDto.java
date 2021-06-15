package ru.master.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * ЦБ Курс валюты (валюта котировки - рубль)
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class CurrencyRateDto {
  /**
   * Идентификатор (буквенный код  валюты alfa-3: RUB, USD,...)
   */
  private String currencyCode;

  /**
   * Дата курса
   */
  private LocalDate rateDate;

  /**
   * Значение курса
   */
  private BigDecimal rate;
}