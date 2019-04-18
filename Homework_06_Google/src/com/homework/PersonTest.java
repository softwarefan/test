package com.homework;

import java.util.HashMap;
import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {
        //spisak na horata, koito shte definirame po-dolu
        Map<String, Person> persons = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //bezkraen tsikal zachetene ot klaviaturata na danni za person
        //dokato ne vavedem "end" za izhod
        while (!"end".equalsIgnoreCase(input)) {
        
        scanner.nextLine();
    }

    scanner.close();
    }




}