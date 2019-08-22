

package DevOps_Group_8;

import DevOps_Group_8.App;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }
    //testing for display_cities function
    @Test
    void printCityTestNull()
    {
        app.displayCity(null);
    }
    //testing for null value contain in cities record
    @Test
    void printCitiesTestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayCity(cities);
    }

    //null value testing for displaying countries in a region
    @Test
    void countries_region_largest_to_smallestTESTNull (){
        ArrayList<Country> countries= new ArrayList<Country>();
        countries.add(null);
        app.displayCountries_region_largest_to_smallest(countries);
    }

    //null value testing for displaying cities in a continent
    @Test
    void displayCityContinentTESTNull(){
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayCityContinent(cities);
    }

}

