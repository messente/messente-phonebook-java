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


package com.messente.phonebook;

import com.messente.ApiException;
import com.messente.phonebook.ErrorResponse;
import com.messente.phonebook.FetchBlacklistSuccess;
import com.messente.phonebook.NumberToBlacklist;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlacklistApi
 */
@Ignore
public class BlacklistApiTest {

    private final BlacklistApi api = new BlacklistApi();

    
    /**
     * 
     *
     * Adds a phone number to the blacklist.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addToBlacklistTest() throws ApiException {
        NumberToBlacklist numberToBlacklist = null;
        api.addToBlacklist(numberToBlacklist);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all blacklisted phone numbers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchBlacklistTest() throws ApiException {
        FetchBlacklistSuccess response = api.fetchBlacklist();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Removes a phone number from the blacklist.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFromBlacklistTest() throws ApiException {
        String phoneNumber = null;
        api.removeFromBlacklist(phoneNumber);

        // TODO: test validations
    }
    
}
