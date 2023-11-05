import java.util.ArrayList;
import java.util.Collections;
public class Activities {
    ArrayList<Activity> activityList; //ArrayList field called activityList - Darren
    public Activities(){ this.activityList = new ArrayList<>(); } //Sets this activityList field to a new ArrayList




    //Sort method
    public void sort(){
        Collections.sort(activityList); //Sorts by natural ordering - Darren
    }
}
