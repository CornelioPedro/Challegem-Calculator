package com.example.Calculadora.Controller;

import com.example.Calculadora.DTO.Division;
import com.example.Calculadora.Misc.ApiResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class divisor {
    @GetMapping("/div/{a}/{b}")
    public ResponseEntity<Map<String, Object>> div (@PathVariable("a") double a, @PathVariable("b") double b ){

        double div = a / b;

        Map<String, Object> response = new ApiResponseObject().response(Boolean.FALSE, "Success!", div);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping("div/{a}/{b}")
    public ResponseEntity<Map<String, Object>> div2 ( @RequestBody Division div){

        double total = div.getA() / div.getB();

        Map<String, Object> response = new ApiResponseObject().response(Boolean.FALSE, "Success!", total);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
