public class Division {
    private int x;
    private double result;
    void Div(double x) {
        int a;
        int b;
        a = 1;
        try {
            b = 10/a;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0.");
            b = 0;
            e.printStackTrace();
        }
        catch (Exception e) {
            b = -1;
            System.out.println("General Error!");
            e.printStackTrace();
        }
        System.out.print("b="+b);
    }
}
