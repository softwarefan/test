package com.homework;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Parent;

public class Person {

    private Company company;
    private Car car;
    private List<Parent> parents = new ArrayList<>();
    private List<Child> children = new ArrayList<>();
    private List<Pokemon> pokemons = new ArrayList<>();

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    private String buildCompanyString() {
        Company company = this.getCompany();
        StringBuilder builder = new StringBuilder();
        builder.append(System.lineSeparator()).append("Company: ");
        if (company == null) {
            builder.append("n/a");
        } else {
            builder.append(System.lineSeparator())
                    .append(company.getCompanyName() + " " + company.getDepartment() + " " + company.getSalary())
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }


    private String buildCarString() {
        Car car = this.getCar();
        StringBuilder builder = new StringBuilder();
        builder.append(System.lineSeparator()).append("Car: ");
        if (car == null) {
            builder.append("n/a").append(System.lineSeparator());

        } else {
            builder.append(System.lineSeparator())
                    .append(car.getCarModel() + " " + car.getCarSpeed())
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }

    
    private String buildChildrenString() {
        List<Child> children = this.getChildren();
        StringBuilder builder = new StringBuilder();
        builder.append(System.lineSeparator()).append("Children: ");
        if (children.isEmpty()) {
            builder.append("n/a");
        } else {
            builder.append(System.lineSeparator())
                    .append(children.toString())
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }

private String buildPokemonsString() {
        List<Pokemon> pokemons = this.getPokemons();
        StringBuilder builder = new StringBuilder();
        builder.append(System.lineSeparator()).append("Pokemons: ");
        if (pokemons.isEmpty()) {
            builder.append("n/a");
        } else {
            builder.append(System.lineSeparator())
                    .append(pokemons.toString())
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }



    @Override
    public String toString() {

        return buildCompanyString() + buildCarString() + buildParentsString() + buildChildrenString() + buildPokemonsString();
    }

}
