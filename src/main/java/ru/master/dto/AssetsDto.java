package ru.master.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Активы
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class AssetsDto {
  private Boolean locked;

  /**
   * Идентификатор записи справочника "Активы"
   */
  private String isin;

  /**
   * Номинальная стоимость
   */
  private BigDecimal nominalValue;

  /**
   * Идентификатор эмитента
   */
  private Long issuerId;

  /**
   * Идентификатор валюты
   */
  private String currencyCode;

  /**
   * CFI
   */
  private String cfi;

  /**
   * Дата выпуска
   */
  private LocalDate releaseDate;

  /**
   * Дата погащения
   */
  private LocalDate maturityDate;

  /**
   * Наименование
   */
  private String name;

  /**
   * Количество в выпуске
   */
  private Long releaseCount;

  /**
   * Вид актива
   */
  private String assetType;
}