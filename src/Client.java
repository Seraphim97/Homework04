public class Client {
    String name;
    double balance;
    int ID;

    public Client(String name, double balance, int ID) {
        this.name = name;
        this.balance = balance;
        this.ID = ID;

    }

    public Client() {

    }
    public String sayHello () {
    return "Tere";

}
public double balanceDifference ( double firstClientBalance, double secondClientBalance) {
        return firstClientBalance - secondClientBalance;
    }
}





