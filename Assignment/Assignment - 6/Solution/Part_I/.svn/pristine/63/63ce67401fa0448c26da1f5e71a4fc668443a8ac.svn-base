//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - I
//===================================

public class ServiceCenter {
    private WaitingList awl;

    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /*
     * Record patient's data and add the patient into waiting list
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */

    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location);
        if(this.awl.isInList(patient)){
            System.out.println(patient.getName() + " is in waiting list. ");
        }else{
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }

    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     * @return the patient object
     */

    public Patient assignAmbulanceForPatient() {
        // TODO: The tester report that the system will crash when waiting list is empty
        try {
            Patient patient = this.awl.popPatient();
            System.out.println("Assigned an ambulance for patient: " + patient.getName());

        }

        catch (Exception e) {
            System.out.println("Patients are full. (Something went wrong.)");
        }
    return null;
    }

    /**
     * Print out the waiting list
     */

    public void printWaitingList(){
        System.out.println("Patients in the list are :");
        this.awl.printList();
    }


    public void assignAmbulance(int id) {
        awl.remove(id);
        System.out.println("Success! An ambulance as assigned for patient " + id + ".");
    }

    public void checkPos(int id) {
        int number = awl.getNumberPatients(id);
        System.out.println("There are " + number + " patients before patient " +  id + ".");

    }
}

