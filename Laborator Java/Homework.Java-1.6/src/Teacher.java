class Teacher extends Person {
    private String specialisation;
    Teacher(String name, Address address, String specialisation) {
        super(name, address);
        this.specialisation = specialisation;
    }
    public void changeTeacherAddress(Address address) {

        super.changeAddress(address);
    }

}
