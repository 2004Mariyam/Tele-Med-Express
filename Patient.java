public class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId,String name,int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
    }
    public void displayPatientDetails(){
        System.out.println("Patient ID:"+patientId);
        System.out.println("Patient Name:"+name);
        System.out.println("Age:"+age);
    }
}
