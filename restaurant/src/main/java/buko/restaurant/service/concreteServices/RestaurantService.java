package buko.restaurant.service.concreteServices;

import buko.restaurant.service.abstractServices.BaseService;
import buko.restaurant.entity.concreteEntities.Restaurant;
import buko.restaurant.repository.repositoryInterfaces.RestaurantRepository;

import java.math.BigInteger;
import java.util.Collection;

public class RestaurantService extends BaseService<Restaurant, BigInteger> {

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
    public Collection<Restaurant> getAll() {
        return super.getAll();
    }
}
