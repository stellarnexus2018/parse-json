package ru.master;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import ru.master.dto.AssetsDto;
import ru.master.dto.MarketIndexRateDto;
import ru.master.dto.MarketNameDto;
import ru.master.dto.NewSample;
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
    String fileAsset = "json/coll_asset.json";
    String fileMNames = "json/mp_market_names.json";
    String fileMp = "json/mp.json";
    String fileMir = "json/coll_mir.json";
    String fileSample = "json/sample.json";
    String fileNs = "json/mp_ser_names.json";




    try {
      /*InputStream insAsset = DataService.getDataStream(fileAsset);
      List<AssetsDto> lstAsset = ParserService.getAssetDtoList(insAsset);
      lstAsset.forEach(System.out::println);*/

     /* InputStream insMir = DataService.getDataStream(fileMir);
      List<MarketIndexRateDto> lstMir = ParserService.getMarketIndexRateDtoList(insMir);*/
//      System.out.println(lstMir.size());
//      lstMir.forEach(System.out::println);

      /*InputStream insMp = DataService.getDataStream(fileMp);
      Map<Long, String> mpMp = ParserService.getMarketNameDtoMap(insMp);

      for (Map.Entry e:mpMp.entrySet()) {
        System.out.println(e.getKey() + " " + e.getValue());
      }*/


      InputStream insNs = DataService.getDataStream(fileNs);
      NewSample newSample = ParserService.getNewSample(insNs);
      System.out.println(newSample);

    } catch (Exception e) {
      e.printStackTrace();
    }


//  log.info("UID:{} (getMwrYield) Полис ID: {} _urgency(S) => {}",               _calc_prot_id, _policy_id, _urgency);


    /*try {
      //CodeLabService.RunOne(fileSample);
      //CodeLabService.RunTwo(fileSample);
      CodeLabService.RunThree();
    } catch (Exception e) {
      e.printStackTrace();
    }*/


  }
}
