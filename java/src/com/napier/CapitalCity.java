package com.napier;

/**
 * Capital City class
 */
public class CapitalCity{
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

    /**
     * Constructor for captial city class
     * @param Name String name of city
     * @param Population int population of city
     * @param Country String name of country
     */
    public CapitalCity(String Name, int Population, String Country) {
        name = Name;
        population = Population;
        country = Country;
    }
}
