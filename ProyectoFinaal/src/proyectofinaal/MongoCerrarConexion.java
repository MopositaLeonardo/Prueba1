/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinaal;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoCerrarConexion {
    private MongoClient mongoClient;

    public MongoCerrarConexion(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
            System.out.println("Conexión cerrada");
        }
    }
}