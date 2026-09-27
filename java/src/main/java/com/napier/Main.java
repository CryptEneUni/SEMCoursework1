package com.napier;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("Mongo-DB-Server");

        MongoDatabase database = mongoClient.getDatabase("mydb");

        System.out.println("done.");
    }
}