package aplication;

import model.Activity;
import model.ActivityRecord;
import utils.FileImport;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bruno.devesa on 20/10/2015.
 */
public class ActivityController {

    ActivityRecord activityRecord;
    FileImport fileImport;
    String path;

    public ActivityController(String path) {
        fileImport = new FileImport();
        this.activityRecord = new ActivityRecord();
        this.path = path;
    }

    public ArrayList<ArrayList<String>> ImportData (String path) throws FileNotFoundException {
        ArrayList<ArrayList<String>> data = fileImport.importDataFromFile(path);
        splitActivities(data);
        return data;
    }


    public void splitActivities ( ArrayList<ArrayList<String>> data ){
        activityRecord.splitActivities(data);

    }

    public HashMap<String, Activity> getMap(){
        return activityRecord.getMap();
    }

}
