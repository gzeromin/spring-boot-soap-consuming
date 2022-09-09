package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.service.ConsumerService;
import com.consumer.soapdtos.NumberToDollars;
import com.consumer.soapdtos.NumberToDollarsResponse;
import com.consumer.soapdtos.NumberToWords;
import com.consumer.soapdtos.NumberToWordsResponse;

@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {
  
  @Autowired
  ConsumerService service;

  @GetMapping(value = "/number-to-words")
  public NumberToWordsResponse numberToWords(@RequestBody NumberToWords form) {
    return service.getWords(form);
  }

  @GetMapping(value = "/number-to-dollars")
  public NumberToDollarsResponse numberToDollars(@RequestBody NumberToDollars form) {
    return service.getDollars(form);
  }
}
