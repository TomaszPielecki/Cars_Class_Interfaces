package DBConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://localhost:5432/BazaZamowienia";
        String dbUser = "postgres";
        String dbPassword = "Milan123a";

        String[] createTableQueries = {
                "CREATE TABLE IF NOT EXISTS Klienci (" +
                        "Id_klient SERIAL PRIMARY KEY NOT NULL," +
                        "Nazwa VARCHAR(100) NOT NULL," +
                        "adres VARCHAR(100) NOT NULL," +
                        "Miasto VARCHAR(100) NOT NULL," +
                        "Wojewodztwo VARCHAR(100) NOT NULL," +
                        "kod VARCHAR(100) NOT NULL," +
                        "Kraj VARCHAR(100) NOT NULL," +
                        "Kontakt_tel VARCHAR(100) NOT NULL," +
                        "email VARCHAR(100) NOT NULL)",
                // ... Pozostałe zapytania tworzące tabele ...
        };

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");

            try (Statement statement = connection.createStatement()) {
                for (String query : createTableQueries) {
                    statement.executeUpdate(query);
                }

                connection.commit();
                System.out.println("Tables created successfully");
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}