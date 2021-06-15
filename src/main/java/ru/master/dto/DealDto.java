package ru.master.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Сделки на фондовом рынке
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class DealDto {
  /**
   * Идентификатор записи справочника "Активы"
   */
  private String isin;

  /**
   * Дата события
   */
  private LocalDate quotationDate;

  /**
   * Цена
   */
  private BigDecimal price;

  /**
   * Цена апродажи
   */
  private BigDecimal sellingPrice;

  /**
   * Контрагент
   */
  private String counterparty;

  /**
   * Биржа
   */
  private Long stockExchangeId;
}