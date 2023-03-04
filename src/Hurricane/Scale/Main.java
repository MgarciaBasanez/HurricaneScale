package Hurricane.Scale;
import java.util.*;

// Megan Garcia-Basanez, 1/25/2023, Hurricane Wind Scale

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // establish variables
        long speed;
        String classification = "";

        // get speed input
        System.out.print("Enter wind speed (mph): ");
        speed = input.nextLong();

        // Identify if input is invalid
        while (speed < 0){
            System.out.print("The wind speed is invalid\n\nPlease enter wind speed (mph): ");
            speed = input.nextLong();
        }
        // Identify what category the hurricane is
        if (speed <= 38){
            classification = "Not in scale";
        }else if (speed <= 73){
            classification = "Tropical Storm";
        }else if (speed <= 95){
            classification = "Category One Hurricane";
        }else if (speed <= 110){
            classification = "Category Two Hurricane";
        }else if (speed <= 129){
            classification = "Category Three Hurricane";
        } else if (speed <= 156) {
            classification = "Category Four Hurricane";
        }else if (speed >= 157){
            classification = "Category Five Hurricane";
        }
        // Output the classification
        System.out.println ("Classification: " + classification);

    }
}