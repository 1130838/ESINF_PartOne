package presentation;

import aplication.ActivityController;
import model.Activity;

import javax.management.Attribute;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;
import java.util.Enumeration;


/**
 * Created by bruno.devesa on 20/10/2015.
 */
public class MainUI {

    public void run() throws FileNotFoundException {

        System.out.println("ESINF - Part One");
        String path = "C:\\Users\\bruno.devesa\\IdeaProjects\\ESINF_Projects\\ESINF_PartOne\\src\\tests\\import-test";
        //String path =  Console.readLine("enter the path:");
        ActivityController activityController = new ActivityController(path);

        ArrayList<ArrayList<String>> data = activityController.ImportData(path);

        printData(data);

        HashMap<String, Activity> hashMap = activityController.getMap();

       // HashMap<String, Activity> hashMap = activityController.getMap();

        printMap(hashMap);


    }

    public void printData(ArrayList data) {
        System.out.println("\ndata in the file:");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).toString());
        }
    }

    private void printMap(HashMap hashMap) {

        // DUVIDA: PERGUNTAR PROFESSOR COMO CONSIGO ITERAR SOBRE OS VALUES DE ACTIVITY

        System.out.println("\nmap of activities:");

        /* Display content using Iterator*/
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

      /* Get values based on key*/
        String var= (String) hashMap.get(1);
        System.out.println("Value at index 2 is: "+var);

    }
}
