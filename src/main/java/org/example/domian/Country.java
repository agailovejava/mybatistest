package org.example.domian;

import java.util.List;

/**国家类*/
public class Country {
    private int id;
    private String name;
    private List<Minister> ministerSet;


    public Country() {
    }

    public Country(int id, String name, List<Minister> ministerSet) {
        this.id = id;
        this.name = name;
        this.ministerSet = ministerSet;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ministerSet=" + ministerSet +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Minister> getMinisterSet() {
        return ministerSet;
    }

    public void setMinisterSet(List<Minister> ministerSet) {
        this.ministerSet = ministerSet;
    }
}
