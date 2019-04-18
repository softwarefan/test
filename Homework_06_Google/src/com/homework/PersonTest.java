package com.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {
        // spisak na horata, koito shte definirame po-dolu
        Map<String, Person> persons = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        boolean personExists = false;
        Person person = null;
        String personKey = null;
        Company company = null;
        Pokemon pokemon = null;
        // bezkraen tsikal zachetene ot klaviaturata na danni za person
        // dokato ne vavedem "end" za izhod
        while (!"end".equalsIgnoreCase(input)) {
            personKey = inputs[1];
            personExists = persons.containsKey(personKey);
            switch (inputsp[1].toLowerCase()) {

            // spored stringa vav vtoria param ot inputs masiva, sazdavame Person s
            // razlichni atributi
            case "company":

                company = new Company(inputs[2], inputs[3], inputs[4]);
                if (personExists) {
                    persons.get(personKey).setCompany(company);
                } else {
                    person = new Person();
                    person.setCompany(company);
                    persons.put(personKey, person);
                }
                break;

            case "pokemon":
                pokemon = new Pokemon(inputs[2], inputs[3]);
                if (personExists) {
                    persons.get(personKey).getPokemons().add(pokemon);
                } else {
                    person = new Person();
                    person.setPokemon(pokemon);
                    persons.put(personKey, person);
                }
                break;

            case "parents":
                parent = new Parent(inputs[2], inputs[3]);
                if (personExists) {
                    persons.get(personKey).getParents().add(parent);
                } else {
                    person = new Person();
                    person.setPokemon(pokemon);
                    persons.put(personKey, person);
                }
                break;

            case "children":
                child = new Child(inputs[2], inputs[3]);
                if (personExists) {
                    persons.get(personKey).getChildren().add(child);
                } else {
                    person = new Person();
                    person.setPokemon(pokemon);
                    persons.put(personKey, person);
                }
                break;

            }
            scanner.nextLine();
            inputs = input.split(" ");
        }

        scanner.close();
    }

}