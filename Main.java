public class Main{
    public static void main(String[] args){
        System.out.println("===Welcome to Tele Med Express===");

        Doctor doc=new Doctor(101,"Perera","Cardiologist");
        doc.displayDoctorDetails();

        System.out.println();

        Patient patient=new Patient(501,"Kamal",30);
        patient.displayPatientDetails();

        System.out.println();
        System.out.println("Appointment status:confirmed!");
    }
}
