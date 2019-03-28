package edu.unit.vtymchen.avaj;

public class Coordinates {

    private int longitude;
    private int latitude;
    private int height;
    
    Coordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }
    
    public int getLongitude() {
        return this.longitude;
    }
    
    public int getLatitude() {
        return this.latitude;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public void setLongitude(int l) {
        this.longitude = l;
    }
    
    public void setLatitude(int l) {
        this.latitude = l;
    }
    
    public void setHeight(int h) {
        this.height = h;
        if (this.height > 100) {
            this.height = 100;
        }
        if (this.height < 0) {
            this.height = 0;
        }
    }
}
