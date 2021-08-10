public class MainInvoker {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.invoke("PrintName");
        invoker.invoke("PrintRandom");
    }
}
