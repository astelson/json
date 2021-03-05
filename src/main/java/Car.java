public class Car {
    private String model;
    private String color;
    private boolean isAutomatic;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String model, String color, boolean isAutomatic, int price) {
        this.model = model;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.price = price;
    }
}
