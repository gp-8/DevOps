package DevOps_Group_8;

public class City {
    private String name;

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
