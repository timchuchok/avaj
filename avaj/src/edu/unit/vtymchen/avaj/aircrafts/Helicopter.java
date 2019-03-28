package edu.unit.vtymchen.avaj;
import edu.unit.vtymchen.avaj.weather.WeatherProvider;

class Helicopter extends Aircraft implements Flyable {

    private WeatherTower weatherTower;
    
    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }
    
    public void updateConditions() {
        switch (weatherTower.getWeather(coordinates)) {
            case "SUN":
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 10);
                this.coordinates.setHeight(this.coordinates.getHeight() + 2);
                break;
            case "RAIN":
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 5);
                break;
            case "FOG":
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 1);
                break;
            case "SNOW":
                this.coordinates.setHeight(this.coordinates.getHeight() - 7);
                break;
        }
    }
    
    public void registerTower(WeatherTower tower) {
        this.weatherTower = tower;
        this.weatherTower.registerFlayable(this);
    }
}
