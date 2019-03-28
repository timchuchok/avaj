package edu.unit.vtymchen.avaj;
import edu.unit.vtymchen.avaj.Tower;
import edu.unit.vtymchen.avaj.Coordinates;
import edu.unit.vtymchen.avaj.weather.WeatherProvider;

class WeatherTower extends Tower {
    
    public String getWeather(Coordinates coordinates) {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }
    
    void changeWeater() {
        super.conditionChanged();
    }
}
