import java.util.Scanner;

public class PaintCostCalc {
    public static void mian(String[] args){
        double gal, costPaint, labor = 25.00, totalCost, hours, wallSize, totalSize = 0.0, totalCostPaint;
        int rooms;
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter values");
        System.out.printf("Number of rooms: ");
        rooms = keyboard.nextInt();
        while(rooms < 1){
            System.out.printf("Invalid! -- please enter 1 or more rooms");
            rooms = keyboard.nextInt();
        }
        System.out.printf("Cost of paint: ");
        costPaint = keyboard.nextDouble();
        while(costPaint < 10.00){
            System.out.printf("Invalid! -- enter 10 or more");
            costPaint = keyboard.nextDouble();
        }
        for(int i = 1; i < rooms; i++){
            System.out.printf("Size of rooms%d: ", i);
            wallSize = keyboard.nextDouble();
            while(wallSize < 0.0){
                System.out.printf("Invalid! -- enter value greater than 0");
                wallSize = keyboard.nextDouble();
            }
            totalSize += wallSize;
        }
        gal = (totalSize / 110.00);
        hours = (gal * 8);
        totalCostPaint = (costPaint * gal);
        System.out.printf("Total hours needed: %.2f", hours);
        System.out.printf("Total gallons needed: %.2f", gal);
        System.out.printf("Total cost of paint: %.2f", totalCostPaint);
        totalCost = (gal * labor);
        System.out.printf("Total cost of services: %.2f", totalCost);
        keyboard.close();
    }
    
}
