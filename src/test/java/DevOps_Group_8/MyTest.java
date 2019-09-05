

package DevOps_Group_8;

//import org.graalvm.compiler.lir.aarch64.AArch64ArithmeticOp;
//import com.sun.jdi.event.ClassUnloadEvent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.image.AreaAveragingScaleFilter;
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
//====================================================
    // for code_review 4
    @Test
    void displayPopulationDetailContinentTEST(){
        ArrayList<Population> popu = new ArrayList<>();
        popu.add(null);
        app.displayPopulationDetailContinent(popu);
    }
    @Test
    void displayPopulationDetailRegionTEST(){
        ArrayList<Population> popu =new ArrayList<>();
        popu.add(null);
        app.displayPopulationDetailRegion(popu);
    }
    @Test
    void displayPopulationDetailCountryTEST(){
        ArrayList<Population> popu = new ArrayList<>();
        popu.add(null);
        app.displayPopulationDetailCountry(popu);
    }
    @Test
    void displayWorldPopulationDetailTEST(){
        ArrayList<Population> popu = new ArrayList<>();
        popu.add(null);
        app.displayWorldPopulationDetail(popu);
    }
    @Test
    void displayContinentPopulationDetailTEST(){
        ArrayList<Population> popu = new ArrayList<>();
        popu.add(null);
        app.displayContinentPopulationDetail(popu);
    }
    @Test
    void displayRegionPopulationDetailTEST(){
        ArrayList<Population> popu= new ArrayList<>();
        popu.add(null);
        app.displayRegionPopulationDetail(popu);
    }
    @Test
    void displayCountryPopulationDetailTEST(){
        ArrayList<Population>popu = new ArrayList<>();
        popu.add(null);
        app.displayCountryPopulationDetail(popu);
    }
    @Test
    void displayDistrictPopulationDetailTEST(){
        ArrayList<Population> popu = new ArrayList<>();
        popu.add(null);
        app.displayDistrictPopulationDetail(popu);
    }
    @Test
    void displayCityPopulationDetailTEST(){
        ArrayList<Population> popu= new ArrayList<>();
        popu.add(null);
        app.displayCityPopulationDetail(popu);
    }

    @Test
    void displayCountryLanguageDetailTEST(){
        ArrayList<Population> popu = new ArrayList<>();
        popu.add(null);
        app.displayCountryLanguageDetail(popu);
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
    void testinglanguage(){
        Language language =new Language();
        language.setLanguage("Testing");
        language.setPopulation_per_language(1);
        language.setCountrycode("TET");
        language.setPercentage(20);
        language.getLanguage();
        language.getPopulation_per_language();
        language.getCountrycode();
        language.getPercentage();
    }
    @Test
    void testingPopulation(){
        Country c = new Country();
        City cc = new City();
        Language l = new Language();

        Population population = new Population();
        population.setName("test");
        population.setCountry(c);
        population.setCity(cc);
        population.setLanguage(l);
        population.setTotal_population(100);
        population.setPercent_in_city(20);
        population.setTotal_population(100);
        population.setPercent_not_in_city(10);
        population.setPopulation_in_city(100);
        population.setPopulation_not_in_city(200);
        population.setPopulation_percent(100);
        population.getName();
        population.getCountry();
        population.getCity();
        population.getLanguage();
        population.getTotal_population();
        population.getPercent_in_city();
        population.getPopulation_in_city();
        population.getPopulation_percent();
        population.getPercent_not_in_city();
        population.getPopulation_not_in_city();
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

