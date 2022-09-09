# Spring Boot WebService Soap Consumer   

  ## this program convert json to soap   
  automatically send marshalled data to   
  ``` https://www.dataaccess.com/webservicesserver/NumberConversion.wso```   
  and receive response soap data.   
  ### It return unmarshalled json data.   
   
   

## this project configured by...
> Maven Project   
> java: 11   
> Spring Boot: 2.7.3   
> Packaging: Jar   
> Dependencies: Spring Web Service   
   
   
   
- end point   
  - /consumer/number-to-words 
    - request  
    ```   
    {   
      "ubiNum": "500"   
    }
    ```
    - soap
    ```
    <?xml version="1.0" encoding="utf-8"?>
    <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
      <soap:Body>
        <NumberToWords xmlns="http://www.dataaccess.com/webservicesserver/">
          <ubiNum>500</ubiNum>
        </NumberToWords>
      </soap:Body>
    </soap:Envelope>
    ```
    - response
    ```   
    {
      "numberToWordsResult": "five hundred "
    }
    ```

  - /consumer/number-to-dollars   
    - request
    ```   
    {   
      "dNum": "3"   
    }
    ```
    - soap
    ```
    <?xml version="1.0" encoding="utf-8"?>
    <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
      <soap:Body>
        <NumberToDollars xmlns="http://www.dataaccess.com/webservicesserver/">
          <dNum>500</dNum>
        </NumberToDollars>
      </soap:Body>
    </soap:Envelope>
    ```
    - response
    ```   
    {
      "numberToDollarsResult": "three dollars"
    }
    ```

#### refs...   
  youtube: <https://www.youtube.com/watch?v=WJg3NUwq6zU>   
  api: <https://documenter.getpostman.com/view/8854915/Szf26WHn>   
  wsdl: <https://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL>   
   
#### 2022.09.09 created by J.min