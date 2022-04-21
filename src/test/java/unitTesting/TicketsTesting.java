package unitTesting;

import lesson9.Tickets;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TicketsTesting {
    @Test
    public void tickets_infant_freeTicket(){
        // Arrange
        Tickets passenger = new Tickets(1,1000);

        // Act
        double result = passenger.calculatePrice();

        // Assert
        Assert.assertEquals(result,0.0);
    }

    @Test
    public void tickets_child_halfPrice(){
        Tickets passenger = new Tickets(5,1000);
        double result = passenger.calculatePrice();
        Assert.assertEquals(result,500.0);
    }
    @Test
    public void tickets_adult_fullPrice(){
        Tickets passenger = new Tickets(25,1000);
        double result = passenger.calculatePrice();
        Assert.assertEquals(result,1000.0);
    }
    @Test
    public void tickets_senior_80percent(){
        Tickets passenger = new Tickets(75,1000);
        double result = passenger.calculatePrice();
        Assert.assertEquals(result,800.0);
    }
}
