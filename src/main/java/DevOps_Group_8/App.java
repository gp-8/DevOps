package DevOps_Group_8;

import java.sql.*;
import java.util.ArrayList;

/**
 * 
 */
public class App {
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        //All the countries in the world organised by largest population to smallest.
        ArrayList<Country> cous = a.getCountry();
        a.displayCountry(cous);

        // Get All the countries in a continent organised by largest population to smallest.
        ArrayList<Country> countries=a.countries_continent_largest_to_smallest();
        a.displayCountries_continent_largest_to_smallest(countries);

        // All the countries in a region organised by largest population to smallest.
        ArrayList<Country> Countries=a.countries_region_largest_to_smallest();
        a.displayCountries_region_largest_to_smallest(Countries);

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
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    public ArrayList<Country> getCountry()
    {
        ArrayList<Country> cous = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT  Code, Name, Continent, Region, IndepYear, Population, Capital, Code2 "
                            + "FROM country "
                            + "ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new country if valid.
//             Check one is returned
                while (rset.next()) {
                    Country   country = new Country();
                    country.Code = rset.getString("Code");
                    country.Name = rset.getString("Name");
                    country.Continent = rset.getString("Continent");
                    country.Region = rset.getString("Region");
                    country.IndepYear = rset.getInt("IndepYear");
                    country.Population = rset.getInt("Population");
                    country.Capital = rset.getInt("Capital");
                    country.Code2 = rset.getString("Code2");
                    cous.add(country);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
        }
        return cous;
    }
    public void displayCountry(ArrayList<Country> cous)
    {
        for(Country co:cous)
        {
            System.out.println(co.Code+"\t"+co.Name+"\t"+co.Continent+"\t"+co.Region+"\t"+co.IndepYear+"\t"+co.Population+"\t"+co.Capital+"\t"+co.Code2);

        }
    }

    public ArrayList<Country> countries_continent_largest_to_smallest()
    {
        ArrayList<Country> countries = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Region, LocalName, Population "
                            + "FROM country "
                            + "WHERE Continent = 'Europe' "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new city if valid.
//             Check one is returned
                while (rset.next()) {
                 Country country = new Country();
                    country.Name = rset.getString("Name");
                    country.Region = rset.getString("Region");
                    country.LocalName = rset.getString("LocalName");
                    country.Population = rset.getInt("Population");
                    countries.add(country);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
        }
        return countries;
    }
    public void displayCountries_continent_largest_to_smallest(ArrayList<Country> countries)
    {
        System.out.print("***********************countries in a continent organised by largest population to smallest***********************\n");
        System.out.println(String.format("%-30s %-25s %-25s %-20s","Name","Region","LocalName","Population"));
      for(Country c:countries)
      {
          System.out.println(String.format("%-30s %-25s %-25s %-20s",c.Name,c.Region,c.LocalName,c.Population));

      }
        System.out.print("******************************************************************************************************************\n");
    }

    public ArrayList<Country> countries_region_largest_to_smallest()
    {
        ArrayList<Country> Countries = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Continent, LocalName, Population "
                            + "FROM country "
                            + "WHERE Region = 'Middle East' "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new city if valid.
//             Check one is returned
                while (rset.next()) {
                    Country country = new Country();
                    country.Name = rset.getString("Name");
                    country.Continent = rset.getString("Continent");
                    country.LocalName = rset.getString("LocalName");
                    country.Population = rset.getInt("Population");
                    Countries.add(country);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
        }
        return Countries;
    }
    public void displayCountries_region_largest_to_smallest(ArrayList<Country> Countries)
    {
        System.out.print("***********************countries in a region organised by largest population to smallest***********************\n");
        System.out.println(String.format("%-30s %-25s %-25s %-20s","Name","Continent","LocalName","Population"));
        for(Country c:Countries)
        {
            System.out.println(String.format("%-30s %-25s %-25s %-20s",c.Name,c.Continent,c.LocalName,c.Population));
        }
        System.out.print("******************************************************************************************************************\n");
    }

}
