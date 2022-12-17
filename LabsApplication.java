package com.first.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LabsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabsApplication.class, args); // Запуск приложения Spring
    }

    @GetMapping("/CheckEvenOdd") // Путь к методу
    public String CheckEvenOdd(@RequestParam(value = "value", required = false, defaultValue = "1234") String name) {
        return String.format("%d", CheckEvenOdd(name)) + "<br><br><button onclick=\"history.back()\">Назад</button>";
    }

    public static String CheckEvenOddString(String input) {
        int num = Integer.parseInt(input);
        if(num % 2 == 0)  {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

}
