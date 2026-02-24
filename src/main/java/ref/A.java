package ref;

public class A {
    private int x;
    private B ob;

    public A(){

    }

    public B getOb() {
        return ob;
    }

    public A(B ob, int x) {
        this.ob = ob;
        this.x = x;
    }

    @Override
    public String toString() {
        return "A{" +
                "ob=" + ob +
                ", x=" + x +
                '}';
    }

    public void setOb(B ob) {
        this.ob = ob;

    }
}
