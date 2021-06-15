package ru.master.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import ru.master.dto.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Slf4j
public class ParserService {
  public static List<AssetsDto> getAssetDtoList(InputStream insAssetsData) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    List<AssetsDto> lstAssets = objectMapper.readValue(insAssetsData, /*new TypeReference<List<AssetsDto>>() {}*/ List.class);
    return lstAssets;
  }

  public static List<CurrencyRateDto> getCurrencyRateDtoList(InputStream insCurrencyRateData) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    List<CurrencyRateDto> lstCurrencyRate = objectMapper.readValue(insCurrencyRateData, new TypeReference<List<CurrencyRateDto>>() {
    });
    return lstCurrencyRate;
  }

  public static List<DealDto> getDealDtoList(InputStream insDealDtoData) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    List<DealDto> lstDealDto = objectMapper.readValue(insDealDtoData, new TypeReference<List<DealDto>>() {
    });
    return lstDealDto;
  }

  public static List<LifeInsuranceSeriesDto> getLifeInsuranceSeriesDtoList(InputStream insLifeInsuranceSeriesDtoData) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    List<LifeInsuranceSeriesDto> lstLifeInsuranceSeriesDto = objectMapper.readValue(insLifeInsuranceSeriesDtoData, new TypeReference<List<LifeInsuranceSeriesDto>>() {
    });
    return lstLifeInsuranceSeriesDto;
  }

  public static List<MarketIndexRateDto> getMarketIndexRateDtoList(InputStream insMarketIndexRateDtoData) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    List<MarketIndexRateDto> lstMarketIndexRateDto = objectMapper.readValue(insMarketIndexRateDtoData, List.class /*new TypeReference<List<MarketIndexRateDto>>() {}*/);
    return lstMarketIndexRateDto;
  }

  public static List<SecurityQuoteDto> getSecurityQuoteDtoList(InputStream insSecurityQuoteDtoData) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    List<SecurityQuoteDto> lstSecurityQuoteDto = objectMapper.readValue(insSecurityQuoteDtoData, new TypeReference<List<SecurityQuoteDto>>() {
    });
    return lstSecurityQuoteDto;
  }

  public static Map<Long, MarketNameDto> getMarketNameDtoMap(InputStream insMarketNameDtoData) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    Map<Long, MarketNameDto> mapMarketNameDto = objectMapper.readValue(insMarketNameDtoData, new TypeReference<Map<Long, MarketNameDto>>() {
    });
    return mapMarketNameDto;
  }

  public static Map<Long, SerieNameDto> getSerieNameDtoDtoMap(InputStream insSerieNameDtoData) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    Map<Long, SerieNameDto> mapSerieNameDto = objectMapper.readValue(insSerieNameDtoData, new TypeReference<Map<Long, SerieNameDto>>() {
    });
    return mapSerieNameDto;
  }
}