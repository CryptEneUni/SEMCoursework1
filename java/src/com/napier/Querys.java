package com.napier;

public class Querys {
    public static String countriesInWorldDesc =
            "SELECT Name, Population, Code, Continent, Capital, Region "
            +"FROM country "
            +"ORDER BY Population DESC; ";

}
