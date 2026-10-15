package com.napier;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

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
        ArrayList<Country> countriesInWorldDescOut = db.countryQuery(Querys.countriesInWorldDesc);

        for (Country country : countriesInWorldDescOut){
            System.out.println(country);}

        db.closeConnection();
    }
}