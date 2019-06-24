package buko.restaurant.concreteEntities;

import buko.restaurant.abstracts.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends BaseEntity<String> {

    private List<Table> tables = new ArrayList<>();
    private String address;

    public Restaurant(String name, String id, List<Table> tables, String address) {
        super(name, id);
        this.tables = tables;
        this.address = address;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
