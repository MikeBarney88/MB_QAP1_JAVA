public class TestAccount {
    public static void main(String[] args) {

        // 3.a Create 2 accounts.
        Account Acc1 = new Account("A1","Account 1",5000);
        Account Acc2 = new Account("A2","Account 2",4000);

        // 3.b Display Balance with getBalance().
        System.out.println("Initial balances:");
        System.out.println("Account 1 balance: $" + Acc1.getBalance());
        System.out.println("Account 2 balance: $" + Acc2.getBalance());

        // 3.c Transfer from account
        System.out.println("\nTransferring $1000 from Account 1 to Account 2...");
        Acc1.transferTo(Acc2, 1000);

        // 3.d Display updated balances
        System.out.println("\nBalances after transfer:");
        System.out.println("Account 1 balance: $" + Acc1.getBalance());
        System.out.println("Account 2 balance: $" + Acc2.getBalance());
    }
}