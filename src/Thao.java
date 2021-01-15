public class Thao extends Person{
    private double rice;

    public double getRice() {
        return rice;
    }

    public void setRice(double rice) {
        this.rice = rice;
    }

    @Override
    public void information() {
        System.out.println("Class sub");
    }
}
