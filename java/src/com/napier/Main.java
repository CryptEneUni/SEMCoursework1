package com.napier;

import java.sql.*;


/**
 *main
 */

public class Main {
    public static void main(String[] args) {
        String username = "root";
        String password = "password";
        String url = "jdbc:mysql://db:3306/";
        String dbName = "world";
        Connection con = startConnection(username, password, url, dbName);
        System.out.println("connected2");

        try {
            con.close(); }
        catch(SQLException sqle) {
          System.out.println("Failed to close database " + sqle.getMessage());
        }
    }


    /**
     * Tries to establish a connection to a sql server
     * using username, password, url and database name.
     * returns a connection, or null if it fails.
     */
    public static Connection startConnection(String username, String password, String url, String dbName) {
        //Load Database driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); }
        catch (ClassNotFoundException e) {
            System.out.print("Could not load SQL driver");
            System.exit(-1); }

        // Connection to the database
        Connection con = null;
        int retries = 15;
        int delayMs = 1000;

        // Attempt to connect to the database, with retries and delays to give the database time to start
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(delayMs);
                // Try to connect to database
                con = DriverManager.getConnection(url + dbName + "?allowPublicKeyRetrieval=true&useSSL=false", username, password);
                System.out.println("Successfully connected");
                Thread.sleep(delayMs);
                // Exit for loop
                break; }

            catch (SQLException sqle) {
                System.out.print("Failed to connect to database attempt " + Integer.toString(i) + ": " + sqle.getMessage()); }

            catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen."); } }

        if (con == null) {
            System.out.println("Failed to connect to database");
        }

        return con;
    }
}