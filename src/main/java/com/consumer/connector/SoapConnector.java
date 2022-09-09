package com.consumer.connector;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapConnector extends WebServiceGatewaySupport {
  
  public Object callWebService(String uri, Object requestPayload) {
    return getWebServiceTemplate().marshalSendAndReceive(uri, requestPayload);
  }
}
