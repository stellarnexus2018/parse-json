package ru.master.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ru.master.dto.MarketIndexRateDto;
import ru.master.dto.SampleDto;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;

public class CodeLabService {


  public static void RunOne(String sampleFilePath) throws JsonProcessingException {

    SampleDto sampleDto = new SampleDto();
    sampleDto.setId(1);
    sampleDto.setFirstName("Igor");
    sampleDto.setLastName("Grigoryev");
    sampleDto.setVdat(LocalDateTime.now());


    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    //objectMapper.enable(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);

    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);


    String s = objectMapper.writeValueAsString(sampleDto);

    System.out.println(s);


  }

  public static void RunTwo(String sampleFilePath) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
//    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//    objectMapper.enable(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);

    //objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    InputStream insSample = DataService.getDataStream(sampleFilePath);

    SampleDto sampleDto = objectMapper.readValue(insSample, SampleDto.class);
    System.out.println(sampleDto);
  }
}

/*
{
  "id" : 1,
  "firstName" : "Igor",
  "lastName" : "Grigoryev",
  "vdat" : 1623792815338
}
*/

/*
{
    "sample_id" : 1,
    "first_name" : "Igor",
    "last_name" : "Grigoryev",
    "sample_vdat" : [ 2021, 6, 16, 1, 5, 50, 328467000 ]
}
*/
 /*"sample_vdat" : {
    "year": 2025,
    "month": "MAY",
    "chronology": {
      "calendarType": "iso8601",
      "id": "ISO"
    },
    "leapYear": false,
    "dayOfWeek": "MONDAY",
    "dayOfYear": 125,
    "era": "CE",
    "monthValue": 5,
    "dayOfMonth": 5
  }*/