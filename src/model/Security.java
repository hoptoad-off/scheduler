package model;

public class Security {
    private byte totalGuards;
    private short totalCameras;
    private String headName;
    private boolean electricityStatus;
    public boolean getElectricityStatus() { return electricityStatus; }
    public void setElectricityStatus(boolean electricityStatus) { this.electricityStatus = electricityStatus; }
}