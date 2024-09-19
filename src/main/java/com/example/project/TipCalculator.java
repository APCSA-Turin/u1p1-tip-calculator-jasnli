package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        // CALCULATIONS BELOW
        double tip = cost * (percent / 100.0); // TIP MULTIPLIED BY PERCENT AS A DECIMAL
        double bill = tip + cost; // TOTAL BILL IS TIP + COST
        double perPersonCostBefore = cost / people; // DIVIDE FOR EACH PERSON
        double tipPerPerson = tip / people; // SAME AS ABOVE
        double perPersonCostAfter = bill / people; // SAME AS ABOVE
        
        // ROUNDING
        // FOR ROUNDING LINK : https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        // MULTIPLY BY 100 TO GET ALL THE NUMBERS I WANT TO KEEP AS INTEGERS
        // +0.5 TO CHECK FOR ANY NUMBER ABOVE 5
        // CUT OFF THOSE EXTRA DECIMALS
        // DIVIDE BY 100 TO GET THE NUMBERS BACK TO DECIMALS
        perPersonCostAfter = (int) ((perPersonCostAfter * 100) + 0.5) / 100.0;
        perPersonCostBefore = (int) ((perPersonCostBefore * 100) + 0.5) / 100.0;
        bill = (int) ((bill * 100) + 0.5) / 100.0;   
        tip = (int) ((tip * 100) + 0.5) / 100.0;   
        tipPerPerson = (int) ((tipPerPerson * 100) + 0.5) / 100.0;


        result.append("-------------------------------\n");
        result.append("Total bill before tip: "); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("$" + cost + "\n"); // COST
        result.append("Total percentage: ");
        result.append("" + percent + "%\n"); // PERCENTAGE
        result.append("Total tip: ");
        result.append("$" + tip + "\n"); // TIP
        result.append("Total Bill with tip: ");
        result.append("$" + bill + "\n"); // TOTAL BILL
        result.append("Per person cost before tip: ");
        result.append("$" + perPersonCostBefore + "\n"); // PER PERSON (BEFORE TIP)
        result.append("Tip per person: ");
        result.append("$" + tipPerPerson + "\n"); // TIP EACH PERSON PAYS
        result.append("Total cost per person: ");
        result.append("$" + perPersonCostAfter + "\n"); // PER PERSON AFTER
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
