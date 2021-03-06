/*
 * Phonebook API
 * RESTful API for Messente phonebook
 *
 * OpenAPI spec version: 0.0.3
 * Contact: messente@messente.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.messente.phonebook;

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
 * Textual value which corresponds to ResponseErrorCode
 */
@JsonAdapter(ResponseErrorTitle.Adapter.class)
public enum ResponseErrorTitle {
  
  INVALID_DATA("Invalid data"),
  
  UNAUTHORIZED("Unauthorized"),
  
  MISSING_RESOURCE("Missing resource"),
  
  CONFLICT("Conflict"),
  
  CLIENT_ERROR("Client error"),
  
  GENERAL_ERROR("General error");

  private String value;

  ResponseErrorTitle(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResponseErrorTitle fromValue(String text) {
    for (ResponseErrorTitle b : ResponseErrorTitle.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<ResponseErrorTitle> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseErrorTitle enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResponseErrorTitle read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseErrorTitle.fromValue(String.valueOf(value));
    }
  }
}

