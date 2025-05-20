import java.util.Scanner;

public class PaintCostCalc {
    public static void main(String[] args){
        double gal, costPaint, laborRate, totalCostLabor, totalCost, hours, wallSize, totalSize = 0.0, totalCostPaint, tax;
        int rooms;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.printf("Please enter values");

        System.out.printf("Labor cost(Per hour): ");
        laborRate = keyboard.nextDouble();
        while(laborRate < 7.5){
            System.out.printf("Invalid! -- enter value equal to or greater than minimum wage");
            laborRate = keyboard.nextDouble();
        }
        
        System.out.printf("Sales tax: ");
        tax = keyboard.nextDouble();
        while(tax < 0.0){
            System.out.printf("Invalid! -- enter non-negative tax rate: ");
            tax = keyboard.nextDouble();
        }

        System.out.printf("Number of rooms: ");
        rooms = keyboard.nextInt();
        while(rooms < 1){
            System.out.printf("Invalid! -- enter 1 or more rooms: ");
            rooms = keyboard.nextInt();
        }
        
        System.out.printf("Cost of paint: ");
        costPaint = keyboard.nextDouble();
        while(costPaint < 1.0){
            System.out.printf("Invalid! -- enter cost of at least $1: ");
            costPaint = keyboard.nextDouble();
        }
        
        for(int i = 1; i <= rooms; i++){
            System.out.printf("Size of room%d(square feet): ", i);
            wallSize = keyboard.nextDouble();
            while(wallSize < 0.0){
                System.out.printf("Invalid! -- enter positive wall size: ");
                wallSize = keyboard.nextDouble();
            }
            totalSize += wallSize;
        }
        
        gal = Math.ceil(totalSize / 110.00);
        hours = (gal * 8);
        totalCostPaint = (costPaint * gal);
        totalCostLabor = (hours * laborRate);
        totalCost = (totalCostPaint + totalCostLabor) * (1 + tax);

        System.out.printf("\nTotal square footage: %.2f sqft\n", totalSize);
        System.out.printf("Total gallons needed: %.2f\n", gal);
        System.out.printf("Total hours needed: %.2f\n", hours);
        System.out.printf("Total cost of paint(before tax): %.2f\n", totalCostPaint);
        System.out.printf("Total cost of labor(before tax): %.2f\n", totalCostLabor);
        System.out.printf("Total cost of services(after tax): %.2f\n", totalCost);
        
        keyboard.close();
    }
    
}
