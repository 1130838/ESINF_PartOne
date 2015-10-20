package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bruno.devesa on 20/10/2015.
 */
public class ActivityRecord {

    private final HashMap<String, Activity> map;

    public ActivityRecord() {
        this.map = new HashMap<>();
    }

    public HashMap getMap(){
        return this.map;
    }


    public Activity addActivity(Activity activity) {
        return this.map.put(activity.getKey(), activity);
    }

    public void newActivity(ArrayList<String> activity) {

        // update to Strategy pattern

        if (ActivityType.valueOf(activity.get(1)) == ActivityType.FCA) {

            ArrayList<String> precedingActivities = new ArrayList<>();
            for (int i = 6; i < activity.size(); i++) {
                precedingActivities.add(activity.get(i));
            }


            FixedCostActivity newActivity = new FixedCostActivity(
                   activity.get(0),
                    ActivityType.valueOf(activity.get(1)),
                    activity.get(2),
                    Float.parseFloat(activity.get(3)),
                    TimeUnit.valueOf(activity.get(4)),
                    Float.parseFloat(activity.get((5))),
                    precedingActivities
            );

                    addActivity(newActivity);

        } else if (ActivityType.valueOf(activity.get(1)) == ActivityType.VCA) {

            ArrayList<String> precedingActivities = new ArrayList<>();
            for (int i = 6; i < activity.size(); i++) {
                precedingActivities.add(activity.get(i));
            }

            VariableCostActivity newActivity = new VariableCostActivity(
                    activity.get(0),
                    ActivityType.valueOf(activity.get(1)), activity.get(2), Float.parseFloat(activity.get(3)),
                    TimeUnit.valueOf(activity.get(4)),
                    Float.parseFloat(activity.get(5)),
                    Float.parseFloat(activity.get(6)),
                    precedingActivities
            );

            addActivity(newActivity);
        }
    }


    public ArrayList<String> splitActivities (ArrayList<ArrayList<String>> dataFromFile){
        ArrayList<String> activityList = new ArrayList<>();
        for (int i = 0; i < dataFromFile.size(); i++) {
            newActivity(dataFromFile.get(i));

        }

        return activityList;
    }


}
