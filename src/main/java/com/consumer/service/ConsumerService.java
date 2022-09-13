package com.consumer.service;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consumer.connector.SoapConnector;
import com.consumer.soapdtos.NumberToDollars;
import com.consumer.soapdtos.NumberToDollarsResponse;
import com.consumer.soapdtos.NumberToWords;
import com.consumer.soapdtos.NumberToWordsResponse;

@Service
public class ConsumerService {
  
  @Autowired
  SoapConnector soapConnector;

  public final String URI = "http://localhost:3000/ws/numberConversion";

  public NumberToWordsResponse getWords(NumberToWords form) {
    NumberToWordsResponse response = 
      (NumberToWordsResponse) soapConnector.callWebService(URI, form);
    return response;
  }

  public NumberToDollarsResponse getDollars(NumberToDollars form) {
    NumberToDollarsResponse response = 
      (NumberToDollarsResponse) soapConnector.callWebService(URI, form);
    return response;
  }
}
