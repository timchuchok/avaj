package edu.unit.vtymchen.avaj;
import edu.unit.vtymchen.avaj.WeatherTower;


interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower tower);
}
