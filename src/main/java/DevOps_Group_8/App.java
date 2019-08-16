package DevOps_Group_8;

import java.sql.*;
import java.util.ArrayList;

/**
 * 
 */
public class App {
    public static void main(String[] args) {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        // Get City by Country
        a.getCapitalCitiesbyRegion();
        // Disconnect from database
        a.disconnect();

    }

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect() {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect() {
        if (con != null) {
            try {
                // Close connection
                con.close();
            } catch (Exception e) {
                System.out.println("Error closing connection to database");
            }
        }
    }

    public void getCapitalCitiesbyRegion() {
        ArrayList<City> city_country = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID, city.Name, country.Name, country.Region, city.Population "
                            + "FROM city, country "
                            + "WHERE city.ID = country.Capital AND country.Region='Southeast Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new city if valid.
//             Check one is returned
                while (rset.next()) {
                    System.out.printf("%20s%20s%20s%20s%20d", rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5));
                    System.out.println("\n");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
        }
    }
}
