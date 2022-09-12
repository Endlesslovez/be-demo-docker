package com.example.demodocker12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/demo")
  public String getDemo() {
    return "demo";
  }
}
