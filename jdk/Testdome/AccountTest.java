package jdk.Testdome;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        Assert.assertFalse(account.deposit(-10d));
        Assert.assertFalse(account.withdraw(-10d));
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void accountCannotOverstepItsOverdraftLimit() {
        Account account = new Account(-20);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void theDepositOrWithdrawTheCorrectAmount() {
        Account account = new Account(20);
        Assert.assertTrue( account.deposit(10d));
        Assert.assertEquals(30d , account.getBalance());

    }

    @Test
    public void theDepositAndWithdrawResultCorrectResults() {
        Account account = new Account(20);
        Assert.assertEquals(true , account.deposit(10d));
        Assert.assertEquals(30d , account.getBalance());
        Assert.assertEquals(true , account.withdraw(-10d));
        Assert.assertEquals(20d , account.getBalance());
    }
}
