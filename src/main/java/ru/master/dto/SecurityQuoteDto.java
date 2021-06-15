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
public class SecurityQuoteDto {
  /**
   * Идентификатор записи справочника "Активы"
   */
  private String isin;

  /**
   * Дата котировки
   */
  private LocalDate quotationDate;

  /**
   * Признаваемая котировка
   */
  private BigDecimal recognizedQuotation;

  /**
   * Идентификатор биржи
   */
  private long stockExchangeId;

  /**
   * Актив
   */
  private String active;

  /**
   * Цена спроса BID
   */
  private BigDecimal demandPriceBid;

  /**
   * Цена закрытия
   */
  private BigDecimal closingPrice;

  /**
   * Цена предложения
   */
  private BigDecimal offerPrice;
}