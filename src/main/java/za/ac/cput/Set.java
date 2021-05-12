package za.ac.cput;

import java.util.Objects;

/*Author: Phindiwe Bambata 217180833
 * 10/05/2021
 *This class test Set
 */
public class Set {
    private String carModel;
    private int carYear;


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Set)) return false;
        Set set = (Set) o;
        return getCarYear() == set.getCarYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarYear());
    }
}

