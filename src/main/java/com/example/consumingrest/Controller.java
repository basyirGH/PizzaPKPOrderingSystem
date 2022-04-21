package com.example.consumingrest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("pizzapkp")
    public String root(RestTemplate restTemplate, Model model){

        Orders[] ordersArray = restTemplate.getForObject(
                "http://localhost:8080/api/v1/orders", Orders[].class);

        String ordersArrayLength = String.valueOf(ordersArray.length);


        List<Orders> ordersArrayList = Arrays.asList(ordersArray);
        model.addAttribute("ordersArrayList", ordersArrayList);
        model.addAttribute("ordersArrayLength", ordersArrayLength);

        return "index";
    }
}
