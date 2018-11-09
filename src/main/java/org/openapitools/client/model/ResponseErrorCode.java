/*
 * Phonebook API
 * RESTful API for Messente phonebook
 *
 * OpenAPI spec version: 0.0.1
 * Contact: messente@messente.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Matches the following ResponseErrorTitles. This field is a constant. * 201 - Invalid data * 202 - Unauthorized * 203 - Missing resource * 204 - Conflict * 205 - General error
 */
@JsonAdapter(ResponseErrorCode.Adapter.class)
public enum ResponseErrorCode {
  
  _201("201"),
  
  _202("202"),
  
  _203("203"),
  
  _204("204"),
  
  _205("205");

  private String value;

  ResponseErrorCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResponseErrorCode fromValue(String text) {
    for (ResponseErrorCode b : ResponseErrorCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<ResponseErrorCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseErrorCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResponseErrorCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseErrorCode.fromValue(String.valueOf(value));
    }
  }
}

