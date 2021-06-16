package ru.master.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import ru.master.dto.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Slf4j
public class ParserService {
  static ObjectMapper objectMapper;

  static {
    objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
  }

  public static List<AssetsDto> getAssetDtoList(InputStream insAssetsData) throws IOException {
    return objectMapper.readValue(insAssetsData, new TypeReference<List<AssetsDto>>() {});
  }

  public static List<CurrencyRateDto> getCurrencyRateDtoList(InputStream insCurrencyRateData) throws IOException {
    return objectMapper.readValue(insCurrencyRateData, new TypeReference<List<CurrencyRateDto>>() {});
  }

  public static List<DealDto> getDealDtoList(InputStream insDealDtoData) throws IOException {
    return objectMapper.readValue(insDealDtoData, new TypeReference<List<DealDto>>() {});
  }

  public static List<LifeInsuranceSeriesDto> getLifeInsuranceSeriesDtoList(InputStream insLifeInsuranceSeriesDtoData) throws IOException {
    return objectMapper.readValue(insLifeInsuranceSeriesDtoData, new TypeReference<List<LifeInsuranceSeriesDto>>() {});
  }

  public static List<MarketIndexRateDto> getMarketIndexRateDtoList(InputStream insMarketIndexRateDtoData) throws IOException {
    return objectMapper.readValue(insMarketIndexRateDtoData, new TypeReference<List<MarketIndexRateDto>>() {});
  }

  public static List<SecurityQuoteDto> getSecurityQuoteDtoList(InputStream insSecurityQuoteDtoData) throws IOException {
    return objectMapper.readValue(insSecurityQuoteDtoData, new TypeReference<List<SecurityQuoteDto>>() {});
  }

  public static Map<Long, String> getMarketNameDtoMap(InputStream insMarketNameDtoData) throws IOException {
    return objectMapper.readValue(insMarketNameDtoData, new TypeReference<Map<Long, String>>() {});
  }

  public static Map<Long, SerieNameDto> getSerieNameDtoDtoMap(InputStream insSerieNameDtoData) throws IOException {
    return objectMapper.readValue(insSerieNameDtoData, new TypeReference<Map<Long, SerieNameDto>>() {});
  }

  public static NewSample getNewSample(InputStream insNewSample) throws IOException {
    return objectMapper.readValue(insNewSample, new TypeReference<NewSample>() {});
  }
}