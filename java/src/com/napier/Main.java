package com.napier;


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



        db.closeConnection();
    }
}