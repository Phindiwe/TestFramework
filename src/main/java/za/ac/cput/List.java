package za.ac.cput;

import java.util.Objects;

/*Author: Phindiwe Bambata 217180833
 * 10/05/2021
 *This class test List
 */
public class List {
    private String firstName, lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof List)) return false;
        List list = (List) o;
        return getFirstName().equals(list.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName());
    }
}

