package com.site.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {
    private String url;
    private String username;
    private String password;

    DaoFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DaoFactory getInstance() {
        try {//CHARHEMENT DU DRIVER
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }
        
        //creation paramètres de connexion
        DaoFactory instance = new DaoFactory(
                "jdbc:mysql://localhost:3306/flights", "root", "");
        return instance;
    }
    
    public Connection getConnection() throws SQLException {//Connexion à la bdd
        Connection connexion = DriverManager.getConnection(url, username, password);
        connexion.setAutoCommit(false);
        return connexion;
    }

    // Récupération du Dao
    public FlightDao getFlightDao() {
        return new FlightDaoImpl(this);
    }
}
