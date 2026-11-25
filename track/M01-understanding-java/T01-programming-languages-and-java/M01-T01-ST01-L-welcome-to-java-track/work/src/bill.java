public class bill {
    public static void main(String[] args) {
        String customerName = "Rahul";
        int units = 350;

        // 1. Validate units at the very beginning
        if (units < 0) {
            System.out.println("Invalid units");
            return; // Stop the program here if units are negative
        }

        // 2. Use double for currency values and initialize to 0
        double baseBill = 0;
        double surcharge = 0;
        double finalBill = 0;

        // 3. Calculate base electricity bill
        if (units <= 100) {
            baseBill = units * 2;
        } else if (units <= 200) {
            baseBill = units * 3;
        } else if (units <= 300) {
            baseBill = units * 5;
        } else {
            baseBill = units * 7;
        }

        // 4. Calculate surcharge and final bill
        if (baseBill > 1000) {
            System.out.println("5% surcharge is applied");
            surcharge = baseBill * 0.05;
        } else {
            System.out.println("No surcharge applied");
        }

        finalBill = baseBill + surcharge;

        // 5. Print the final summary
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: " + baseBill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total Bill: " + finalBill);
    }
}
