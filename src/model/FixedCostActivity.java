package model;

import java.util.ArrayList;

/**
 * Created by bruno.devesa on 19/10/2015.
 */
public class FixedCostActivity extends Activity {

    float cost;

    public FixedCostActivity(String key, ActivityType type, String description, float duration, TimeUnit time_unit, float cost, ArrayList<String> preceding_activities) {
        super(key, type, description, duration, time_unit, preceding_activities);
        this.cost = cost;
    }


    public String toString(){
        return super.toString()+"Cost: " + cost + "\n";
    }


}
