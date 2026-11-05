import com.napier.Country;
import com.napier.Database;
import com.napier.Main;
import com.napier.Querys;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestSuite {
    static Database db;

    @BeforeAll
    static void init()
    {
        db = Main.startDb("root", "password", "jdbc:mysql://localhost:3306/", "world");
    }

    @Test
    void dbConnectionTest()
    {
        assertNotNull(db.getConnection());
    }

    @Test
    void countryQueryTest(){
        ArrayList<Country> countriesInWorldDescOut = db.countryQuery(Querys.countriesInWorldDesc, "", "");
        assertEquals("China", countriesInWorldDescOut.get(0).getName());
    }
}