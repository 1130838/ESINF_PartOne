package model;

import java.util.ArrayList;

/**
 * Created by bruno.devesa on 19/10/2015.
 */
public class VariableCostActivity extends Activity{

    private float cost_time;
    private float total_time;



    public VariableCostActivity(String key, ActivityType type, String description, float duration, TimeUnit time_unit, float cost_time, float total_time, ArrayList<String> preceding_activities) {
        super(key, type, description, duration, time_unit, preceding_activities);
        this.cost_time=cost_time;
        this.total_time=total_time;
    }


}