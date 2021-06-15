package ru.master;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import ru.master.dto.AssetsDto;
import ru.master.dto.MarketIndexRateDto;
import ru.master.dto.MarketNameDto;
import ru.master.service.CodeLabService;
import ru.master.service.DataService;
import ru.master.service.ParserService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Slf4j
public class StartApp {
  public static void main(String[] args) {
    String fileCollAsset = "json/coll_asset.json";
    String fileMapMNames = "json/mp_market_names.json";
    String fileMir = "json/coll_mir.json";
    String fileSample = "json/sample.json";

    /*try {
      InputStream insMir = DataService.getDataStream(fileMir);
      List<MarketIndexRateDto> mirList = ParserService.getMarketIndexRateDtoList(insMir);
      System.out.println(mirList);
    } catch (IOException e) {
      e.printStackTrace();
    }*/


//  log.info("UID:{} (getMwrYield) Полис ID: {} _urgency(S) => {}",               _calc_prot_id, _policy_id, _urgency);


    try {
//      CodeLabService.RunOne(fileSample);
      CodeLabService.RunTwo(fileSample);
    } catch (Exception e) {
      e.printStackTrace();
    }


  }
}
