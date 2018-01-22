package com.mdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 @author : Costel DRAGU
 date : 17.01.2018 21:51
 */
@Controller
public class HomeController {

 @GetMapping("/")
 public String displayHomePage() {
  return "index";
 }


}
