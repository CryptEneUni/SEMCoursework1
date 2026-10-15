package com.napier;

public class City{
    private final String name;
    public String getName() {
        return name;}

    private final int population;
    public int getPopulation() {
        return population;}

    private final String country;
    public String getCountry() {
        return country;}

    private final String district;
    public String getDistrict() {
        return district;}

    public City(String Name, int Population, String Country, String District) {
        name = Name;
        population = Population;
        country = Country;
        district = District;
    }
}
