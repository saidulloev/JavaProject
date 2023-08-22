package Collection.set;

import java.util.Objects;

public class Cars implements Comparable<Cars> {
    private final String carBrand;
    private final String model;
    private final int pricePerDay;

    public String getCarBrand() {
        return carBrand;
    }

    public String getModel() {
        return model;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public Cars(String carBrand, String model, int pricePerDay) {
        this.carBrand = carBrand;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return pricePerDay == cars.pricePerDay &&
                Objects.equals(carBrand, cars.carBrand) &&
                Objects.equals(model, cars.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, model, pricePerDay);
    }

    @Override
    public String toString() {
        return carBrand + " " + model + " " + pricePerDay;
    }

    @Override
    public int compareTo(Cars car) {

        if (pricePerDay < car.getPricePerDay()) {
            return -1;
        }
        if (pricePerDay > car.getPricePerDay()) {
            return 1;
        }
        return 0;
    }
}
