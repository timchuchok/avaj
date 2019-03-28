package edu.unit.vtymchen.avaj;

import edu.unit.vtymchen.avaj.Flyable;
import java.util.*;

class Tower {

    private ArrayList<Flyable> observers;
    
    public void registerFlayable(Flyable flyable) {
        observers.add(flyable);
    }
    
    public void unregisterFlayable(Flyable flyable) {
        observers.remove(observers.indexOf(flyable));
    }
    
    protected void conditionChanged() {
        for (Flyable f : observers) {
            f.updateConditions();
        }
    }
}
