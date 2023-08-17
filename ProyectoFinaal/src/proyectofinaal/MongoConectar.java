/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinaal;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoConectar implements AutoCloseable {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoConectar() {
        String connectionString = "mongodb://localhost:27017"; // Cambia la URL y el puerto según tu configuración
        mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase("domotica"); // Cambia el nombre de la base de datos si es necesario
        System.out.println("Base de datos conectada");
    }

    public MongoDatabase getDatabase() {
        return database;
    }
    
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    @Override
    public void close() {
        if (mongoClient != null) {
            mongoClient.close();
            System.out.println("Conexión cerrada");
        }
    }
}
