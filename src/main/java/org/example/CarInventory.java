package org.example; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInventory {

    private Map<String, Car> cars;

    public CarInventory() {
        this.cars = new HashMap<>();
    }

    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null.");
        }
        if (cars.containsKey(car.getModel())) {
            throw new IllegalArgumentException("Car with this model already exists.");
        }
        cars.put(car.getModel(), car);
    }

    public Car getCar(String model) {
      return cars.get(model);
    }

    public Car sellCar(String model) {
        return cars.remove(model);
    }

    public void updateCarPrice(String model, double newPrice) {
      Car car = cars.get(model);
        if (car != null) {
            car.setPrice(newPrice);
        }
    }

    public List<Car> findCarsByMake(String make) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getMake().equals(make)) {
                result.add(car);
            }
        }
        return result;
    }

    public int getCarCount() {
        return cars.size();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}