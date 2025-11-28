import java.util.*;

    class Patient{
        String patientName;
        String condition;
        String admitDate;
    public Patient(String patientName, String condition, String admitDate){
        this.patientName=patientName;
        this.condition=condition;
        this.admitDate=admitDate;
    }

    }

class Doctor{
     String doctorName;
     String specialist;
    public Doctor(String doctorName, String specialist){
        this.doctorName=doctorName;
        this.specialist=specialist;

    }


}
class Nurse{
        String nurseName;
        String nurseShift;

        public Nurse(String nurseName, String nurseShift){
            this.nurseName=nurseName;
            this.nurseShift=nurseShift;
        }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            ArrayList<Patient> patients= new ArrayList<>();
            ArrayList<Doctor> doctors=new ArrayList<>();
            ArrayList<Nurse> nurses=new ArrayList<>();

        System.out.println("\n Welcome To Hospital Management");
        System.out.println("Enter id : ");
        String id = sc.nextLine();
        String id2 = "Vellu";


        if (id.equals(id2)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }

            while (true) {
                System.out.println("-------------Menu----------------");
                System.out.println("1. Add Patient Details");
                System.out.println("2. Doctor Details");
                System.out.println("3. Nurse Details");
                System.out.println("4. View Patient table ");
                System.out.println("5. View Doctor table ");
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

                        patients.add(new Patient(name, cat, tim));

                        System.out.println("________________Patient added Successfully!_______________");

                        break;
                    case 2:
                        System.out.println("Enter Doctor Name ");
                        String nam = sc.nextLine();
                        System.out.println("Specialist  ");
                        String spec = sc.nextLine();

                        doctors.add(new Doctor(nam,spec));

                        break;

                    case 3:
                        System.out.println("Enter Nurse Name : ");
                        String nur = sc.nextLine();
                        System.out.println("Enter Shift Type : ");
                        String shift = sc.nextLine();

                       nurses.add(new Nurse(nur,shift));
                        break;

                    case 4:

                        System.out.println("\n--------------------------------------------------------------------");
                        System.out.printf("| %-10s | %-20s | %-20s |", "Patient Name", "Condition","Admit Date");
                        System.out.println("\n--------------------------------------------------------------------");

                        for(Patient p: patients) {
                            System.out.printf("|%-13s | %-20s | %-20s |\n",  p.patientName, p.condition, p.admitDate);

                        }
                        System.out.println("----------------------------------------------------------------------");
                        break;

                    case 5:
                        System.out.println("\n_____________________________________________________________________");
                        System.out.printf("| %-10s | %-20s | %-20s |", "Doctor Name", "Specification");
                        System.out.println("\n_____________________________________________________________________");

                        for(Doctor d: doctors){
                            System.out.printf("|%-13s | %-20s |\n", d.doctorName, d.specialist);
                        }
                    default:
                        System.out.println("_______Please Enter Valid Choice_______");
                        break;
                }
            }
        }
    }