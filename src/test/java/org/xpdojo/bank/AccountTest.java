package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositShouldIncreaseBalance() {
        Account account = new Account();
        account.deposit(10);
        account.deposit(30);
        assertThat(account.balance()).isEqualTo(40);
    }
}
