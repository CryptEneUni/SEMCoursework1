package com.napier;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *main
 */

public class Main {
    public static void main(String[] args) {
        String username = "root";
        String password = "password";
        String url = "jdbc:mysql://db:3306/";
        String dbName = "world";

        Database db = new Database();
        db.startConnection(username, password, url, dbName);
        if (db.getConnection() == null) {return;}

        //runs a country query with the query stored in querys.countriesInWorldDesc
        ArrayList<Country> countriesInWorldDescOut = db.countryQuery(Querys.countriesInWorldDesc, "", "");
        for (Country country : countriesInWorldDescOut){
            System.out.println(country);}

        // Need to add way to insert stuff into where input, for now just set to Asia for testing
        ArrayList<Country> countriesInContDescOut = db.countryQuery(Querys.countriesInContDesc, "'Asia'", "");
        for (Country country : countriesInContDescOut){
            System.out.println(country);}
        // Need to add way to insert stuff into where input, for now just set to 5 for testing
        ArrayList<Country> countriesInRegiDescOut = db.countryQuery(Querys.countriesInRegiDesc, "'Southern Europe'", "");
        for (Country country : countriesInRegiDescOut){
            System.out.println(country);}

        ArrayList<Country> countriesInWorldLimitedOut = db.countryQuery(Querys.countriesInWorldLimited, "", "5");
        for (Country country : countriesInWorldLimitedOut){
            System.out.println(country);}

        db.closeConnection();
    }
}