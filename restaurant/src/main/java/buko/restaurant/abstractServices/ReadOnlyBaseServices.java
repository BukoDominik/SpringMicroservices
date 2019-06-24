package buko.restaurant.abstractServices;

import buko.restaurant.repositoryInterfaces.Repository;

public abstract class ReadOnlyBaseServices<TE, T> {
    private final Repository<TE, T> repository;

    public ReadOnlyBaseServices(Repository<TE, T> repository) {
        this.repository = repository;
    }
}
