//MainApp Class
public class MainApp {
    public static void main(String[] args) {
        Activities test1 = new Activities(); //New container class instance

        test1.add(new Activity());
        test1.add(new Activity("Swimming", 1, "03/11/2023", 50, 97));

        System.out.println(test1.toString());
        test1.sortByCaloriesBurnedDescending();
        System.out.println(test1.toString());
    }
}