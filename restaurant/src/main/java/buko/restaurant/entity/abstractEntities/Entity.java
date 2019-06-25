package buko.restaurant.entity.abstractEntities;

public abstract class Entity<T> {
    protected String name;
    protected T id;

    public Entity(String name, T id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
