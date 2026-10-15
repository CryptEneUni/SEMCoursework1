package com.napier;

import javax.naming.Name;

public class Population{
    private final String name;
    public String getName() {
        return name;}

    private final int population;
    public int getPopulation() {
        return population;}

    private final int inCity;
    public int getInCity() {
        return inCity;}

    private final int notInCity;
    public int getNotInCity() {
        return notInCity;}

    private final double inCityPercent;
    public double getInCityPercent() {
        return inCityPercent;}

    private final double notInCityPercent;
    public double getNotInCityPercent() {
        return notInCityPercent;}

    public Population(String Name, int Population, int InCity, int NotInCity, double InCityPercent, double NotInCityPercent){
        name = Name;
        population = Population;
        inCity = InCity;
        notInCity = NotInCity;
        inCityPercent = InCityPercent;
        notInCityPercent = NotInCityPercent;
    }
}
