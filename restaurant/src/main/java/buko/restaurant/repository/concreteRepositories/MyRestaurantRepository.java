package buko.restaurant.repository.concreteRepositories;

import buko.restaurant.entity.abstractEntities.Entity;
import buko.restaurant.entity.concreteEntities.Restaurant;
import buko.restaurant.repository.repositoryInterfaces.RestaurantRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MyRestaurantRepository implements RestaurantRepository<Restaurant, String> {

    private Map<String, Restaurant> entities;

    public MyRestaurantRepository() {
        this.entities = new HashMap<>();
    }

    @Override
    public boolean containsName(String name) {
        return entities.containsKey(name);
    }

    @Override
    public void add(Restaurant entity) {
        entities.put(entity.getName(), entity);
    }

    @Override
    public void remove(String id) {
        if (entities.containsKey(id)) {
            entities.remove(id);
        }
    }

    @Override
    public void update(Restaurant entity) {
        if (entities.containsKey(entity.getName())) {
            entities.put(entity.getName(), entity);
        }
    }

    @Override
    public boolean contains(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entity get(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Restaurant> getAll() {
        return entities.values();
    }
}
