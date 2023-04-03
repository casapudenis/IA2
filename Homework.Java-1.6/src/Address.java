class Address {
    private String street;
    private String city;
    private int street_number;
    Address(String city, String street, int street_number) {
        this.city = city;
        this.street = street;
        this.street_number = street_number;
    }

    public void print()
    {
        System.out.print("Address: ");
        System.out.println(city+", "+street+" "+street_number);
    }
}
