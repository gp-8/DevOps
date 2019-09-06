package DevOps_Group_8;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * 
 */

public class App {
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        if (args.length < 1)
        {
            a.connect("localhost:33060");
        }
        else
        {
            a.connect(args[0]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Country Report\n" +
                "2. City Report\n" +
                "3. Capital City\n" +
                "4. Population\n" +
                "5. Country Language\n");
        System.out.println("Please choose a menu: ");
        String menu = scanner.next();
        if (menu.equals("1"))
        {
            System.out.print("********************Country Report********************\n");
            System.out.println("1. All the countries in the world organised by largest population to smallest\n" +
                    "2. All the countries in a continent organised by largest population to smallest\n" +
                    "3. All the countries in a region organised by largest population to smallest\n" +
                    "4. The top N populated countries in the world where N is provided by the user\n" +
                    "5. The top N populated countries in a continent where N is provided by the user\n" +
                    "6. The top N populated countries in a region where N is provided by the user.\n");
            System.out.println("Please choose a menu to view Country Report: ");
            String country = scanner.next();
            if (country.equals("1"))
            {
                //All the countries in the world organised by largest population to smallest.
                ArrayList<Country> cous = a.getCountry();
                a.displayCountry(cous);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if (country.equals("2"))
            {
                // Get All the countries in a continent organised by largest population to smallest.
                ArrayList<Country> countries=a.countries_continent_largest_to_smallest();
                a.displayCountries_continent_largest_to_smallest(countries);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if (country.equals("3"))
            {
                // All the countries in a region organised by largest population to smallest.
                ArrayList<Country> Countries=a.countries_region_largest_to_smallest();
                a.displayCountries_region_largest_to_smallest(Countries);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if (country.equals("4"))
            {
                //Top N Countries in the world organised by largest to smallest.
                ArrayList<Country> countries1 = a.gettopCountryWorld();
                a.displayTopCountriesbyWorld(countries1);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }

            }
            else if (country.equals("5"))
            {
                //Top N populated countries in a continent where N is provided by the user
                ArrayList<Country> countries2 = a.gettopCountryContinent();
                a.displayTopCountriesbyContinent(countries2);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }

            }
            else if (country.equals("6"))
            {
                //Top N populated countries in a region where N is provided by the user.
                ArrayList<Country> countries3 = a.gettopCountryRegion();
                a.displayTopCountriesbyRegion(countries3);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else
            {
                System.out.println("You've entered a wrong input!!");
                // Disconnect from database
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
        }
        else if (menu.equals("2"))
        {
            System.out.print("********************City Report********************\n");
            System.out.println("1. All the cities in the world organised by largest population to smallest\n" +
                    "2. All the cities in a continent organised by largest population to smallest\n" +
                    "3. All the cities in a region organised by largest population to smallest.\n" +
                    "4. All the cities in a country organised by largest population to smallest.\n" +
                    "5. All the cities in a district organised by largest population to smallest.\n" +
                    "6. The top N populated cities in the world where N is provided by the user.\n" +
                    "7. The top N populated cities in a continent where N is provided by the user.\n" +
                    "8. The top N populated cities in a region where N is provided by the user.\n" +
                    "9. The top N populated cities in a country where N is provided by the user.\n" +
                    "10. The top N populated cities in a district where N is provided by the user.\n");
            System.out.println("Please choose a menu to view City Report: ");
            String city = scanner.next();
            if (city.equals("1"))
            {
                //All the cities in the world organised by largest population to smallest.
                ArrayList<City> cities = a.getCity();
                a.displayCity(cities);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if (city.equals("2"))
            {
                //All the cities in a continent organised by largest population to smallest.
                ArrayList<City> cities2=a.getCity_continent();
                a.displayCityContinent(cities2);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if (city.equals("3"))
            {
                //All the cities in a region organised by largest population to smallest.
                ArrayList<City> cities3 = a.getCity_Region();
                a.displayCityRegion(cities3);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if (city.equals("4"))
            {
                // All the cities in a country organised by largest population to smallest.
                ArrayList<City> cities4= a.getCitybyCountry();
                a.displayCityCountry(cities4);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (city.equals("5"))
            {
                //All the cities in a district organised by largest population to smallest.
                ArrayList<City> cities5 = a.getCitybyDistrict();
                a.displayCityDistrict(cities5);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (city.equals("6"))
            {
                //Top N populated cities in the world where N is provided by the user.
                ArrayList<City> cities9 = a.gettopCityWorld();
                a.displayTopCitiesWorld(cities9);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (city.equals("7"))
            {
                //Top N populated cities in a continent where N is provided by the user.
                ArrayList<City> cities10 = a.gettopCityContinent();
                a.displayTopCitiesContinent(cities10);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (city.equals("8"))
            {
                //Top N populated cities in a region where N is provided by the user.
                ArrayList<City> cities11 = a.gettopCityRegion();
                a.displayTopCitiesRegion(cities11);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (city.equals("9"))
            {
                //Top N populated cities in a country where N is provided by the user.
                ArrayList<City> cities12 = a.gettopCityCountry();
                a.displayTopCitiesCountry(cities12);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if (city.equals("10"))
            {
                //Top N populated cities in a district where N is provided by the user.
                ArrayList<City> cities13 = a.gettopCityDistrict();
                a.displayTopCitiesDistrict(cities13);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else
            {
                System.out.println("You've entered a wrong input!!");
                // Disconnect from database
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
        }
        else if (menu.equals("3"))
        {
            System.out.print("********************Capital City Report********************\n");
            System.out.println("1. All the capital cities in the world organised by largest population to smallest\n" +
                    "2. All the capital cities in a continent organised by largest population to smallest.\n" +
                    "3. All the capital cities in a region organised by largest to smallest.\n" +
                    "4. The top N populated capital cities in the world where N is provided by the user.\n" +
                    "5. The top N populated capital cities in a continent where N is provided by the user.\n" +
                    "6. The top N populated capital cities in a region where N is provided by the user.\n");
            System.out.println("Please choose a menu to view Capital City Report: ");
            String capcity = scanner.next();
            if (capcity.equals("1"))
            {
                //All the capital cities in the world organised by largest population to smallest.
                ArrayList<City> cities6 = a.getCapitalCities();
                a.displayCapitalCities(cities6);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (capcity.equals("2"))
            {
                //All the capital cities in a continent organised by largest population to smallest.
                ArrayList<City> cities7 = a.getCapitalCitiesbyContinent();
                a.displayCapitalCitiesbyContinent(cities7);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (capcity.equals("3"))
            {
                //All the capital cities in a region organised by largest to smallest.
                ArrayList<City> cities8 = a.getCapitalCitiesbyRegion();
                a.displayCapitalCitiesbyRegion(cities8);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (capcity.equals("4"))
            {
                //Top N populated capital cities in the world where N is provided by the user.
                ArrayList<City> cities14 = a.gettopCapitalCityWorld();
                a.displayTopCapitalCityWorld(cities14);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if (capcity.equals("5"))
            {
                //Top N populated capital cities in a continent where N is provided by the user.
                ArrayList<City> cities15 = a.gettopCapitalCityContinent();
                a.displayTopCapitalCityContinent(cities15);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (capcity.equals("6"))
            {
                //Top N populated capital cities in a region where N is provided by the user.
                ArrayList<City> cities16 = a.gettopCapitalCityRegion();
                a.displayTopCapitalCityRegion(cities16);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else
            {
                System.out.println("You've entered a wrong input!!");
                // Disconnect from database
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
        }
        else if (menu.equals("4"))
        {
            System.out.print("********************Population Report********************\n");
            System.out.println("1. The population of people, people living in cities, and people not living in cities in each continent.\n" +
                    "2. The population of people, people living in cities, and people not living in cities in each region.\n" +
                    "3. The population of people, people living in cities, and people not living in cities in each country.\n" +
                    "4. The population of the world.\n" +
                    "5. The population of a continent.\n" +
                    "6. The population of a region.\n" +
                    "7. The population of a country.\n" +
                    "8. The population of a district.\n" +
                    "9. The population of a city.\n");
            System.out.println("Please choose a menu to view Population Report: ");
            String population = scanner.next();
            if (population.equals("1"))
            {
                //Population of People, People living in Cities, and People not living in Cities in each Continent
                ArrayList<Population> population1 = a.getPopulationDetailContinent();
                a.displayPopulationDetailContinent(population1);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (population.equals("2"))
            {
                //Population of People, People living in Cities, and People not living in Cities in each Region
                ArrayList<Population> population2 = a.getPopulationDetailRegion();
                a.displayPopulationDetailRegion(population2);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (population.equals("3"))
            {
                //Population of People, People living in Cities, and People not living in Cities in each Country
                ArrayList<Population> population3 = a.getPopulationDetailCountry();
                a.displayPopulationDetailCountry(population3);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (population.equals("4"))
            {
                //The population of the world
                ArrayList<Population> population4 = a.getWorldPopulationDetail();
                a.displayWorldPopulationDetail(population4);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (population.equals("5"))
            {
                //The population of a continent
                ArrayList<Population> population5 = a.getContinentPopulationDetail();
                a.displayContinentPopulationDetail(population5);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (population.equals("6"))
            {
                //The population of a region
                ArrayList<Population> population6 = a.getRegionPopulationDetail();
                a.displayRegionPopulationDetail(population6);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (population.equals("7"))
            {
                //The population of a country
                ArrayList<Population> population7 = a.getCountryPopulationDetail();
                a.displayCountryPopulationDetail(population7);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (population.equals("8"))
            {
                //The population of a district
                ArrayList<Population> population8 = a.getDistrictPopulationDetail();
                a.displayDistrictPopulationDetail(population8);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else if (population.equals("9"))
            {
                //The population of a city
                ArrayList<Population> population9 = a.getCityPopulationDetail();
                a.displayCityPopulationDetail(population9);
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
            else
            {
                System.out.println("You've entered a wrong input!!");
                // Disconnect from database
                System.out.println("Do you want to view other Menu? Y,N");
                String input = scanner.next();
                if (input.equals("Y"))
                {
                    String list[]={};
                    a.main(list);
                }
                else if (input.equals("N"))
                {
                    a.disconnect();
                }
                else
                {
                    System.out.println("Invalid Input");
                }            }
        }
        else if (menu.equals("5"))
        {
            System.out.print("************************* Country Language Report ******************************\n");
            //The Country Language Detail
            ArrayList<Population> population10 = a.getCountryLanguageDetail();
            a.displayCountryLanguageDetail(population10);
            System.out.println("Do you want to view other Menu? Y,N");
            String input = scanner.next();
            if (input.equals("Y"))
            {
                String list[]={};
                a.main(list);
            }
            else if (input.equals("N"))
            {
                a.disconnect();
            }
            else
            {
                System.out.println("Invalid Input");
            }        }
        else
        {
            System.out.println("You've entered a wrong menu!!!!");
            // Disconnect from database
            System.out.println("Do you want to view other Menu? Y,N");
            String input = scanner.next();
            if (input.equals("Y"))
            {
                String list[]={};
                a.main(list);
            }
            else if (input.equals("N"))
            {
                a.disconnect();
            }
            else
            {
                System.out.println("Invalid Input");
            }        }
//        City c2 = a.getCity(2710);
//        System.out.println(c2);

    }


    /**
     * Connection to MySQL database.
     */
    public Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect(String location)
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
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
                con = DriverManager.getConnection("jdbc:mysql://" + location + "/world?allowPublicKeyRetrieval=true&useSSL=false", "root", "example");
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
            String strSelect = "SELECT  Code, Name, Continent, Region, Population, Capital FROM country ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
            {
               //Return new country if valid.
               //Check one is returned
               while (rset.next())
               {
                    Country country = new Country();
                    country.setCode(rset.getString("Code"));
                    country.setName(rset.getString("Name"));
                    country.setContinent(rset.getString("Continent"));
                    country.setRegion(rset.getString("Region"));
                    country.setPopulation(rset.getInt("Population"));
                    country.setCapital(rset.getInt("Capital"));
                    cous.add(country);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country in the World details");
        }
        return cous;
    }

    //displaying countries information
    public void displayCountry(ArrayList<Country> cous)
    {
        System.out.print("***********************Countries in the World organised by largest population to smallest***********************\n");
        System.out.printf("%10s%25s%25s%25s%25s%25s","Code","Name","Continent","Region","Population","Capital\n");
        for(Country co:cous)
        {
            System.out.printf("%10s%25s%25s%25s%25s%25s",co.getCode(),co.getName(),co.getContinent(),co.getRegion(),co.getPopulation(),co.getCapital());
            System.out.print("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    //retrieving population of the countries within a continent
    public ArrayList<Country> countries_continent_largest_to_smallest()
    {
        ArrayList<Country> countries = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Continent = 'Europe' "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
            {
               //Return new city if valid.
               //Check one is returned
               while (rset.next())
               {
                    Country country = new Country();
                    country.setName(rset.getString("Name"));
                    country.setRegion(rset.getString("Region"));
                    country.setPopulation(rset.getInt("Population"));
                    country.setCapital(rset.getInt("Capital"));
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
        System.out.printf("%25s%25s%25s%25s","Name","Region","Population","Capital\n");
      for(Country c:countries)
      {
          System.out.printf("%25s%25s%25s%25s",c.getName(),c.getRegion(),c.getPopulation(),c.getCapital());
          System.out.print("\n");
      }
        System.out.print("******************************************************************************************************************\n");
    }

    //retrieving countries's population within a region
    public ArrayList<Country> countries_region_largest_to_smallest()
    {
        ArrayList<Country> Countries = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Continent, Population, Capital "
                            + "FROM country "
                            + "WHERE Region = 'Middle East' "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country country = new Country();
                    country.setName(rset.getString("Name"));
                    country.setContinent(rset.getString("Continent"));
                    country.setPopulation(rset.getInt("Population"));
                    country.setCapital(rset.getInt("Capital"));
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
        // Check countries is not null
        if (Countries == null)
        {
            System.out.println("No data record for countries");
            return;
        }
        System.out.print("***********************countries in a region organised by largest population to smallest***********************\n");
        System.out.printf("%25s%25s%25s%25s","Name","Continent","Population","Capital\n");
        for(Country c:Countries)
        {
            if (c == null)
                continue;
            System.out.printf("%25s%25s%25s%25s",c.getName(),c.getContinent(),c.getPopulation(),c.getCapital());
            System.out.print("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    //retrieving population of the cities in the world largest to smallest
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
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    City   city = new City();
                    city.setName(rset.getString("Name"));
                    city.setDistrict(rset.getString("District"));
                    city.setPopulation(rset.getInt("Population"));
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
        //error control for null city values with unique testing
        if (cities==null)
        {
            System.out.println("No data record for cities");
            return;
        }
        System.out.print("***********************cities in the world organised by largest population to smallest***********************\n");
        System.out.printf("%25s%25s%25s","Name","District","Population\n");
        for(City c:cities)
        {
            if(c==null)
                continue;
                System.out.printf("%25s%25s%25s",c.getName(),c.getDistrict(),c.getPopulation());
                System.out.print("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    //retrieving cities's population within a continent
    public ArrayList<City> getCity_continent() {
        ArrayList<City> cties = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.continent, country.Name,city.CountryCode,city.Name, city.Population "
                            + "FROM city,country "
                            + "WHERE city.CountryCode = country.Code AND country.continent='Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
                {
//             Return new city if valid.
//             Check one is returned
               while (rset.next())
               {
                 Country c =new Country();
                 c.setContinent(rset.getString(1));
                 c.setName(rset.getString(2));
                 c.setCode(rset.getString(3));

                 City ci = new City();
                 ci.setCountry(c);
                 ci.setName(rset.getString(4));
                 ci.setPopulation(rset.getInt(5));
                 cties.add(ci);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by Continent details");
        }
        return cties;
    }

    public void displayCityContinent(ArrayList<City> cties2)
    {
        if(cties2==null){
            System.out.println("no data record for cities");
        }
        System.out.print("**********************cities in a continent organised by largest population to smallest*************************************************\n");
        System.out.printf("%25s%25s%25s%25s%25s","Continent","Name","CountryCode","CityName","Population\n");
        for(City ct:cties2)
        {
            if(ct==null)
                continue;

            System.out.printf("%25s%25s%25s%25s%25s",ct.getCountry().getContinent(),ct.getCountry().getName(),ct.getCountry().getCode(),ct.getName(),ct.getPopulation());
            System.out.print("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    //getting cities' population within region
    public ArrayList<City> getCity_Region()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.District , city.Population, country.Region "
                            + "FROM country, city "
                            + "WHERE city.ID=country.Capital AND country.Region='Southeast Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
                {

                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setRegion(rset.getString(4));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(1));
                    ci.setDistrict(rset.getString(2));
                    ci.setPopulation(rset.getInt(3));
                    cities.add(ci);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Cities in a Region details");
        }
        return cities;
    }

    public void displayCityRegion(ArrayList<City> cties3)
    {
        //check cities_data is not null
        if (cties3==null){
            System.out.println("No data record for cities in region");
        }
        System.out.print("***********************cities in a region organised by largest population to smallest***********************\n");
        System.out.printf("%25s%25s%25s%25s","Name","District","Population","Region\n");
        for(City ct:cties3)
        {
            if (ct==null)
                continue;
            System.out.printf("%25s%25s%25s%25s",ct.getName(),ct.getDistrict(),ct.getPopulation(),ct.getCountry().getRegion());
            System.out.print("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }
    public City getCity(int id){
        City city=null;
        try {

            // Create an SQL statement
            Statement stmt = con.createStatement();
            String strSelect =
                    "SELECT city.ID, city.Name, city.District, city.Population "
                            + "FROM city "
                            + "WHERE city.ID = "+ id +" "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
            {
//             Return new city if valid.
//             Check one is returned

                while (rset.next()){
                    city=new City();
                city.setId(rset.getInt(1));
                city.setName(rset.getString(2));
                city.setDistrict(rset.getString(3));
                city.setPopulation(rset.getInt(4));
                }

            }

        }
             catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println("Failed to get One City!");
            }
        return city;

    }


    //retrieving cities' population for a country by sorting population large to small
    public ArrayList<City> getCitybyCountry()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Name, city.Name, city.District, city.Population "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code AND country.Name = 'Myanmar'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
            {
//             Return new city if valid.
//             Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setName(rset.getString(1));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(2));
                    ci.setDistrict(rset.getString(3));
                    ci.setPopulation(rset.getInt(4));
                    cities.add(ci);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Cities in a Country details");
        }
    return cities;
    }
    public void displayCityCountry(ArrayList<City> cties4)
    {
        if (cties4 == null)
        {
            System.out.println("No data record for city in a country");
            return;
        }
        System.out.print("***********************Cities in a country organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%20s%20s", "Name","CityName","District","Population\n");
        for(City ct:cties4)
        {
            if (ct == null)
                continue;
            System.out.printf("%20s%20s%20s%20s", ct.getCountry().getName(),ct.getName(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    //retrieving cities' population for a district
    public ArrayList<City> getCitybyDistrict() {
        ArrayList<City> cities = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, District, city.Population "
                            + "FROM city "
                            + "WHERE District = 'California'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
            {
//             Return new city if valid.
//             Check one is returned
                while (rset.next())
                {
                    City ci = new City();
                    ci.setName(rset.getString(1));
                    ci.setCountrycode(rset.getString(2));
                    ci.setDistrict(rset.getString(3));
                    ci.setPopulation(rset.getInt(4));
                    cities.add(ci);
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

    public void displayCityDistrict(ArrayList<City> cties5)
    {
        if (cties5 == null)
        {
            System.out.println("No data record for city in a district");
            return;
        }
        System.out.print("***********************cities in a district organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%20s%20s","Name","CountryCode","District","Population\n");
        for(City ct:cties5)
        {
            if (ct == null)
                continue;
            System.out.printf("%20s%20s%20s%20s",ct.getName(),ct.getCountrycode(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("**************************************************************************************************************\n");
    }

    //getting capital cities in the world
    public ArrayList<City> getCapitalCities()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, country.Continent, city.District , city.Population "
                            + "FROM city, country "
                            + "WHERE city.ID = country.Capital "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setName(rset.getString(2));
                    c.setContinent(rset.getString(3));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(1));
                    ci.setDistrict(rset.getString(4));
                    ci.setPopulation(rset.getInt(5));
                    cities.add(ci);

                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Capital Cities details");
        }
        return cities;
    }

    public void displayCapitalCities(ArrayList<City> cties6)
    {
        // Check captial city is not null
        if (cties6 == null)
        {
            System.out.println("No data record for capital_cities");
            return;
        }
        System.out.print("***********************Capital Cities in the World organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%20s%20s%20s","Name","CountryName","Continent","District","Population\n");
        for(City ct:cties6)
        {
            if (ct==null)
                continue;
            System.out.printf("%20s%20s%20s%20s%20s", ct.getName(),ct.getCountry().getName(),ct.getCountry().getContinent(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    //retrieving capital's population for a continent
    public ArrayList<City> getCapitalCitiesbyContinent()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Capital, city.Name, country.Name, country.Continent, city.District, city.Population "
                            + "FROM city, country "
                            + "WHERE city.ID = country.Capital AND country.Continent = 'Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset == null)
            {
                System.out.println("Not Found");
            }
            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setCapital(rset.getInt(1));
                    c.setName(rset.getString(3));
                    c.setContinent(rset.getString(4));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(2));
                    ci.setDistrict(rset.getString(5));
                    ci.setPopulation(rset.getInt(6));
                    cities.add(ci);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Capital City in a Continent details");
        }
        return cities;
    }

    public void displayCapitalCitiesbyContinent(ArrayList<City> cties7)
    {
        // Check cities is not null
        if (cties7 == null)
        {
            System.out.println("no data record for captial city in a continent");
            return;
        }
        System.out.print("***********************Capital Cities in a Continent organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%20s%20s%20s%20s","Capital","Name","CountryName","Continent","District","Population\n");
        for(City ct:cties7)
        {
            if(ct==null)
                continue;
            System.out.printf("%20s%20s%20s%20s%20s%20s",ct.getCountry().getCapital(),ct.getName(),ct.getCountry().getName(),ct.getCountry().getContinent(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    //retrieving captial's population within a region
    public ArrayList<City> getCapitalCitiesbyRegion()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Capital, city.Name, country.Name, country.Region, city.District, city.Population "
                            + "FROM city, country "
                            + "WHERE city.ID = country.Capital AND country.Region='Southeast Asia'"
                            + "ORDER BY city.Population DESC";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setCapital(rset.getInt(1));
                    c.setName(rset.getString(3));
                    c.setRegion(rset.getString(4));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(2));
                    ci.setDistrict(rset.getString(5));
                    ci.setPopulation(rset.getInt(6));
                    cities.add(ci);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Capital City in a Region details");
        }
        return cities;
    }

    public void displayCapitalCitiesbyRegion(ArrayList<City> cties8)
    {
        // Check cities data is not null
        if (cties8 == null)
        {
            System.out.println("No captial city record in a region");
            return;
        }
        System.out.print("***********************Capital Cities in a Region organised by largest population to smallest*****************************\n");
        System.out.printf("%20s%20s%20s%20s%20s%20s", "Capital","Name","CountryName","Region","District","Population\n");
        for(City ct:cties8)
        {
            if(ct==null)
                continue;
            System.out.printf("%20s%20s%20s%20s%20s%20s",ct.getCountry().getCapital(),ct.getName(),ct.getCountry().getName(),ct.getCountry().getRegion(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("**************************************************************************************************************************\n");
    }

    public ArrayList<Country> gettopCountryWorld()
    {
        ArrayList<Country> countries = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Countries in the Wrold : ");
            String number = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Continent, Region, Population "
                            + "FROM country "
                            + "ORDER BY Population DESC "
                            + "Limit " + number;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setName(rset.getString(1));
                    c.setContinent(rset.getString(2));
                    c.setRegion(rset.getString(3));
                    c.setPopulation(rset.getInt(4));
                    countries.add(c);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top countries in the World details");
        }
        return countries;
    }

    public void displayTopCountriesbyWorld(ArrayList<Country> countries1)
    {
        // Check cities data is not null
        System.out.print("***********************Top Countries in the World organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%30s%20s", "Name","Continent","Region","Population\n");
        for(Country ct:countries1)
        {
            if (ct==null)
                continue;
            System.out.printf("%20s%20s%30s%20s",ct.getName(),ct.getContinent(),ct.getRegion(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    public ArrayList<Country> gettopCountryContinent()
    {
        ArrayList<Country> countries = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Countries in Asia : ");
            String input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Continent, Region, Population "
                            + "FROM country "
                            + "Where Continent = 'Asia'"
                            + "ORDER BY Population DESC "
                            + "Limit " + input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setName(rset.getString(1));
                    c.setContinent(rset.getString(2));
                    c.setRegion(rset.getString(3));
                    c.setPopulation(rset.getInt(4));
                    countries.add(c);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top countries in Asia details");
        }
        return countries;
    }

    public void displayTopCountriesbyContinent(ArrayList<Country> countries2)
    {
        // Check cities data is not null
        System.out.print("***********************Top Countries in Asia organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%30s%20s", "Name","Continent","Region","Population\n");
        for(Country ct:countries2)
        {
            if (ct==null)
                continue;
            System.out.printf("%20s%20s%30s%20s",ct.getName(),ct.getContinent(),ct.getRegion(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    public ArrayList<Country> gettopCountryRegion()
    {
        ArrayList<Country> countries = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Countries in Middle East : ");
            String user_input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Continent, Region, Population "
                            + "FROM country "
                            + "Where Region = 'Middle East'"
                            + "ORDER BY Population DESC "
                            + "Limit " + user_input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setName(rset.getString(1));
                    c.setContinent(rset.getString(2));
                    c.setRegion(rset.getString(3));
                    c.setPopulation(rset.getInt(4));
                    countries.add(c);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top countries in Middle East details");
        }
        return countries;
    }

    public void displayTopCountriesbyRegion(ArrayList<Country> countries3)
    {
        // Check cities data is not null
        System.out.print("***********************Top Countries in Middle East organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%30s%20s", "Name","Continent","Region","Population\n");
        for(Country ct:countries3)
        {
            if(ct==null)
                continue;
            System.out.printf("%20s%20s%30s%20s",ct.getName(),ct.getContinent(),ct.getRegion(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    public ArrayList<City> gettopCityWorld()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Populated Cities in the World : ");
            String user_input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "ORDER BY Population DESC "
                            + "Limit " + user_input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    City c =new City();
                    c.setName(rset.getString(1));
                    c.setCountrycode(rset.getString(2));
                    c.setDistrict(rset.getString(3));
                    c.setPopulation(rset.getInt(4));
                    cities.add(c);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top cities in the World details");
        }
        return cities;
    }

    public void displayTopCitiesWorld(ArrayList<City> cities9)
    {
        // Check cities data is not null
        System.out.print("***********************Top Populated Cities in the World organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%30s%20s", "Name","CountryCode","District","Population\n");
        for(City ct:cities9)
        {
            if (ct==null)
                continue;
            System.out.printf("%20s%20s%30s%20s",ct.getName(),ct.getCountrycode(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    public ArrayList<City> gettopCityContinent()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Populated Cities in Europe : ");
            String user_input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.continent, country.Name,city.CountryCode,city.Name, city.Population "
                            + "FROM city,country "
                            + "WHERE city.CountryCode = country.Code AND country.continent='Europe'"
                            + "ORDER BY city.Population DESC "
                            + "Limit " + user_input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setContinent(rset.getString(1));
                    c.setName(rset.getString(2));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setCountrycode(rset.getString(3));
                    ci.setName(rset.getString(4));
                    ci.setPopulation(rset.getInt(5));
                    cities.add(ci);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top cities in Europe details");
        }
        return cities;
    }

    public void displayTopCitiesContinent(ArrayList<City> cities10)
    {
        // Check cities data is not null
        System.out.print("***********************Top Populated Cities in Europe organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%30s%20s%20s", "Continent","CountryName","CountryCode","CityName","Population\n");
        for(City ct:cities10)
        {
            if(ct==null)
                continue;
            System.out.printf("%20s%20s%30s%20s%20s",ct.getCountry().getContinent(),ct.getCountry().getName(),ct.getCountrycode(),ct.getName(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    public ArrayList<City> gettopCityRegion()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Populated Cities in Central America : ");
            String user_input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.District , city.Population, country.Region "
                            + "FROM country, city "
                            + "WHERE city.ID=country.Capital AND country.Region='Central America'"
                            + "ORDER BY city.Population DESC "
                            + "Limit " + user_input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setRegion(rset.getString(4));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(1));
                    ci.setDistrict(rset.getString(2));
                    ci.setPopulation(rset.getInt(3));
                    cities.add(ci);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top cities in Central America details");
        }
        return cities;
    }

    public void displayTopCitiesRegion(ArrayList<City> cities11)
    {
        // Check cities data is not null
        System.out.print("***********************Top Populated Cities in Central America organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%20s%20s", "Name","District","Population","Region\n");
        for(City ct:cities11)
        {
            if (ct==null)
                continue;
            System.out.printf("%20s%20s%20s%20s",ct.getName(),ct.getDistrict(), ct.getPopulation() ,ct.getCountry().getRegion());
            System.out.println("\n");
        }
        System.out.print("*********************************************************************************************************************************\n");
    }

    public ArrayList<City> gettopCityCountry()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Populated Cities in Myanmar : ");
            String user_input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Name, city.Name, city.District, city.Population "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code AND country.Name = 'Myanmar'"
                            + "ORDER BY city.Population DESC "
                            + "Limit " + user_input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setName(rset.getString(1));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(2));
                    ci.setDistrict(rset.getString(3));
                    ci.setPopulation(rset.getInt(4));
                    cities.add(ci);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top cities in Myanmar details");
        }
        return cities;
    }

    public void displayTopCitiesCountry(ArrayList<City> cities12)
    {
        // Check cities data is not null
        System.out.print("***********************Top Populated Cities in Myanmar organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%30s%20s", "CountryName","CityName", "District" ,"Population\n");
        for(City ct:cities12)
        {
            if(ct==null)
                continue;
            System.out.printf("%20s%20s%30s%20s",ct.getCountry().getName(),ct.getName(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("*************************************************************************************************************************\n");
    }

    public ArrayList<City> gettopCityDistrict()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Populated Cities in California : ");
            String user_input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population "
                            + "FROM city "
                            + "WHERE city.District = 'California' "
                            + "ORDER BY city.Population DESC "
                            + "Limit " + user_input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    City ci = new City();
                    ci.setName(rset.getString(1));
                    ci.setCountrycode(rset.getString(2));
                    ci.setDistrict(rset.getString(3));
                    ci.setPopulation(rset.getInt(4));
                    cities.add(ci);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top cities in California details");
        }
        return cities;
    }

    public void displayTopCitiesDistrict(ArrayList<City> cities13)
    {
        // Check cities data is not null
        System.out.print("***********************Top Populated Cities in California organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%30s%20s", "CityName","CountryCode", "District" ,"Population\n");
        for(City ct:cities13)
        {
            if (ct==null)
                continue;
            System.out.printf("%20s%20s%30s%20s",ct.getName(),ct.getCountrycode(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    public ArrayList<City> gettopCapitalCityWorld()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Populated Capital City in the World : ");
            String user_input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, country.Continent, city.District , city.Population "
                            + "FROM city, country "
                            + "WHERE city.ID = country.Capital "
                            + "ORDER BY city.Population DESC "
                            + "Limit " + user_input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setName(rset.getString(2));
                    c.setContinent(rset.getString(3));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(1));
                    ci.setDistrict(rset.getString(4));
                    ci.setPopulation(rset.getInt(5));
                    cities.add(ci);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top Capital City in the World details");
        }
        return cities;
    }

    public void displayTopCapitalCityWorld(ArrayList<City> cities14)
    {
        // Check cities data is not null
        System.out.print("***********************Top Populated Capital City in the World organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%20s%20s%20s","Name","CountryName","Continent","District","Population\n");
        for(City ct:cities14)
        {
            if (ct==null)
                continue;
            System.out.printf("%20s%20s%20s%20s%20s", ct.getName(),ct.getCountry().getName(),ct.getCountry().getContinent(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    public ArrayList<City> gettopCapitalCityContinent()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Populated Capital City in Asia: ");
            String user_input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Capital, city.Name, country.Name, country.Continent, city.District, city.Population "
                            + "FROM city, country "
                            + "WHERE city.ID = country.Capital AND country.Continent = 'Asia'"
                            + "ORDER BY city.Population DESC "
                            + "Limit " + user_input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setCapital(rset.getInt(1));
                    c.setName(rset.getString(3));
                    c.setContinent(rset.getString(4));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(2));
                    ci.setDistrict(rset.getString(5));
                    ci.setPopulation(rset.getInt(6));
                    cities.add(ci);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top Capital City in Asia details");
        }
        return cities;
    }

    public void displayTopCapitalCityContinent(ArrayList<City> cities15)
    {
        // Check cities data is not null
        System.out.print("***********************Top Populated Capital City in Asia organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%20s%20s%20s%20s","Capital","Name","CountryName","Continent","District","Population\n");
        for(City ct:cities15)
        {
            if(ct==null)
                continue;
            System.out.printf("%20s%20s%20s%20s%20s%20s",ct.getCountry().getCapital(),ct.getName(),ct.getCountry().getName(),ct.getCountry().getContinent(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("****************************************************************************************************************************\n");
    }

    public ArrayList<City> gettopCapitalCityRegion()
    {
        ArrayList<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number to print Top Populated Capital City in SouthEast Asia: ");
            String user_input = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Capital, city.Name, country.Name, country.Region, city.District, city.Population "
                            + "FROM city, country "
                            + "WHERE city.ID = country.Capital AND country.Region='Southeast Asia'"
                            + "ORDER BY city.Population DESC "
                            + "Limit " + user_input;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null)
            {
                System.out.println("Not Found");
            }

            else
            {
                //Return new city if valid.
                //Check one is returned
                while (rset.next())
                {
                    Country c =new Country();
                    c.setCapital(rset.getInt(1));
                    c.setName(rset.getString(3));
                    c.setRegion(rset.getString(4));

                    City ci = new City();
                    ci.setCountry(c);
                    ci.setName(rset.getString(2));
                    ci.setDistrict(rset.getString(5));
                    ci.setPopulation(rset.getInt(6));
                    cities.add(ci);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top Capital City in SouthEast Asia details");
        }
        return cities;
    }

    public void displayTopCapitalCityRegion(ArrayList<City> cities16)
    {
        // Check cities data is not null
        System.out.print("***********************Top Populated Capital City in SouthEast Asia organised by largest population to smallest***********************\n");
        System.out.printf("%20s%20s%20s%20s%20s%20s", "Capital","Name","CountryName","Region","District","Population\n");
        for(City ct:cities16)
        {
            if(ct==null)
                continue;
            System.out.printf("%20s%20s%20s%20s%20s%20s",ct.getCountry().getCapital(),ct.getName(),ct.getCountry().getName(),ct.getCountry().getRegion(),ct.getDistrict(),ct.getPopulation());
            System.out.println("\n");
        }
        System.out.print("**************************************************************************************************************************************\n");
    }

    public ArrayList<Population> getPopulationDetailContinent() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "Select country.continent, SUM(country.population) as total_population, " +
                            "SUM((select SUM(population) from city where countrycode = country.code)) as population_in_city, " +
                            "(SUM((select SUM(population) from city where countrycode = country.code)) / SUM(country.population))*100 as percent_in_city " +
                            ", (sum(country.population)-SUM((select SUM(population) from city where countrycode = country.code))) as population_not_in_city, " +
                            "((sum(country.population)-SUM((select SUM(population) from city where countrycode = country.code))) " +
                            "/ SUM(country.population))*100 as percent_not_in_city from country GROUP BY country.continent;";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    Country c = new Country();
                    c.setContinent(rset.getString(1));

                    Population popu = new Population();
                    popu.setCountry(c);
                    popu.setTotal_population(rset.getLong(2));
                    popu.setPopulation_in_city(rset.getLong(3));
                    popu.setPercent_in_city(rset.getFloat(4));
                    popu.setPopulation_not_in_city(rset.getLong(5));
                    popu.setPercent_not_in_city(rset.getFloat(6));
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get people living in cities, and people not living in cities in each continent");
        }
        return populations;
    }
    //1. The population of people, people living in cities, and people not living in cities in each continent.
    public void displayPopulationDetailContinent(ArrayList<Population> population1)
    {
        // Check cities data is not null
        System.out.print("*************************************** Population of people, people living in Cities, and People not living in Cities in each Continent *************************************\n");
        System.out.printf("%25s%25s%25s%25s%25s%25s", "Continent","Total_Population","Population_in_Ciy","Percent_in_City","Population_not_in_City","Percent_not_in_City\n");
        for(Population po:population1)
        {
            if(po==null)
                continue;
            System.out.printf("%25s%25s%25s%25s%25s%25s",po.getCountry().getContinent(),po.getTotal_population(),po.getPopulation_in_city(),po.getPercent_in_city(),po.getPopulation_not_in_city(),po.getPercent_not_in_city());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************************************************************************\n");
    }

    public ArrayList<Population> getPopulationDetailRegion() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "Select country.region, SUM(country.population) as TotalPopulation," +
                            " SUM((select SUM(population) from city where countrycode = country.code)) as population_in_city," +
                            " (SUM((select SUM(population) from city where countrycode = country.code)) / SUM(country.population))*100 as percent_in_cities ," +
                            " (sum(country.population)-SUM((select SUM(population) from city where countrycode = country.code))) as population_not_in_city," +
                            " ((sum(country.population)-SUM((select SUM(population) from city where countrycode = country.code))) / SUM(country.population))*100 as percent_not_in_cities" +
                            " from country GROUP BY country.region;";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    Country c = new Country();
                    c.setRegion(rset.getString(1));

                    Population popu = new Population();
                    popu.setCountry(c);
                    popu.setTotal_population(rset.getLong(2));
                    popu.setPopulation_in_city(rset.getLong(3));
                    popu.setPercent_in_city(rset.getFloat(4));
                    popu.setPopulation_not_in_city(rset.getLong(5));
                    popu.setPercent_not_in_city(rset.getFloat(6));
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get people living in cities, and people not living in cities in each region");
        }
        return populations;
    }

    public void displayPopulationDetailRegion(ArrayList<Population> population2)
    {
        // Check cities data is not null
        System.out.print("**********************************Population of people, people living in Cities, and People not living in Cities in each Region****************************\n");
        System.out.printf("%25s%25s%25s%25s%25s%25s", "Region","Total_Population","Population_in_Ciy","Percent_in_City","Population_not_in_City","Percent_not_in_City\n");
        for(Population po:population2)
        {
            if(po==null)
                continue;
            System.out.printf("%25s%25s%25s%25s%25s%25s",po.getCountry().getRegion(),po.getTotal_population(),po.getPopulation_in_city(),po.getPercent_in_city(),po.getPopulation_not_in_city(),po.getPercent_not_in_city());
            System.out.println("\n");
        }
        System.out.print("***********************************************************************************************************************************************************\n");
    }

    public ArrayList<Population> getPopulationDetailCountry() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "select country.name, " +
                            "country.population, " +
                            "country.population-sum(city.population) as 'population_not_in_city', " +
                            "((country.population-sum(city.population))/country.population)*100 as '%'," +
                            " country.population - (country.population-sum(city.population)) as 'population_in_city', " +
                            "((country.population - (country.population-sum(city.population)))/country.population)*100 as '%' " +
                            "from country country join city city on country.code = city.countrycode " +
                            "where city.countrycode = country.code GROUP BY country.name, country.population ORDER BY country.name;";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    Country c = new Country();
                    c.setName(rset.getString(1));
                    c.setPopulation(rset.getInt(2));

                    Population popu = new Population();
                    popu.setCountry(c);
                    popu.setPopulation_in_city(rset.getLong(5));
                    popu.setPercent_in_city(rset.getFloat(6));
                    popu.setPopulation_not_in_city(rset.getLong(3));
                    popu.setPercent_not_in_city(rset.getFloat(4));
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get people living in cities, and people not living in cities in each Country");
        }
        return populations;
    }

    public void displayPopulationDetailCountry(ArrayList<Population> population3)
    {
        // Check cities data is not null
        System.out.print("******************************* Population of people, people living in Cities, and People not living in Cities in each Country *******************************\n");
        System.out.print("\n");
        System.out.printf("%25s%25s%25s%25s%25s%25s", "Region","Total_Population","Population_not_in_Ciy","Percent_not_in_City","Population_in_City","Percent_in_City\n");
        System.out.print("\n");
        for(Population po:population3)
        {
            if(po==null)
                continue;
            System.out.printf("%25s%25s%25s%25s%25s%25s",po.getCountry().getName(),po.getCountry().getPopulation(),po.getPopulation_not_in_city(),po.getPercent_not_in_city(),po.getPopulation_in_city(),po.getPercent_in_city());
            System.out.println("\n");
        }
        System.out.print("**************************************************************************************************************************************************************\n");
    }

    public ArrayList<Population> getWorldPopulationDetail() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT sum(population) FROM country";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    Population popu = new Population();
                    popu.setTotal_population(rset.getLong(1));
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get World Population");
        }
        return populations;
    }

    public void displayWorldPopulationDetail(ArrayList<Population> population4)
    {
        // Check cities data is not null
        System.out.print("*********************** The Population of the World ***********************\n");
        System.out.print("\n");
        System.out.printf("%30s", "The Population of the whole world is:");
        for(Population po:population4)
        {
            if(po==null)
                continue;
            System.out.println(po.getTotal_population());
            System.out.println("\n");
        }
        System.out.print("*************************************************************************\n");
    }

    public ArrayList<Population> getContinentPopulationDetail() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a Continent: ");
            String continent = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT continent,sum(population) FROM country WHERE continent = '"+continent+"' group by continent;";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    Country c = new Country();
                    c.setContinent(rset.getString(1));

                    Population popu = new Population();
                    popu.setCountry(c);
                    popu.setTotal_population(rset.getLong(2));
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get a Continent Population");
        }
        return populations;
    }

    public void displayContinentPopulationDetail(ArrayList<Population> population5)
    {
        // Check cities data is not null
        System.out.print("***********************The Population of a Continent***********************\n");
        System.out.printf("%20s%25s", "Continent","Population\n");
        for(Population po:population5)
        {
            if(po==null)
                continue;
            System.out.printf("%20s%25s",po.getCountry().getContinent(),po.getTotal_population());
            System.out.println("\n");
        }
        System.out.print("***************************************************************************\n");
    }

    public ArrayList<Population> getRegionPopulationDetail() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a Region: ");
            String region = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT region,sum(population) FROM country WHERE region = '"+region+"' group by region;";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    Country c = new Country();
                    c.setRegion(rset.getString(1));

                    Population popu = new Population();
                    popu.setCountry(c);
                    popu.setTotal_population(rset.getLong(2));
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get a Region Population");
        }
        return populations;
    }

    public void displayRegionPopulationDetail(ArrayList<Population> population6)
    {
        // Check cities data is not null
        System.out.print("***********************The Population of a Region***********************\n");
        System.out.printf("%20s%25s", "Region","Population\n");
        for(Population po:population6)
        {
            if(po==null)
                continue;
            System.out.printf("%20s%25s",po.getCountry().getRegion(),po.getTotal_population());
            System.out.println("\n");
        }
        System.out.print("*************************************************************************\n");
    }


    public ArrayList<Population> getCountryPopulationDetail() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a Country: ");
            String country = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT name,sum(population) FROM country WHERE name = '"+country+"' group by name;";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    Country c = new Country();
                    c.setName(rset.getString(1));

                    Population popu = new Population();
                    popu.setCountry(c);
                    popu.setTotal_population(rset.getLong(2));
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get a Country Population");
        }
        return populations;
    }

    public void displayCountryPopulationDetail(ArrayList<Population> population7)
    {
        // Check cities data is not null
        System.out.print("***********************The Population of a Country***********************\n");
        System.out.printf("%20s%25s", "Country","Population\n");
        for(Population po:population7)
        {
            if(po==null)
                continue;
            System.out.printf("%20s%25s",po.getCountry().getName(),po.getTotal_population());
            System.out.println("\n");
        }
        System.out.print("*************************************************************************\n");
    }

    public ArrayList<Population> getDistrictPopulationDetail() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a District: ");
            String district = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT district,sum(population) FROM city WHERE district = '"+district+"' group by district;";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    City c = new City();
                    c.setDistrict(rset.getString(1));

                    Population popu = new Population();
                    popu.setCity(c);
                    popu.setTotal_population(rset.getLong(2));
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get a District Population");
        }
        return populations;
    }

    public void displayDistrictPopulationDetail(ArrayList<Population> population8)
    {
        // Check cities data is not null
        System.out.print("***********************The Population of a District***********************\n");
        System.out.printf("%20s%25s", "District","Population\n");
        for(Population po:population8)
        {
            if(po==null)
                continue;
            System.out.printf("%20s%25s",po.getCity().getDistrict(),po.getTotal_population());
            System.out.println("\n");
        }
        System.out.print("**************************************************************************\n");
    }

    public ArrayList<Population> getCityPopulationDetail() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a City: ");
            String city = scanner.next(); // get string
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT name,population FROM city WHERE name = '"+city+"';";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    City c = new City();
                    c.setName(rset.getString(1));
                    c.setPopulation(rset.getInt(2));

                    Population popu = new Population();
                    popu.setCity(c);
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get a City Population");
        }
        return populations;
    }

    public void displayCityPopulationDetail(ArrayList<Population> population9)
    {
        // Check cities data is not null
        System.out.print("***********************The Population of a City***********************\n");
        System.out.printf("%20s%20s", "City","Population\n");
        for(Population po:population9)
        {
            if(po==null)
                continue;
            System.out.printf("%20s%20s",po.getCity().getName(),po.getCity().getPopulation());
            System.out.println("\n");
        }
        System.out.print("******************************************************************************************************************\n");
    }

    public ArrayList<Population> getCountryLanguageDetail() {
        ArrayList<Population> populations = new ArrayList<>();
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT countrylanguage.language, sum(countrylanguage.percentage * city.population), " +
                            "sum(city.population * countrylanguage.percentage)/(SELECT sum(population) from country) " +
                            "from countrylanguage, city " +
                            "where countrylanguage.countrycode = city.countrycode " +
                            "and countrylanguage.language in ('Chinese','English','Hindi','Spanish','Arabic') " +
                            "GROUP BY countrylanguage.language;";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            if (rset == null) {
                System.out.println("Not Found");
            } else {
                //Return new city if valid.
                //Check one is returned
                while (rset.next()) {
                    Language lan = new Language();
                    lan.setLanguage(rset.getString(1));
                    lan.setPopulation_per_language(rset.getFloat(2));

                    Population popu = new Population();
                    popu.setLanguage(lan);
                    popu.setPopulation_percent(rset.getFloat(3));
                    populations.add(popu);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get a CountryLanguage");
        }
        return populations;
    }

    public void displayCountryLanguageDetail(ArrayList<Population> population10)
    {
        // Check cities data is not null
        //System.out.print("*********************** Country Language Detail *******************************\n");
        System.out.printf("%20s%30s%30s", "Language","Percentage","Population\n");
        for(Population po:population10)
        {
            if(po==null)
                continue;
            System.out.printf("%20s%30s%30s",po.getLanguage().getLanguage(),po.getLanguage().getPopulation_per_language(),po.getPopulation_percent());
            System.out.println("\n");
        }
        System.out.print("**********************************************************************************\n");
    }
}
