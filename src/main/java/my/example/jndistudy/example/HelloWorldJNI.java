package my.example.jndistudy.example;

public class HelloWorldJNI {

    static {

        System.loadLibrary("native");
    }

    public static void main(String[] args) {
        new HelloWorldJNI().sayHello();

        long sum = new HelloWorldJNI().sumIntegers(42, 43);
        System.out.println("sumIntegers sum 결과  : "+sum);

        String fullName = new HelloWorldJNI().sayHelloToMe("keikang", false);
        System.out.println("sayHelloToMe fullName 결과 : "+fullName);

        UserData userData = new HelloWorldJNI().createUser("keikang", 30000000000D);
        System.out.println("sayHelloToMe createUser userData 결과 : "+userData.getUserInfo());

        UserData paramUserData = new UserData("paramKeikang", 30000000000D);
        String userDataToString = new HelloWorldJNI().printUserData(paramUserData);
        System.out.println("sayHelloToMe printUserData userDataToString 결과 : "+userDataToString);
    }

    private native void sayHello();

    private native long sumIntegers(int first, int second);

    private native String sayHelloToMe(String name, boolean isFemale);

    private native UserData createUser(String name, double balance);

    private native String printUserData(UserData user);
}
