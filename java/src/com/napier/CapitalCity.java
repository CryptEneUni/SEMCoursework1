package com.napier;

public class CapitalCity{
    private final String name;
    public String getName() {
        return name;}

    private final int population;
    public int getPopulation() {
        return population;}

    private final String country;
    public String getCountry() {
        return country;}

    public CapitalCity(String Name, int Population, String Country) {
        name = Name;
        population = Population;
        country = Country;
    }
}
