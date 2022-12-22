package ResidencePlace;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(8013);
        address.setCountry("Spain");
        address.setCity("Barcelona");
        address.setStreet("De Mallorca");
        address.setHouse(406);
        address.setApartment(1);
        System.out.println("Index:     " + address.getIndex() +
                           "\nCountry:   " + address.getCountry() +
                           "\nCity:      " + address.getCity() +
                           "\nStreet:    " + address.getStreet() +
                           "\nHouse:     " + address.getHouse() +
                           "\nApartment: " + address.getApartment());
    }
}
