package com.example.Calculadora.Controller;

import com.example.Calculadora.DTO.Sum;
import com.example.Calculadora.Misc.ApiResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class sum {

    @GetMapping("/sum/{a}/{b}")
    public ResponseEntity<Map<String, Object>> sum (@PathVariable("a") double a, @PathVariable("b") double b ){

        double sum = a + b;

        Map<String, Object> response = new ApiResponseObject().response(Boolean.FALSE, "Success!", sum);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping("sum/{a}/{b}")
    public ResponseEntity<Map<String, Object>> sum2 ( @RequestBody Sum sum){

        double total = sum.getA() + sum.getB();

        Map<String, Object> response = new ApiResponseObject().response(Boolean.FALSE, "Success!", total);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
