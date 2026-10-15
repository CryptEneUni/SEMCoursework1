package com.napier;

/**
 * City class
 */
public class City{
    private final String name;
    /**
     * @return returns String; city name
     */
    public String getName() {
        return name;}

    private final int population;
    /**
     * @return returns int; city population
     */
    public int getPopulation() {
        return population;}

    private final String country;
    /**
     * @return returns String; country name
     */
    public String getCountry() {
        return country;}

    private final String district;
    /**
     * @return returns String; district name
     */
    public String getDistrict() {
        return district;}

    /**
     * Constructor for city
     * @param Name String name of city
     * @param Population int population of country
     * @param Country String name of country
     * @param District String name of district
     */
    public City(String Name, int Population, String Country, String District) {
        name = Name;
        population = Population;
        country = Country;
        district = District;
    }
}
