package buko.restaurant.repositoryInterfaces;

public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {

    boolean containsName(String name);
}
