package model;

import util.InputReader;
import java.time.LocalTime;

public class Cafeteria {
    private final InputReader inputReader = InputReader.instance;
    public final LocalTime startTime = LocalTime.of(9,0);
    public final LocalTime endTime = LocalTime.of(18,0);
    private boolean isActive = true;
    public void setActive(boolean active) { isActive = active; }
    public boolean isActive() { return isActive; }
    public boolean checkStatus(){ return LocalTime.now().isBefore(endTime) && LocalTime.now().isAfter(startTime) && isActive; }
    public void showWorkTime(){ System.out.println("Cafeteria work time: " + startTime.toString() + "-" + endTime.toString()); }
}