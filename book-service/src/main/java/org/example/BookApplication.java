package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class BookApplication {
  public static void main(String[] args) {
    SpringApplication.run(BookApplication.class, args);
  }
}