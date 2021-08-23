package com.example.Calculadora.Controller;

import com.example.Calculadora.DTO.Subtraction;
import com.example.Calculadora.Misc.ApiResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class subtraction {

    @GetMapping("/sub/{a}/{b}")
    public ResponseEntity<Map<String, Object>> sub (@PathVariable("a") double a, @PathVariable("b") double b ){

        double sub = a - b;

        Map<String, Object> response = new ApiResponseObject().response(Boolean.FALSE, "Success!", sub);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping("sub/{a}/{b}")
    public ResponseEntity<Map<String, Object>> sub2 ( @RequestBody Subtraction sub){

        double total = sub.getA() - sub.getB();

        Map<String, Object> response = new ApiResponseObject().response(Boolean.FALSE, "Success!", total);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
