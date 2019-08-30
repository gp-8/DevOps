package DevOps_Group_8;

        import org.junit.jupiter.api.BeforeAll;
        import org.junit.jupiter.api.Test;

        import java.sql.SQLException;
        import java.util.ArrayList;

        import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060");
    }

    //Test the correct City by ID
    @Test
    void testgetCity()
    {
        City c2 = app.getCity(2710);
        assertEquals(c2.getId(), 2710);
        assertEquals(c2.getName(), "Rangoon (Yangon)");//NOPMD
        assertEquals(c2.getPopulation(), 3361700);
    }

    //Test the correct Country by Continent
    @Test
    void testgetCountryContinent() throws SQLException
    {
        ArrayList<Country> ctries = app.countries_continent_largest_to_smallest();

        for (Country c: ctries) {
            if (c.getName().equals("Myanmar"))
            {
                assertEquals(c.getCode(),null);
                assertEquals(c.getContinent(), "Asia");
            }
        }
    }

}