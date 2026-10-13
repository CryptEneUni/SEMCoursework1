package com.napier;

public class Country{
    private final String name;
    public String getName() {
        return name;}

    private final int population;
    public int getPopulation() {
        return population;}

    private final String code;
    public String getCode() {
        return code;}

    private final int capital;
    public int getCapital() {
        return capital;}

    private final String continent;
    public String getContinent() {
        return continent;}

    private final String region;
    public String getRegion() {
        return region;}

    public Country(String Name, int Population, String Code, int Capital, String Continent, String Region){
        name = Name;
        population = Population;
        code = Code;
        capital = Capital;
        continent = Continent;
        region = Region;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Population: " + population + " Code: " + code + " CapitalId: " + capital + " Continent: " + continent + " Region: " + region;
    }
}
