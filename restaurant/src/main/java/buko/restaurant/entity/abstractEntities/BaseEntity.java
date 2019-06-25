package buko.restaurant.entity.abstractEntities;

public abstract class BaseEntity<T> extends Entity {

    private boolean isModified;

    public BaseEntity(String name, T id) {
        super(name, id);
        isModified=false;
    }
    public boolean isModified() {
        return isModified;
    }
}
