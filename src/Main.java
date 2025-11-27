import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("\n Welcome To Hospital Management");
        System.out.println("Enter id : ");
        String id = sc.nextLine();
        String id2 = "Vellu";

        if (id.equals(id2)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }

        while(true) {
            System.out.println("-------------Menu----------------");
            System.out.println("1. Add Patient Details");
            System.out.println("2. Doctor Details");
            System.out.println("3. Nurse Details");
            System.out.println("Exit");
            System.out.println("Enter Your Choice : ");
            int n=sc.nextInt();
            sc.nextLine();

            switch(n){
                case 1:
                    System.out.println("Enter Patient Name ");
                    String name=sc.nextLine();
                    System.out.println("Condition :");
                    String cat=sc.nextLine();

                    break;
                case 2:
                    System.out.println("Enter Doctor Name ");
                    String name=sc.nextLine();
                    break;
            }
        }
    }
}