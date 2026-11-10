


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
class Workout{
    String type;
    int duration;
    void showWorkout(){
        System.out.println( "Workout: " + type);
        System.out.println("Minutes: " + duration + " minutes");
    }
}
class RunningWorkout extends Workout{
    double distance;
    void showDetails(){
        System.out.println("Distance: " + distance + " (km) ");
        System.out.println("Calories burned: " + distance * 60);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RunningWorkout w = new RunningWorkout();
        System.out.println("Enter workout type: ");
        w.type = input.nextLine();

        System.out.println("Enter duration (minutes): ");
        w.duration = input.nextInt();

        System.out.println("Enter distance (km): ");
        w.distance = input.nextDouble();

        System.out.println("------- Workout Summary --------");
        w.showWorkout();
        w.showDetails();



    }
}