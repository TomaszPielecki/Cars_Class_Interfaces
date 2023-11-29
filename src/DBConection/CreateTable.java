package DBConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://localhost:5432/ManagementCarSystem";
        String dbUser = "postgres";
        String dbPassword = "Milan123a";

        String[] createTableQueries = {
                "CREATE TABLE IF NOT EXISTS Truck (",
                "id SERIAL PRIMARY KEY,",
                "registrationNumber VARCHAR(20) NOT NULL,",
                "vinNumber VARCHAR(17) NOT NULL,",
                "color VARCHAR(50),",
                "price DOUBLE PRECISION,",
                "fuelConsumption DOUBLE PRECISION,",
                "tankCondition DOUBLE PRECISION,",
                "odometer DOUBLE PRECISION,",
                "tankCapacity DOUBLE PRECISION,",
                "cargoCapacity DOUBLE PRECISION)"
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