# ContactsApi

All URIs are relative to *https://api.messente.com/v1/phonebook*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContactToGroup**](ContactsApi.md#addContactToGroup) | **POST** /groups/{groupId}/contacts/{phone} | 
[**createContact**](ContactsApi.md#createContact) | **POST** /contacts | 
[**deleteContact**](ContactsApi.md#deleteContact) | **DELETE** /contacts/{phone} | 
[**fetchContact**](ContactsApi.md#fetchContact) | **GET** /contacts/{phone} | 
[**fetchContactGroups**](ContactsApi.md#fetchContactGroups) | **GET** /contacts/{phone}/groups | 
[**fetchContacts**](ContactsApi.md#fetchContacts) | **GET** /contacts | 
[**removeContactFromGroup**](ContactsApi.md#removeContactFromGroup) | **DELETE** /groups/{groupId}/contacts/{phone} | 
[**updateContact**](ContactsApi.md#updateContact) | **PATCH** /contacts/{phone} | 


<a name="addContactToGroup"></a>
# **addContactToGroup**
> EmptyObject addContactToGroup(groupId, phone)



Adds a contact to a group.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.phonebook.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String groupId = "groupId_example"; // String | String in uuid format.
String phone = "phone_example"; // String | A phone number
try {
    EmptyObject result = apiInstance.addContactToGroup(groupId, phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#addContactToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| String in uuid format. |
 **phone** | **String**| A phone number |

### Return type

[**EmptyObject**](EmptyObject.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createContact"></a>
# **createContact**
> ContactEnvelope createContact(contactFields)



Creates a new contact.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.phonebook.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
ContactFields contactFields = new ContactFields(); // ContactFields | 
try {
    ContactEnvelope result = apiInstance.createContact(contactFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactFields** | [**ContactFields**](ContactFields.md)|  |

### Return type

[**ContactEnvelope**](ContactEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContact"></a>
# **deleteContact**
> deleteContact(phone)



Deletes a contact.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.phonebook.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = "phone_example"; // String | A phone number
try {
    apiInstance.deleteContact(phone);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| A phone number |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchContact"></a>
# **fetchContact**
> ContactEnvelope fetchContact(phone)



Lists a contact.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.phonebook.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = "phone_example"; // String | A phone number
try {
    ContactEnvelope result = apiInstance.fetchContact(phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#fetchContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| A phone number |

### Return type

[**ContactEnvelope**](ContactEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchContactGroups"></a>
# **fetchContactGroups**
> GroupListEnvelope fetchContactGroups(phone)



Lists groups of a contact.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.phonebook.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = "phone_example"; // String | A phone number
try {
    GroupListEnvelope result = apiInstance.fetchContactGroups(phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#fetchContactGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| A phone number |

### Return type

[**GroupListEnvelope**](GroupListEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchContacts"></a>
# **fetchContacts**
> ContactListEnvelope fetchContacts(groupIds)



Returns all contacts.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.phonebook.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
List<String> groupIds = Arrays.asList(); // List<String> | Group id string in uuid format.
try {
    ContactListEnvelope result = apiInstance.fetchContacts(groupIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#fetchContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | [**List&lt;String&gt;**](String.md)| Group id string in uuid format. | [optional]

### Return type

[**ContactListEnvelope**](ContactListEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeContactFromGroup"></a>
# **removeContactFromGroup**
> removeContactFromGroup(groupId, phone)



Remove a contact from a group.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.phonebook.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String groupId = "groupId_example"; // String | String in uuid format.
String phone = "phone_example"; // String | A phone number
try {
    apiInstance.removeContactFromGroup(groupId, phone);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#removeContactFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| String in uuid format. |
 **phone** | **String**| A phone number |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateContact"></a>
# **updateContact**
> ContactEnvelope updateContact(phone, contactUpdateFields)



Updates a contact.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.phonebook.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = "phone_example"; // String | A phone number
ContactUpdateFields contactUpdateFields = new ContactUpdateFields(); // ContactUpdateFields | 
try {
    ContactEnvelope result = apiInstance.updateContact(phone, contactUpdateFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#updateContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| A phone number |
 **contactUpdateFields** | [**ContactUpdateFields**](ContactUpdateFields.md)|  |

### Return type

[**ContactEnvelope**](ContactEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

