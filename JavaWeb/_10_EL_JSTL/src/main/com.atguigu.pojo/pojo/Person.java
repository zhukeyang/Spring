package pojo;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private String [] phones;
    private List<String> cities;
    private Map<String,Object> map;

    public String getName() {
        return name;
    }

    public String[] getPhones() {
        return phones;
    }

    public List<String> getCities() {
        return cities;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Person(String name, String[] phones, List<String> cities, Map<String, Object> map) {
        this.name = name;
        this.phones = phones;
        this.cities = cities;
        this.map = map;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", cities=" + cities +
                ", map=" + map +
                '}';
    }
}
