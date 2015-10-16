/**
 * Created by Olga on 14.10.2015.
 */
public class SimpleTest {

    @Test(dataProvider = "primalNumbers", dataProviderClass = DataProviders.class, group = "DDT")
    public void simpleTest(int number, boolean expectedResult) {
        PrimalNumberChecker checker = new PrimalNumberChecker();
boolean result = checker.isNumberPrimal(number);
        Assert.assertEquals(result,expectedResult);
    }
    @Test(groups = "sanity")
public void fifteenTest() {

            PrimalNumberChecker checker = new PrimalNumberChecker();
            boolean result = checker.isNumberPrimal(15);
            Assert.assertEquals(result,false);
}
    @Test(groups = "sanity")
    public void twentyThreeTest() {

        PrimalNumberChecker checker = new PrimalNumberChecker();
        boolean result = checker.isNumberPrimal(23);
        Assert.assertEquals(result,true);
    }
}
