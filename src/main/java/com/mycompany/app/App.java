package com.mycompany.app;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
/**
 * Hello world!
 */
public class App
{

    private final String message = "Welcome to Vitraya Techh!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
		
    }

    private final String getMessage() {
        return message;
    }

}
