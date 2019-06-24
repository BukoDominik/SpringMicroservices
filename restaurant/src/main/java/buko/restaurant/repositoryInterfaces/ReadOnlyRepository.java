package buko.restaurant.repositoryInterfaces;

import buko.restaurant.abstractEntities.Entity;

import java.util.Collection;

public interface ReadOnlyRepository<TE, T> {

    boolean contains(T id);

    Entity get(T id);

    Collection<TE> getAll();
}
