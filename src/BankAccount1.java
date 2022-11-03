public class BankAccount1 {
    String name;
    double balance;
    boolean open;
    public BankAccount1(boolean open){
        this("hello",11.0,open);
    }
    public BankAccount1(String name, double balance, boolean open){
        this.name=name;
        this.balance=balance;
        this.open=open;
    }

}
