package mousedriver2;

import java.util.Scanner;

public class MouseDriver2 {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        double growthRate;
        Mouse gus, jaq;
        System.out.print("Enter % growth rate: ");
        growthRate = computerKeyboardInput.nextDouble();
        gus = new Mouse();
        gus.setPercentGrowthRate(growthRate);
        gus.grow();
        gus.display();
        jaq = new Mouse();
        jaq.grow();
        jaq.display();
    }
}