package DevOps_Group_8;

        import org.junit.jupiter.api.BeforeAll;
        import org.junit.jupiter.api.Test;
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

    @Test
    void testgetCity()
    {
        City c2 = app.getCity(2710);
        assertEquals(c2.getId(), 2710);
        assertEquals(c2.getName(), "Rangoon (Yangon)");//NOPMD
        assertEquals(c2.getPopulation(), 3361700);
    }
}