package com.example.Calculadora.DTO;


import com.example.Calculadora.enums.Status;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Sum {

	@NotBlank(message = "digite dois numeros")
   private double a, b;
	private Status status;

}
