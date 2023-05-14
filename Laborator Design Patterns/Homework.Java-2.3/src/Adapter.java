public class Adapter extends C2Nr{
    public Adapter(int number1, int number2) {
        super(number1,number2);
    }
    @Override
    public int getSum() {
        C3Nr c3 = new C3Nr(getNumber1(), getNumber2(), 0);
        return c3.getSum();
    }
}

