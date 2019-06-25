package buko.restaurant.repository.repositoryInterfaces;

import buko.restaurant.entity.abstractEntities.Entity;

import java.util.Collection;

public interface ReadOnlyRepository<TE, T> {

    boolean contains(T id);

    Entity get(T id);

    Collection<TE> getAll();
}
