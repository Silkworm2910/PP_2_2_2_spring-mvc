package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

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

    public static List<Car> createList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Hyundai", "Tucson", "Black"));
        list.add(new Car("Mazda", "6", "White"));
        list.add(new Car("Lexus", "RX450", "Blue"));
        list.add(new Car("Suzuki", "Jimny", "Pink"));
        list.add(new Car("Hyundai", "Sonata", "Red"));
        return list;
    }
}
