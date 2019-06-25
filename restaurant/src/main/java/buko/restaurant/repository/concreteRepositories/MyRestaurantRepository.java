package buko.restaurant.repository.concreteRepositories;

import buko.restaurant.entity.abstractEntities.Entity;
import buko.restaurant.entity.concreteEntities.Restaurant;
import buko.restaurant.repository.repositoryInterfaces.RestaurantRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository("restaurantRepository")
public class MyRestaurantRepository implements RestaurantRepository<Restaurant, String> {

    private Map<String, Restaurant> entities;

    public MyRestaurantRepository() {
        this.entities = new HashMap<>();
        Restaurant restaurant = new Restaurant("Big-O Restaurant", "1", null,null);
        entities.put("1", restaurant);
        restaurant = new Restaurant("O Restaurant", "2", null,null);
        entities.put("2", restaurant);
    }

    @Override
    public boolean containsName(String name) {
        return entities.containsKey(name);
    }

    @Override
    public Collection<Restaurant> findByName(String name) throws Exception {
        Collection<Restaurant> restaurants = new ArrayList<>();
        int noOfChars = name.length();
        entities.forEach((k,v)-> {
            if (v.getName().toLowerCase().contains(name.subSequence(0, noOfChars))){
                restaurants.add(v);
            }
        });
        return restaurants;
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
        return entities.get(id);
    }

    @Override
    public Collection<Restaurant> getAll() {
        return entities.values();
    }
}
