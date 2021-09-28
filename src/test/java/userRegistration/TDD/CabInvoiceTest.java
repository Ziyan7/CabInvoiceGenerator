package userRegistration.TDD;

import org.junit.Assert;
import org.junit.Test;
public class CabInvoiceTest {
	    @Test
		public void givenDistanceAndTimeShouldReturnTotalFare() {
			CabInvoice invoiceGenerator = new CabInvoice();
			double distance = 2.0;
			int time = 5;
			double fare = invoiceGenerator.calculateFare(distance, time);
			Assert.assertEquals(25, fare, 0.0);
		}
	}
