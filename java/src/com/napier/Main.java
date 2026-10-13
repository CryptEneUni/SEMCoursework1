package com.napier;


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
        ArrayList<Country> countrys = db.countriesInWorldDesc();
        for (Country country : countrys){
            System.out.println(country);
        }
        db.closeConnection();
    }
}