package DevOps_Group_8;

public class City {
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countrycode='" + countrycode + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", country=" + country +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String name;
    private String countrycode;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    private String district;
    private int population;

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    private Country country;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public static String getCityFormat() {
        return "%-30.25s  %-30.25s  %-30s  %-30s";
    }

    public static void printCity() {
        System.out.println("\n");
        System.out.printf(City.getCityFormat(), "NAME", "COUNTRY", "DISTRICT", "POPULATION");
        System.out.println("\n");
    }

}
