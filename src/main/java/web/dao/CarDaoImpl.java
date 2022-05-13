package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> createList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Hyundai", "Tucson", "Black"));
        list.add(new Car("Mazda", "6", "White"));
        list.add(new Car("Lexus", "RX450", "Blue"));
        list.add(new Car("Suzuki", "Jimny", "Pink"));
        list.add(new Car("Hyundai", "Sonata", "Red"));
        return list;
    }
}
