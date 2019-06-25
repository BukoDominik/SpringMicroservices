package buko.restaurant.service.concreteServices;

import buko.restaurant.entity.abstractEntities.Entity;
import buko.restaurant.service.abstractServices.BaseService;
import buko.restaurant.entity.concreteEntities.Restaurant;
import buko.restaurant.repository.repositoryInterfaces.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
@Service("restaurantService")
public class RestaurantService extends BaseService<Restaurant, BigInteger> implements buko.restaurant.service.interfaceService.RestaurantService {

    private final RestaurantRepository<Restaurant, String> restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        super(restaurantRepository);
        this.restaurantRepository = restaurantRepository;
    }

    public void add(Restaurant restaurant) throws Exception {
        if (restaurantRepository.containsName(restaurant.getName())) {
            throw new Exception(String.format("There is already a product with the name - %s", restaurant.getName()));
        }

        if (restaurant.getName() == null || "".equals(restaurant.getName())) {
            throw new Exception("Restaurant name cannot be null or empty string.");
        }
        super.add(restaurant);
    }

    @Override
    public void update(Restaurant restaurant) throws Exception {
        restaurantRepository.update(restaurant);
    }

    @Override
    public void delete(String id) throws Exception {
        restaurantRepository.remove(id);
    }

    @Override
    public Entity findById(String restaurantId) throws Exception {
        return restaurantRepository.get(restaurantId);
    }

    @Override
    public Collection<Restaurant> findByName(String name) throws Exception {
        return restaurantRepository.findByName(name);
    }

    @Override
    public Collection<Restaurant> findByCriteria(Map<String, ArrayList<String>> name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Restaurant> getAll() {
        return super.getAll();
    }
}
