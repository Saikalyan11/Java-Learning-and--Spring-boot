package Constructor;

public class constructor {
    String name;
    int id;
    String batch;
    String Interest;

    public constructor() {

    }

    public constructor(String name, int id, String batch, String Interest) {
        this.name = name;
        this.id = id;
        this.batch = batch;
        this.Interest = Interest;
    }

    public String toString() {
        return name + " : " +
                id + " : " + batch + " : "
                + Interest;
    }
}
