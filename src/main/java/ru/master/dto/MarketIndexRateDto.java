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
public class MarketIndexRateDto {
  /**
   * Наименование (идентификатор) индекса базового актива
   */
  private String marketIndexId;

  /**
   * Дата котировки
   */
  private LocalDate quotationDate;

  /**
   * Цена закрытия
   */
  private BigDecimal closePrice;

  /**
   * Биржа
   */
  private Long stockExchangeId;

  /**
   * Цена открытия
   */
  private BigDecimal openingPrice;

  /**
   * Цена максимума
   */
  private BigDecimal maxPrice;

  /**
   * Цена минимума
   */
  private BigDecimal minPrice;
}