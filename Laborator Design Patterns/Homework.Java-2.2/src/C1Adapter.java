public class C1Adapter extends C1 {
    public C1Adapter(C2 c2Instance) {
        super((int) c2Instance.getN1(), (int) c2Instance.getN2());
    }
}