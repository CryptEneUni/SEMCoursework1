package com.napier;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    private Connection connection = null;

    public Connection getConnection() {
        return connection;
    }

    public Database(){
    }

    public Database(String username, String password, String url, String dbName){
        startConnection(username, password, url, dbName);
    }

    /**
     * Tries to establish a connection to a sql server
     * using username, password, url and database name.
     * returns a connection, or null if it fails.
     */
    public void startConnection(String username, String password, String url, String dbName) {
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

            connection = con;
    }

    /**
     * Closes the connection
     */
    public void closeConnection(){
        try {
            connection.close();
        }
        catch (java.sql.SQLException sqle) {
            System.out.print("failed to close connection");
        }
    }

    public ArrayList<Country> countriesInWorldDesc(){
        try {
            Statement query = connection.createStatement();
            String queryString =
                    "SELECT Name, Population, Code, Continent, Capital, Region "
                    +"FROM country "
                    +"ORDER BY Population DESC; ";
            ResultSet rset = query.executeQuery(queryString);
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                String name = rset.getString("country.Name");
                int population = rset.getInt("country.Population");
                String code = rset.getString("country.Code");
                int captialId = rset.getInt("country.Capital");
                String continent = rset.getString("country.Continent");
                String region = rset.getString("country.Region");
                countries.add(new Country(name, population, code, captialId, continent, region));
            }
            return countries;

        }
        catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }
}
