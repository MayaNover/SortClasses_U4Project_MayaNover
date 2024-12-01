import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       //gets the number of periods
       Scanner Periods = new Scanner(System.in);
       System.out.println("Please enter your number of periods");
       int pds = Integer.parseInt(Periods.nextLine());


       //makes the list
       List<String> classNames = new ArrayList<>();
       int i;
       for(i=0; i<pds; i++) {
           Scanner input = new Scanner(System.in);
           System.out.println("Please enter a class and period");
           String className = input.nextLine();
           classNames.add(className);
       }
       List<String> sortedClasses = Schedule.sortClasses(classNames, classNames.size());




       // Print the sorted list of classes
       System.out.println("Sorted schedule:");
       for (String classInfo : sortedClasses) {
           System.out.println(classInfo);
       }




       //Lowkey this stuff is just to meet requirements but it basically fakes you out and then actually finds the period.
       Scanner fav = new Scanner(System.in);
       System.out.println("What is your favorite class?");
       String favClass = fav.nextLine();
       Scanner yOn = new Scanner(System.in);
       //The fakeout
       int ranNum =(int)(10*Math.random());
       System.out.println("Is your favorite class period " + ranNum);
       String siOno = yOn.nextLine();
       //real work
       if (siOno.equals("yes") && Schedule.findFav(sortedClasses,favClass,pds) != ranNum){
           System.out.println("Yayyyy");
       } else if (siOno.equals("no")) {
           System.out.println("Jk is this ur card (I mean your favorite class period)");
           Schedule.newLine();
           System.out.println("Period "+ Schedule.findFav(sortedClasses,favClass,pds));
       }
   }
}
