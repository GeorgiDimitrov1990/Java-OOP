public class Facade {
    private PaymentAPI paymentAPI;

    public Facade(){
        this.paymentAPI = new PaymentAPI();
    }

    public void paySubscription(){
        paymentAPI.executePayment();
    }

    public void loadPayment(){
        paymentAPI.loadPayment();
    }
}
