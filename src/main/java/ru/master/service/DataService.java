package ru.master.service;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
public class DataService {
  /**
   * Получение потока из файла-источника
   *
   * @param filePath Путь к источнику
   * @return Целевой поток
   * @throws IOException
   */
  public static InputStream getDataStream(String filePath) throws IOException {
    InputStream resourceAsStream = DataService.class.getClassLoader().getResourceAsStream(filePath);
    return resourceAsStream;
  }
}