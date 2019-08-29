

package DevOps_Group_8;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

//    @Test
//    void displayCityRegionTESTNull(){
//        ArrayList<City> cities =new ArrayList<>();
//        cities.add(null);
//        app.displayCityRegion(cities);
//    }
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
        ArrayList<City> cities1=new ArrayList<>();
        cities1.add(null);
        app.displayCityDistrict(cities1);
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




    @Test
    void displayTopcountriesbyworldTESTNull(){
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(null);
        app.displayTopCountriesbyWorld(countries);
    }


    @Test
    void displayTopCountriesbyContinentNullTest(){
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(null);
        app.displayTopCountriesbyContinent(countries);
    }


    @Test
    void displaytopcountriesregion(){
        ArrayList<Country> countries =new ArrayList<>();
        countries.add(null);
        app.displayTopCountriesbyContinent(countries);
    }


    @Test
    void displayTopCitiesWorld(){
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        app.displayTopCitiesWorld(cities);
    }


    @Test
    void displayTopCitiesContinent(){
        ArrayList<City> cities= new ArrayList<>();
        cities.add(null);
        app.displayTopCitiesContinent(cities);
    }



    @Test
    void displayTopCitiesRegion(){
        ArrayList<City> cities=new ArrayList<>();
        cities.add(null);
        app.displayTopCitiesRegion(cities);
    }

    @Test
    void displayTopCitiesCountry(){
        ArrayList<City> cities=new ArrayList<>();
        cities.add(null);
        app.displayTopCitiesCountry(cities);
    }


    @Test
    void displayTopCitiesDistrict(){
        ArrayList<City> cities= new ArrayList<>();
        cities.add(null);
        app.displayTopCitiesDistrict(cities);
    }

    @Test
    void getcityTestNull(){
        app.getCity();
    }

    @Test
    void testingcountry(){
        Country country = new Country();
        country.setName("Test");
        country.setContinent("Test");
        country.setPopulation(10000);
        country.setCapital (100);
        country.getName();
        country.getContinent();
        country.getRegion();
        country.getPopulation();
        country.getCapital();
        country.getCode();
    }
    @Test
    void testingcity(){
        City   city = new City();
        city.setName("Test");
        city.setCountrycode("TET");
        city.setDistrict("Test");
        city.setPopulation(1000);
        city.getCountry();
        city.getName();
        city.getPopulation();
        city.getDistrict();
        city.getCountrycode();
    }

    @Test
    void testprintCity()
    {
        City city = new City();
        city.printCity();
    }

    @Test
    void testprintCountry()
    {
        Country country = new Country();
        country.printCountry();
    }

    @Test
    void testprintLanguage()
    {
        Language language = new Language();
        language.printLanguage();
    }

    @Test
    void testprintPopulation()
    {
        Population population = new Population();
        population.printPopulation();
    }

}

