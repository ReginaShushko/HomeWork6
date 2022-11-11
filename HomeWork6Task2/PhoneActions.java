package HomeWork6Task2;

public class PhoneActions {
    public static void main(String[] args) {
     Phone phone = new Phone();
        System.out.println("Phone number: " + phone.number);
        System.out.println("Phone model: " + phone.model);
        System.out.println("Phone weight: " + phone.weight);

        Phone phone1 = new Phone();
        phone.receiveCall("Nick");
        phone.getNumber(332221144);

        Phone phone2 = new Phone();
        phone.receiveCall("Mike", 336666666);

        Phone phone3 = new Phone();
        phone.sendMessage(331113355, 296666666);

    }
}
