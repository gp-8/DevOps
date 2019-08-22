package DevOps_Group_8;

public class City {
    private String name;
    private String countrycode;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", countrycode='" + countrycode + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", country=" + country +
                '}';
    }

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

}
