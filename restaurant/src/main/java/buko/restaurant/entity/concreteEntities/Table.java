package buko.restaurant.entity.concreteEntities;

import buko.restaurant.entity.abstractEntities.BaseEntity;

import java.math.BigInteger;

public class Table extends BaseEntity<BigInteger> {

    private int capacity;

    public Table(String name, BigInteger id, int capacity) {
        super(name, id);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
