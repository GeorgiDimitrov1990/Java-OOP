public class AddressMain {
    public static void main(String[] args) {
        Address address = new Address();

        /*address.setAddressLine1("address1")
                .setAddressLine2("address2")
                .setCity("city")
                .setCountry("country")
                .setEmail("email");*/
        Address address1 = new AddressBuilder()
                .withEmail("email")
                .withName("name")
                .build();


    }
}
