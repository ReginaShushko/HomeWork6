package HomeWork6Task2;

public class Phone {
    int number = 331112233;
    String model = "iPhone14";
    int weight = 203;

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void getNumber(int number) {
        this.number = number;
        System.out.println(number);
    }

    public void receiveCall(String name, int number) {
        this.number = number;
        System.out.println("Calling " + name + " " + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Selected numbers: " + numbers.length);
        for (int x : numbers) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
}
