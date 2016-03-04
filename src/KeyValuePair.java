public class KeyValuePair<T>{
    private T value;
    private T key;
    private boolean isCollision;

    public KeyValuePair(T key, T value) {
        this.value = value;
        this.key = key;
        this.isCollision = false;
    }

    public T getValue() {
        return value;
    }

    public T getKey() {
        return key;
    }

    public boolean isCollision() {
        return isCollision;
    }

    public void setCollision(boolean collision) {
        isCollision = collision;
    }
}
