package lesson12;

public class DesktopLight implements UsPowerPlug {
    private String brand;
    private String model;
    private int price;

    public DesktopLight(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DesktopLight{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void keepUsPlugSize() {
        System.out.println("I keep lug sizes");
    }

    @Override
    public void keepUsPlugMaterials() {
        System.out.println("I use proper materials");

    }
}
