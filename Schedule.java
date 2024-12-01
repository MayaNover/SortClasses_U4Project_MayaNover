import java.util.*;
public class Schedule {
    //makes a class object
    public static String createClass(String pdNum, String className){
        return className + " Period: " + pdNum;
    }




    // Method to sort classes into the correct periods
    public static List<String> sortClasses(List<String> classNames, int Pds) {
        List<String> pds = new ArrayList<>(Collections.nCopies(Pds, ""));
        for (int i = 0; i < Pds; i++) {
            String classi = classNames.get(i);
            for (int period = 1; period <= 10; period++) {
                if (classi.contains(String.valueOf(period))) {
                    pds.set(period - 1, createClass(String.valueOf(period), classi));
                    break;
                }
            }
        }
        return pds;
    }


    //finds the actual class period of your favorite class
    public static int findFav(List<String> classNames, String favClass, int Pds){
        int corPd = 0;
        for (int i = 0; i < classNames.size(); i++){
            String classi = classNames.get(i);
            if (classi.contains(favClass)){
                corPd = i + 1;
            }
        }
        return corPd;
    }


    //just to get that void in there
    public static void newLine() {
        System.out.println();
    }
}
