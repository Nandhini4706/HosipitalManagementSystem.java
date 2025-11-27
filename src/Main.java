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

            ArrayList<String> patientName= new ArrayList<>();
            ArrayList<String> patientCondition=new ArrayList<>();
            ArrayList<String> date=new ArrayList<>();
        ArrayList<String> docName=new ArrayList<>();
        ArrayList<String> doctorSpecs=new ArrayList<>();
        ArrayList<String> nurseName=new ArrayList<>();
        ArrayList<String> nurseShift=new ArrayList<>();
            while (true) {
                System.out.println("-------------Menu----------------");
                System.out.println("1. Add Patient Details");
                System.out.println("2. Doctor Details");
                System.out.println("3. Nurse Details");
                System.out.println("4. View table ");
                System.out.println("Enter Your Choice : ");
                int n = sc.nextInt();
                sc.nextLine();

                switch (n) {
                    case 1:
                        System.out.println("Enter Patient Name ");
                        String name=sc.nextLine();

                        System.out.println("Condition :");
                        String cat = sc.nextLine();
                        System.out.println("Enter Date Of Admit :");
                        String tim=sc.nextLine();

                        patientName.add(name);
                        patientCondition.add(cat);
                        date.add(tim);

                        break;
                    case 2:
                        System.out.println("Enter Doctor Name ");
                        String nam = sc.nextLine();
                        System.out.println("Specialist  ");
                        String spec = sc.nextLine();

                        docName.add(nam);
                        doctorSpecs.add(spec);
                        break;

                    case 3:
                        System.out.println("Enter Nurse Name : ");
                        String nur = sc.nextLine();
                        System.out.println("Enter Shift Type : ");
                        String shift = sc.nextLine();

                        nurseName.add(nur);
                        nurseShift.add(shift);
                        break;

                    case 4:
                        System.out.println("\n--------------------------------------------------------------------");
                        System.out.printf("| %-10s | %-15s | %-12s |", "Patient Name", "Condition","Admit Date");
                        System.out.println("\n--------------------------------------------------------------------");

                        for(int i=0; i<patientName.size(); i++){
                            System.out.printf("|%-10s | %-15s | %-12s |\n", patientName.get(i), patientCondition.get(i), date.get(i));

                        }
                        System.out.println("----------------------------------------------------------------------");
                        break;

                }
            }
        }
    }