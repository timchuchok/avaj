package edu.unit.vtymchen.avaj;
import edu.unit.vtymchen.avaj.weather.WeatherProvider;
import edu.unit.vtymchen.avaj.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException, NumberFormatException {
        
        if (args.length != 1) {
            throw new IOException("need 1 argument");
        }
        
        WeatherTower weatherTower = new WeatherTower();
        
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String s = null;
        
        try {
            int n = Integer.parseInt(br.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Error in first line");
            return;
        }
        
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        
    }
}
