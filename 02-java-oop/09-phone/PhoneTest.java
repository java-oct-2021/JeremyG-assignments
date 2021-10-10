public class PhoneTest {
    
    public static void main(String[] args) {
        IPhone iphone13 = new IPhone("13", 100, "Verizon", "Ring, Ring!");
        Galaxy Note20 = new Galaxy("Note 20", 21, "T-Mobile", "Bing!");

        iphone13.displayInfo();
        System.out.println(iphone13.ring());
        System.out.println(iphone13.unlock());

        Note20.displayInfo();
        System.out.println(Note20.ring());
        System.out.println(Note20.unlock());
    }
}
