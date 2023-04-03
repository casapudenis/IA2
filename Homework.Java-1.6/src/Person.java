class Person{
    protected String name;
    protected Address address;

    Person(String name,Address address) {
        this.name = name;
        this.address = address;
    }
    public void changeAddress(Address address) {
        this.address = address;
    }
    public void print()
    {
        System.out.print(name+" ");
        address.print();
    }

}
