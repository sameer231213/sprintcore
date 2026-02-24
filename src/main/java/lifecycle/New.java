package lifecycle;

public class New {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public New() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "New [price=" + price + "]";
    }
    public void hey(){
        System.out.println("Inside init method:Hey how are you?");
    }
    public void bye(){
        System.out.println("Inside destroy method:Bye i am going to die.");
    }

}
