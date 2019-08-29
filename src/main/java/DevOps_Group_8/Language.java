package DevOps_Group_8;

public class Language {
    private String countrycode;
    private String language;
    private float percentage;
    private float population_per_language;

    @Override
    public String toString() {
        return "Language{" +
                "countrycode='" + countrycode + '\'' +
                ", language='" + language + '\'' +
                ", percentage=" + percentage +
                ", population_per_language=" + population_per_language +
                '}';
    }

    public float getPopulation_per_language() {
        return population_per_language;
    }

    public void setPopulation_per_language(float population_per_language) {
        this.population_per_language = population_per_language;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
