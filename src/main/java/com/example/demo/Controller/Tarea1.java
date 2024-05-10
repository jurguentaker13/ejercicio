
package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Tarea")
public class Tarea1 {
    @GetMapping("/suma")
    public String Suma(int a, int b){
        int resultado = a+b;
        return "Hola el resultado es :" +resultado;
    }
    @GetMapping("/multiplicación")
    public String Multiplicación(int c, int d){
        int resultado = c*d;
        return "Hola el resultado es : " +resultado;
    }
    @GetMapping("/verificarPrimo/{numero}")
    public String verificarPrimo(@PathVariable int numero) {
        if (esPrimo(numero)) {
            return numero + " es un número primo.";
        } else {
            return numero + " no es un número primo.";
        }
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

