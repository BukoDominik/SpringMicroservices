package buko.restaurant.repository.repositoryInterfaces;

public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {

    boolean containsName(String name);
}
