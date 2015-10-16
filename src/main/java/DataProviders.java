/**
 * Created by Olga on 14.10.2015.
 */
public class DataProviders {
    @DateProvider(name = "primalNumbers")

    public static Object[][] getTestNumbers() {
        return new Object[][]{
                {3, true},
                {25, false},
                {71, true},
                {13, true},
                {16, false},
                {17, true},
                {19, true},
        };
    }
}
