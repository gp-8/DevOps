

package DevOps_Group_8;

import DevOps_Group_8.App;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.jar.Attributes;

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
    @Test
    void getcityTESTNull()
    {
        app.getCity();
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
    @Test
    void getcountries_region_largest_to_smallest(){
        app.countries_region_largest_to_smallest();
    }
    //null value testing for displaying cities in a continent
    @Test
    void displayCityContinentTESTNull(){
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.displayCityContinent(cities);
    }
    @Test
    void getcitycontinentTESTNull(){
        app.getCity_continent();
    }
    @Test
    void displayCityRegionTESTNull(){
        ArrayList<City> cities =new ArrayList<>();
        cities.add(null);
        app.displayCityRegion(cities);
    }
    @Test
    void getcityregion(){
        app.getCity_Region();
    }

    @Test
    void displayCitybyCountryTESTNull(){
        ArrayList<City> cities =new ArrayList<>();
        cities.add(null);
        app.displayCityCountry(cities);
    }
    @Test
    void getcitybycountry(){
        app.getCitybyCountry();
    }

    @Test
    void displayCitybyDistrictTESTNull(){
        ArrayList<City> cities=new ArrayList<>();
        cities.add(null);
        app.displayCityDistrict(cities);
    }
    @Test
    void getcitybydistrict(){
        app.getCitybyDistrict();
    }
    @Test
    void getCapitalCitiesTESTNull(){
        ArrayList<City> cities=new ArrayList<>();
        cities.add(null);
        app.displayCapitalCities(cities);
    }
    @Test
    void getcapitalcities(){
        app.getCapitalCities();
    }
    @Test
    void getCapitalCitiesbyContinentTESTNull(){
        ArrayList<City> cities=new ArrayList<>();
        cities.add(null);
        app.displayCapitalCitiesbyContinent(cities);
    }
    @Test
    void getcapitalcitiesbycontinent(){
        app.getCapitalCitiesbyContinent();
    }
    @Test
    void displayCapitalCitiesbyRegionTESTNull(){
        ArrayList<City> cities=new ArrayList<>();
        cities.add(null);
        app.displayCapitalCitiesbyRegion(cities);
    }
    @Test
    void getcaptialcitiesbyregion(){
        app.getCapitalCitiesbyRegion();
    }
}

