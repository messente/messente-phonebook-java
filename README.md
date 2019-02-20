# Messente Phonebook API

PhonebookApi - Java client for Messente Phonebook API

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.messente.phonebook</groupId>
  <artifactId>phonebook-java</artifactId>
  <version>0.3.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.messente.phonebook:phonebook-java:0.3.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/phonebook-java-0.3.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.messente.*;
import com.messente.auth.*;
import com.messente.phonebook.*;

public class PhoneBookExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR_MESSENTE_API_USERNAME");
        basicAuth.setPassword("YOUR_MESSENTE_API_PASSWORD");

        BlacklistApi blacklist = new BlacklistApi();
        GroupsApi groups = new GroupsApi();

//        try {
//            FetchBlacklistSuccess response = blacklist.fetchBlacklist();
//            System.out.println(response);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling fetchBlacklist");
//            e.printStackTrace();
//        }
//
//        try {
//            blacklist.addToBlacklist(new NumberToBlacklist().phoneNumber("SOME_PHONE"));
//        } catch (ApiException e) {
//            System.err.println("Exception when calling addToBlacklist");
//            e.printStackTrace();
//        }
//
//        try {
//            blacklist.isBlacklisted("SOME_PHONE");
//        } catch (ApiException e) {
//            System.err.println("Exception when calling isBlacklisted");
//            e.printStackTrace();
//        }
//
//        try {
//            blacklist.deleteFromBlacklist("SOME_PHONE");
//        } catch (ApiException e) {
//            System.err.println("Exception when calling deleteFromBlacklist");
//            e.printStackTrace();
//        }
//
//        try {
//            GroupEnvelope response = groups.createGroup(new GroupName().name("SOME_NAME"));
//            System.out.println(response);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling createGroup");
//            e.printStackTrace();
//        }
//
//        try {
//            groups.deleteGroup("SOME_GROUP_UUID");
//        } catch (ApiException e) {
//            System.err.println("Exception when calling deleteGroup");
//            e.printStackTrace();
//        }
//
//        try {
//            GroupEnvelope response = groups.fetchGroup("SOME_GROUP_UUID");
//            System.out.println(response);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling fetchGroup");
//            e.printStackTrace();
//        }
//
//        try {
//            GroupListEnvelope response = groups.fetchGroups();
//            System.out.println(response);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling fetchGroups");
//            e.printStackTrace();
//        }
//
//        try {
//            GroupEnvelope response = groups.updateGroup("SOME_GROUP_UUID", new GroupName().name("SOME_NAME"));
//            System.out.println(response);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling updateGroup");
//            e.printStackTrace();
//        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.messente.com/v1/phonebook*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BlacklistApi* | [**addToBlacklist**](docs/BlacklistApi.md#addToBlacklist) | **POST** /blacklist |
*BlacklistApi* | [**deleteFromBlacklist**](docs/BlacklistApi.md#deleteFromBlacklist) | **DELETE** /blacklist/{phone} |
*BlacklistApi* | [**fetchBlacklist**](docs/BlacklistApi.md#fetchBlacklist) | **GET** /blacklist |
*BlacklistApi* | [**isBlacklisted**](docs/BlacklistApi.md#isBlacklisted) | **GET** /blacklist/{phone} |
*ContactsApi* | [**addContactToGroup**](docs/ContactsApi.md#addContactToGroup) | **POST** /groups/{groupId}/contacts/{phone} |
*ContactsApi* | [**createContact**](docs/ContactsApi.md#createContact) | **POST** /contacts |
*ContactsApi* | [**deleteContact**](docs/ContactsApi.md#deleteContact) | **DELETE** /contacts/{phone} |
*ContactsApi* | [**fetchContact**](docs/ContactsApi.md#fetchContact) | **GET** /contacts/{phone} |
*ContactsApi* | [**fetchContactGroups**](docs/ContactsApi.md#fetchContactGroups) | **GET** /contacts/{phone}/groups |
*ContactsApi* | [**fetchContacts**](docs/ContactsApi.md#fetchContacts) | **GET** /contacts |
*ContactsApi* | [**removeContactFromGroup**](docs/ContactsApi.md#removeContactFromGroup) | **DELETE** /groups/{groupId}/contacts/{phone} |
*ContactsApi* | [**updateContact**](docs/ContactsApi.md#updateContact) | **PATCH** /contacts/{phone} |
*GroupsApi* | [**createGroup**](docs/GroupsApi.md#createGroup) | **POST** /groups |
*GroupsApi* | [**deleteGroup**](docs/GroupsApi.md#deleteGroup) | **DELETE** /groups/{groupId} |
*GroupsApi* | [**fetchGroup**](docs/GroupsApi.md#fetchGroup) | **GET** /groups/{groupId} |
*GroupsApi* | [**fetchGroups**](docs/GroupsApi.md#fetchGroups) | **GET** /groups |
*GroupsApi* | [**updateGroup**](docs/GroupsApi.md#updateGroup) | **PUT** /groups/{groupId} |


## Documentation for Models

 - [ContactEnvelope](docs/ContactEnvelope.md)
 - [ContactFields](docs/ContactFields.md)
 - [ContactListEnvelope](docs/ContactListEnvelope.md)
 - [ContactUpdateFields](docs/ContactUpdateFields.md)
 - [EmptyObject](docs/EmptyObject.md)
 - [ErrorItem](docs/ErrorItem.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FetchBlacklistSuccess](docs/FetchBlacklistSuccess.md)
 - [GroupEnvelope](docs/GroupEnvelope.md)
 - [GroupListEnvelope](docs/GroupListEnvelope.md)
 - [GroupName](docs/GroupName.md)
 - [GroupResponseFields](docs/GroupResponseFields.md)
 - [NumberToBlacklist](docs/NumberToBlacklist.md)
 - [ResponseErrorCode](docs/ResponseErrorCode.md)
 - [ResponseErrorTitle](docs/ResponseErrorTitle.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

messente@messente.com
