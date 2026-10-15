package com.napier;

/**
 * Country class
 */
public class Country{
    private final String name;
    /**
     * @return returns String; country name
     */
    public String getName() {
        return name;}

    private final int population;
    /**
     * @return returns int; country population
     */
    public int getPopulation() {
        return population;}

    private final String code;
    /**
     * @return returns String; country code
     */
    public String getCode() {
        return code;}

    private final int capital;
    /**
     * @return returns int; the id of the countrys capital city
     */
    public int getCapital() {
        return capital;}

    private final String continent;
    /**
     * @return returns String; the continent the country is in
     */
    public String getContinent() {
        return continent;}

    private final String region;
    /**
     * @return returns String; the region the country is in
     */
    public String getRegion() {
        return region;}

    /**
     * Constructor for country class
     * @param Name String name of country
     * @param Population int population of country
     * @param Code String country code of country
     * @param Capital int City ID of the country's capital city
     * @param Continent String name of the continent the country is in
     * @param Region String name of the region the country is in
     */

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
