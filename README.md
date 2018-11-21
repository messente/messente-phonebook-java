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
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.messente.phonebook:phonebook-java:0.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/phonebook-java-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.messente.*;
import com.messente.auth.*;
import com.messente.phonebook.*;

public class BlacklistApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR_MESSENTE_API_USERNAME");
        basicAuth.setPassword("YOUR_MESSENTE_API_PASSWORD");

        BlacklistApi apiInstance = new BlacklistApi();

        try {
            FetchBlacklistSuccess response = apiInstance.fetchBlacklist();
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling fetchBlacklist");
            e.printStackTrace();
        }

//      try {
//          apiInstance.addToBlacklist(new NumberToBlacklist().phoneNumber("+37255555555"));
//      } catch (ApiException e) {
//          System.err.println("Exception when calling addToBlacklist");
//          e.printStackTrace();
//      }
//
//      try {
//          apiInstance.removeFromBlacklist("+37255555555");
//      } catch (ApiException e) {
//          System.err.println("Exception when calling removeFromBlacklist");
//          e.printStackTrace();
//      }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *<https://api.messente.com/v1>*

Class | Method | HTTP request |
------------ | ------------- | ------------- |
*BlacklistApi* | [**addToBlacklist**](docs/BlacklistApi.md#addToBlacklist) | **POST** /phonebook/blacklist |
*BlacklistApi* | [**fetchBlacklist**](docs/BlacklistApi.md#fetchBlacklist) | **GET** /phonebook/blacklist |
*BlacklistApi* | [**removeFromBlacklist**](docs/BlacklistApi.md#removeFromBlacklist) | **DELETE** /phonebook/blacklist/{phone_number} |


## Documentation for Models

 - [ErrorItem](docs/ErrorItem.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FetchBlacklistSuccess](docs/FetchBlacklistSuccess.md)
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

