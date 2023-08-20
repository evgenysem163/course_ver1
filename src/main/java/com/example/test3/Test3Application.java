package com.example.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Test3Application {

    public static void main(String[] args) {
        SpringApplication.run(Test3Application.class, args);
        List<String> names = Arrays.asList("John", "Mary", "Peter", "Alice");
                List<String> modifiendNames = names.stream()
                        .map(name->name.substring(1))
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(modifiendNames);

    }

}
