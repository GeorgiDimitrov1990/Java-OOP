public class StaticBolck {

    static {
        System.out.println("From static block1");
    }
    static {
        System.out.println("From static block2");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
    static {
        System.out.println("After main but in the file");
    }

}
