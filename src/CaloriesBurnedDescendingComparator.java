import java.util.Comparator;
public class CaloriesBurnedDescendingComparator implements Comparator<Activity>{
    @Override
    public int compare(Activity act1, Activity act2){
        float num1 = act1.getCaloriesBurned();
        float num2 = act2.getCaloriesBurned();
        if (num1 < num2) return 1;
        if (num1 > num2) return -1;
        return 0;
    }
}
