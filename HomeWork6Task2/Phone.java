package HomeWork6Task2;

public class Phone {
    int number;
    String model = "iPhone14";
    int weight = 203;

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void getNumber(int number) {
        System.out.println(number);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Calling " + name + " " + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Selected numbers: " + numbers.length);
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println();
    }
}
