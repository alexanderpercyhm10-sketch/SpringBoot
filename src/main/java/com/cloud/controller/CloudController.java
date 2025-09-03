package com.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("cloud-demo")
public class CloudController {
    @GetMapping(value ="/mostrar")
    public String descargar(){
        RestTemplate restTemplate = new RestTemplate();
//        Map<String, String> vars = new HashMap<>();
//        vars.put("hotel", "42");
//        vars.put("booking", "21");
//        String result = restTemplate.getForObject("http://example.com/hotels/{hotel}/bookings/{booking}", String.class, vars);
        //String result = restTemplate.getForObject("https://documentos-royal.rimac.com/vida/vividaaddons/planesvidainversion/poliza/2024/08/21/83388d79-31c5-41b5-9541-f273889bfc24.pdf", String.class);
        String result = "Pruebas srping boot";
        System.out.println(result);
        return result;
    }
}
