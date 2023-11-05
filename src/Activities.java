import java.util.ArrayList;
import java.util.Collections;
//Activities Container Class
public class Activities {
    ArrayList<Activity> activityList; //ArrayList field called activityList - Darren
    public Activities(){ this.activityList = new ArrayList<>(); } //Sets this activityList field to a new ArrayList



    //Adds object to activityList method - Darren
    public void add(Activity act){
        activityList.add(act);
    }
    //Sort method - Darren
    public void sort(){
        Collections.sort(activityList); //Sorts by natural ordering - Darren
    }
    public void sortByCaloriesBurnedDescending(){
        Collections.sort(activityList, new CaloriesBurnedDescendingComparator());
    }
}
