package ru.master.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class SampleDto {
  @JsonProperty("sample_id")
  private int id;
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")
  private String lastName;
  @JsonProperty("sample_vdat")
  private LocalDateTime vdat;

  public SampleDto() {
  }

  public SampleDto(int id, String firstName, String lastName, LocalDateTime vdat) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.vdat = vdat;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDateTime getVdat() {
    return vdat;
  }

  public void setVdat(LocalDateTime vdat) {
    this.vdat = vdat;
  }

  @Override
  public String toString() {
    return "SampleDto{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", vdat=" + vdat +
        '}';
  }
}
