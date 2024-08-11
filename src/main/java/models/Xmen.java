package models;

public class Xmen {
    private String id;
    private String name;
    private String currentLocation;
    private int health;

    public Xmen(String id, String name, String currentLocation, int health) {
        this.id = id;
        this.name = name;
        this.currentLocation = currentLocation;
        this.health = health;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
}
