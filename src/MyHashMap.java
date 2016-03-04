import java.util.LinkedList;

class MyhashMap<K, V> {
    private int size;
    private LinkedList<Object> key;
    private LinkedList<Object> value;
    private KeyValuePair[] keyValuePairs;
    public int pointer = 0;
    int collisionCount;

    public MyhashMap(int size) {
        this.key  = new LinkedList<>();
        this.value  = new LinkedList<>();
        this.size = (size - 1);
        this.keyValuePairs = new KeyValuePair[size];
        this.collisionCount = 0;
    }

    public void put(Object key, Object value) {
        int hash = Math.abs(key.hashCode() % this.size);
        if(keyValuePairs[hash] == null){
            keyValuePairs[hash] = new KeyValuePair(key, value);
        }else if(keyValuePairs[hash].getKey().equals(key)){
            KeyValuePair node = new KeyValuePair(key, value);
            if(keyValuePairs[hash].isCollision()){
                node.setCollision(true);
            }
            keyValuePairs[hash] = node;
        }else {
            if (this.key.indexOf(key) != -1) {
                int index = this.key.indexOf(key);
                this.key.add(index, key);
                this.value.add(index, value);
            } else {
                this.collisionCount++;
                keyValuePairs[hash].setCollision(true);
                this.key.add(key);
                this.value.add(value);
                this.pointer++;
            }
        }
    }

    public Object get(Object key) {
        int hashOfKey = Math.abs(key.hashCode() % this.size);
        if(!keyValuePairs[hashOfKey].isCollision()) {
            return this.keyValuePairs[hashOfKey].getValue();
        }
        if(keyValuePairs[hashOfKey].getKey().equals(key)){
            return this.keyValuePairs[hashOfKey].getValue();
        }
        int index = this.key.indexOf(key);
        return this.value.get(index);
    }
}
