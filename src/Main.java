import java.util.*;

    class Patient{
        private String patientName;
        private String condition;
        private String admitDate;
    public Patient(String patientName, String condition, String admitDate){
        this.patientName=patientName;
        this.condition=condition;
        this.admitDate=admitDate;
    }
       public String getPatientName(){
        return patientName;
       }
       public String getCondition(){
        return condition;
       }
       public String getAdmitDate(){
        return admitDate;
       }
    }

class Doctors{
    private String doctorName;
    private String specialist;
    public Doctors(String doctorName, String specialist){
        this.doctorName=doctorName;
        this.specialist=specialist;

    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialist() {
        return specialist;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            ArrayList<Patient> patients= new ArrayList<>();
            ArrayList<Doctors> doctors=new ArrayList<>();
            ArrayList<Patient> nurses=new ArrayList<>();

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

                        patients.add(new Patient(name, cat, tim));
                        System.out.println("________________Patient added Successfully!_______________");

                        break;
                    case 2:
                        System.out.println("Enter Doctor Name ");
                        String nam = sc.nextLine();
                        System.out.println("Specialist  ");
                        String spec = sc.nextLine();

                        doctors.add(new Doctors(nam,spec));

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