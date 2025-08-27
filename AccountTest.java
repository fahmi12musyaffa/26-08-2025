public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sa0001 = new SavingsAccount();
        sa0001.balance = 5000;
        sa0001.name = "Fahmi";
        sa0001.interestRate = 0.01;
        sa0001.displayCustomer();
        sa0001.deposit(500);
        System.out.println("Saldo setelah di setor: " + sa0001.balance);

        Bond bond1 = new Bond();
        bond1.name = "fahmi";
        bond1.balance = 5000;
        bond1.setTermAndRate(24);

        System.out.println("\nSimulasi Obligasi untuk" + bond1.name);
        for(int i= 0; i < 2; i++){
            bond1.earnInterest();
        }

        }

}

