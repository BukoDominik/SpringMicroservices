package buko.restaurant.service.abstractServices;

import buko.restaurant.repository.repositoryInterfaces.Repository;

import java.util.Collection;

public abstract class BaseService<TE, T> extends ReadOnlyBaseServices<TE, T> {

    private Repository<TE, T> _repository;

    public BaseService(Repository<TE, T> repository) {
        super(repository);
        this._repository = repository;
    }

    public void add(TE entity) throws Exception {
        _repository.add(entity);
    }

    public Collection<TE> getAll() {
        return _repository.getAll();
    }
}
