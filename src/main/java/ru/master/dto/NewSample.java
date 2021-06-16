package ru.master.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class NewSample {
  private Map<Long, String> mp_ser_names;
}