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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Phone number in e.164 format
 */
@ApiModel(description = "Phone number in e.164 format")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-11-09T11:00:29.119348+02:00[Europe/Tallinn]")
public class PhoneNumberSubmittedToBlacklist {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public PhoneNumberSubmittedToBlacklist phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberSubmittedToBlacklist phoneNumberSubmittedToBlacklist = (PhoneNumberSubmittedToBlacklist) o;
    return Objects.equals(this.phoneNumber, phoneNumberSubmittedToBlacklist.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberSubmittedToBlacklist {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

