package DevOps_Group_8;

import java.sql.*;
import java.util.ArrayList;

import static org.graalvm.compiler.nodeinfo.Verbosity.Name;

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

        //All the cities in the world organised by largest population to smallest.
        ArrayList<City> cities = a.getCity();
        a.displayCity(cities);

        //All the cities in a continent organised by largest population to smallest.
        a.getCity_continent();

        //All the cities in a region organised by largest population to smallest.
        a.getCity_Region();

        // All the cities in a country organised by largest population to smallest.
        a.getCitybyCountry();

        //All the cities in a district organised by largest population to smallest.
        a.getCitybyDistrict();

        //All the capital cities in the world organised by largest population to smallest.
        a.getCapitalCities();

        //All the capital cities in a continent organised by largest population to smallest.
        a.getCapitalCitiesbyContinent();

        //All the capital cities in a region organised by largest to smallest.
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
    //displaying countries information
    public void displayCountry(ArrayList<Country> cous)
    {
        System.out.print("***********************countries in the world organised by largest population to smallest***********************\n");
        System.out.println(String.format("%-30s %-25s %-25s %-20s %-30s %-25s %-25s %-20s","Code","Name","Continent","Region","IndepYear","Population","Capital","Code2"));
        for(Country co:cous)
        {
            System.out.println(String.format("%-30s %-25s %-25s %-20s %-30s %-25s %-25s %-20s",co.Code,co.Name,co.Continent,co.Region,co.IndepYear,co.Population,co.Capital,co.Code2));

        }
        System.out.print("******************************************************************************************************************\n");
    }
    //retrieving population of the cities within a continent
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
    public ArrayList<City> getCity()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new city if valid.
//             Check one is returned
                while (rset.next()) {
                    City   city = new City();
                    city.Name = rset.getString("Name");
                    city.CountryCode = rset.getString("CountryCode");
                    city.District = rset.getString("District");
                    city.Population = rset.getInt("Population");
                    cities.add(city);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
        }
        return cities;
    }
    public void displayCity(ArrayList<City> cities)
    {
        System.out.print("***********************cities in the world organised by largest population to smallest***********************\n");
        System.out.println(String.format("%-30s %-25s %-25s %-20s","Name","Code","District","Population"));
        for(City c:cities)
        {
            System.out.println(String.format("%-30s %-25s %-25s %-20s",c.CountryCode,c.District,c.Name,c.Population));
        }
        System.out.print("******************************************************************************************************************\n");
    }
    public void getCity_continent() {
        ArrayList<City> cities = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.continent, country.Name,city.Name, city.Population "
                            + "FROM city,country "
                            + "WHERE city.CountryCode = country.Code AND country.continent='Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new city if valid.
//             Check one is returned
                //System.out.printf("%20s%20s%20s%20d","Continent","Country","City","Population");
                System.out.print("***********************cities in a continent organised by largest population to smallest***********************\n");
                System.out.printf("%20s%20s%20s%20s", "Continent","Name","CityName","Population\n");
                while (rset.next()) {
                    System.out.printf("%20s%20s%20s%20d", rset.getString(1), rset.getString(2), rset.getString(3), rset.getInt(4));
                    System.out.println("\n");
                    //System.out.printf("",rset.getString(1)+ " \t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getInt(4));
                }
                System.out.print("******************************************************************************************************************\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
        }
    }
    public void getCity_Region()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.Population, country.Region "
                            + "FROM country, city "
                            + "WHERE city.ID=country.Capital AND country.Region='Southeast Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {

//             Return new city if valid.
//             Check one is returned
                System.out.print("***********************cities in a region organised by largest population to smallest***********************\n");
                System.out.printf("%20s%20s%20s%20s", "Name","Population","Region\n");
                while (rset.next()) {
                    System.out.printf("%20s%20d%20s",rset.getString(1),rset.getInt(2),rset.getString(3));
                    System.out.println("\n");
                }
                System.out.print("******************************************************************************************************************\n");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
        }
    }
    public void getCitybyCountry() {
        ArrayList<City> city_country = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Name, city.ID, city.Name, city.CountryCode, city.Population "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code AND country.Name = 'Myanmar'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new city if valid.
//             Check one is returned
                System.out.print("***********************cities in a country organised by largest population to smallest***********************\n");
                System.out.printf("%20s%20s%20s%20s%20s", "Name","ID","CityName","CountryCode","Population\n");
                while (rset.next())
                {
                    System.out.printf("%20s%20s%20s%20s%20d", rset.getString(1), rset.getInt(2), rset.getString(3), rset.getString(4), rset.getInt(5));
                    System.out.println("\n");
                }
                System.out.print("******************************************************************************************************************\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
        }
    }
    public void getCitybyDistrict() {
        ArrayList<City> city_country = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID, city.Name, city.CountryCode, District, city.Population "
                            + "FROM city "
                            + "WHERE District = 'California'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new city if valid.
//             Check one is returned
                System.out.print("***********************cities in a district organised by largest population to smallest***********************\n");
                System.out.printf("%20s%20s%20s%20s%20s", "ID","Name","CityCode","District","Population\n");
                while (rset.next())
                {
                    System.out.printf("%20s%20s%20s%20s%20d", rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5));
                    System.out.println("\n");
                }
                System.out.print("******************************************************************************************************************\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
        }
    }
    public void getCapitalCities() {
        ArrayList<City> city_country = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID, city.Name, country.Name, country.Continent, city.Population "
                            + "FROM city, country "
                            + "WHERE city.ID = country.Capital "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new city if valid.
//             Check one is returned
                System.out.print("***********************capital cities in the world organised by largest population to smallest***********************\n");
                System.out.printf("%20s%20s%20s%20s%20s", "ID","Name","CountryName","Continent","Population\n");
                while (rset.next()) {
                    System.out.printf("%20s%20s%20s%20s%20d", rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
                            rset.getInt(5));
                    System.out.println("\n");
                }
                System.out.print("******************************************************************************************************************\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
        }
    }
    public void getCapitalCitiesbyContinent() {
        ArrayList<City> city_country = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID, city.Name, country.Name, country.Continent, city.Population "
                            + "FROM city, country "
                            + "WHERE city.ID = country.Capital AND country.Continent = 'Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null) {
                System.out.println("Not Found");
            } else {
//             Return new city if valid.
//             Check one is returned
                System.out.print("***********************capital cities in a continent organised by largest population to smallest***********************\n");
                System.out.printf("%20s%20s%20s%20s%20s", "ID","Name","CountryName","Continent","Population\n");
                while (rset.next()) {
                    System.out.printf("%20s%20s%20s%20s%20d", rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5));
                    System.out.println("\n");
                }
                System.out.print("******************************************************************************************************************\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
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
                System.out.print("***********************capital cities in a region organised by largest population to smallest***********************\n");
                System.out.printf("%20s%20s%20s%20s%20s", "ID","Name","CountryName","Region","Population\n");
                while (rset.next()) {
                    System.out.printf("%20s%20s%20s%20s%20d", rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5));
                    System.out.println("\n");
                }
                System.out.print("******************************************************************************************************************\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City details");
        }
    }
}
