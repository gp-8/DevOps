package DevOps_Group_8;

public class Population {
    @Override
    public String toString() {
        return "Population{" +
                "name='" + name + '\'' +
                ", total_population=" + total_population +
                ", population_in_city=" + population_in_city +
                ", percent_in_city=" + percent_in_city +
                ", population_not_in_city=" + population_not_in_city +
                ", percent_not_in_city=" + percent_not_in_city +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    private Country country;

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    private City city;

    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotal_population() {
        return total_population;
    }

    public void setTotal_population(long total_population) {
        this.total_population = total_population;
    }

    public long getPopulation_in_city() {
        return population_in_city;
    }

    public void setPopulation_in_city(long population_in_city) {
        this.population_in_city = population_in_city;
    }

    public float getPercent_in_city() {
        return percent_in_city;
    }

    public void setPercent_in_city(float percent_in_city) {
        this.percent_in_city = percent_in_city;
    }

    public long getPopulation_not_in_city() {
        return population_not_in_city;
    }

    public void setPopulation_not_in_city(long population_not_in_city) {
        this.population_not_in_city = population_not_in_city;
    }

    public float getPercent_not_in_city() {
        return percent_not_in_city;
    }

    public void setPercent_not_in_city(float percent_not_in_city) {
        this.percent_not_in_city = percent_not_in_city;
    }

    private String name;
    private long total_population;
    private long population_in_city;
    private float percent_in_city;
    private long population_not_in_city;
    private float percent_not_in_city;
    private float population_percent;

    public float getPopulation_percent() {
        return population_percent;
    }

    public void setPopulation_percent(float population_percent) {
        this.population_percent = population_percent;
    }

    public static String getPopulationFormat() {
        return "%-30.25s  %-30.25s  %-30s %-30.25s  %-30.25s  %-30s";
    }

    public static void printPopulation() {
        System.out.println("\n");
        System.out.printf(Population.getPopulationFormat(), "total_population", "population_in_city", "percent_in_city","population_not_in_city","percent_not_in_city","population_percent");
        System.out.println("\n");
    }
}
