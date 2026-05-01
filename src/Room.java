package model;

public class Room {
    private byte capacity;
    private short number;
    private boolean busy;
    private String description;

    public byte getCapacity() {
        return capacity;
    }

    public void setCapacity(byte capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "capacity=" + capacity +
                ", number=" + number +
                ", busy=" + busy +
                ", description='" + description + '\'' +
                '}';
    }

    public short getNumber() {
        return number;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public boolean getBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
