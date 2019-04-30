import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccountTest {

    Account a = new Account();
    //test balance value when object created
    @Test
    public void testAccount() {
        Account a = new Account();
        double expected = 0;
        double actual = a.getBalance();
        assertEquals(expected,actual,0);
    }

//test account balance with balance argument of 20
    @Test
    public void testAccountDouble() {
        Account a = new Account(20);
        double expected = 20;
        double actual = a.getBalance();
        assertEquals(expected,actual,0);
    }
    //test withdrawProcess
    @Test
    public void testWithdrawProcess() throws InsufficientFunds {
        String actual = "0";
        a.withdrawProcess(actual);
        String expected = "0";
        assertEquals(actual,expected);
    }

    //test depositProcess
    @Test
    public void testDepositProcess() {
        a.depositProcess("40");
        assertEquals(a.getBalance(),40,0);
    }

    //tests if balance returns correct value
    @Test
    public void testGetBalance() {
        Account a = new Account();
        double balance = a.getBalance();
        assertEquals(balance,0.0,0);
    }
}