public class Equation {

    private double x;
    public void solve(double a, double b)
    {

        try
        {
            if(a==0) {
                if (b == 0)
                    throw new InfinitSolutions("Equation has a infinite solutions");
                else {
                    throw new ImpossibleEquation("Equation do not have solutions");
                }
            }
            x = -b/a;

        }
        catch (InfinitSolutions e) {
            System.out.println(e.getMessage());
        }
         catch (ImpossibleEquation e) {
             System.out.println(e.getMessage());
        }
    }

    void result()
    {
        System.out.println(x);
    }

}
