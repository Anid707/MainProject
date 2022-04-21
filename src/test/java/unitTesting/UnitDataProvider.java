package unitTesting;

import lesson9.Tickets;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UnitDataProvider {
    @DataProvider(name = "ticket")
    public Object[][] getData(){
        return new Object[][]{
                {1,1000,0.0},
                {2,1000,0.0},
                {12,1000,500.0},
                {3,1000,500.0},
                {13,1000,1000.0},
                {65,1000,1000.0},
                {66,1000,800.0},
                {15,1000,1000.0 },
                {70,1000,800.0}
        };
    }

    @Test(dataProvider = "ticket")
    public void testTicket(int age, int baseFare,double expectedResult){
        Tickets passenger = new Tickets(age,baseFare);
        double res = passenger.calculatePrice();
        Assert.assertEquals(expectedResult,res);
    }
}
