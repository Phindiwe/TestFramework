package za.ac.cput;
/*Author: Phindiwe Bambata 217180833
 * 10/05/2021
 *This class test Collections
 */

import java.util.Objects;

public class Collection {
    private String name,gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Collection)) return false;
        Collection that = (Collection) o;
        return getAge() == that.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }
}


