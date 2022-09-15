package web.Model;

public class Car {
    private String model;
    private int price;
    private String condition;



    public Car(String model, int price, String condition) {
        this.model = model;
        this.price = price;
        this.condition = condition;
    }


    public Car() {
    }

    @Override
    public String toString() {
        return "Car: " +
                "model = '" + model + '\'' +
                ", price = " + price +
                ", condition = '" + condition + '\'';
    }
}
