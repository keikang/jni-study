package my.example.jndistudy.example;

public class UserData {

    public String name;
    public double balance;

    public String getUserInfo() {
        return "[name]=" + name + ", [balance]=" + balance;
    }

    public UserData(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
}
