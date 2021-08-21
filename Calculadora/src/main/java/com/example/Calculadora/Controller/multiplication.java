package com.example.Calculadora.Controller;

import com.example.Calculadora.DTO.Multiplication;
import com.example.Calculadora.Misc.ApiResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class multiplication {

    @GetMapping("/mul/{a}/{b}")
    public ResponseEntity<Map<String, Object>> mul (@PathVariable("a") double a, @PathVariable("b") double b ){

        double mul = a * b;

        Map<String, Object> response = new ApiResponseObject().response(Boolean.FALSE, "Success!", mul);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping("mul/{a}/{b}")
    public ResponseEntity<Map<String, Object>> mul2 ( @RequestBody Multiplication mul){

        double total = mul.getA() * mul.getB();

        Map<String, Object> response = new ApiResponseObject().response(Boolean.FALSE, "Success!", total);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
