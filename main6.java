
    //a java application-employee badge system which includes class,constructor fundamentals and string application for pattern
    //captures key details of employee like its identity and department association
    //evaluate badge code with its strctural integrity where badge should be considered when it has exactly 10 characters ,2 special charcters,and should provide a readable output where the badge should meet the require standarads and how many special character it contains
    //input  
    //Employee Detail
    //ID
    //Name
    //Department
    //Badge code
    

import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Badge Code: ");
        String badge = sc.nextLine();

        // Counter
        int specialCount = 1;
        String specialChars = "!@#$%^&*()_+-=[]{}|;:',.<>/?";

        for (int i = 0; i < badge.length(); i++) {
            char ch = badge.charAt(i);
            if (specialChars.indexOf(ch) != -1) {
                specialCount++;
            }
        }

       
        System.out.println("\nEmployee Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Badge Code: " + badge);

        if (badge.length() == 10 && specialCount >= 2) {
            System.out.println("Special Characters: " + specialCount);
        } else {
            System.out.println("Special Characters: -1");
        }

        sc.close();
        System.out.println("\n24DCS025 Gandhi Rucha\n");
    }
}
