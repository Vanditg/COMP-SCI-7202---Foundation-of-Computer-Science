//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - I
//===================================

public class WaitingList {

    //Defining protected variables 
    protected Node head;
    protected int numNodes;

    //Default constructor 
    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */

    public Patient popPatient() {

        Node max = maxNode();

        if (this.head == max) {
            this.head = this.head.next;
            return max.patient;
        }

        else if (this.head!=null) {

            if (this.head.next!=null) {

                Node temp = this.head;
                Node prev = null;
                while(temp.next !=null) {

                    if (temp.patient.getTriageLevel() == max.patient.getTriageLevel()) {

                        prev.next = temp.next;
                        return temp.patient;

                    }else {

                        prev = temp;
                        temp = temp.next;
                    }
                }
            }

            else {

                return head.patient;

            }

        }

        return null;

    }

    //Defining private node.
    private Node maxNode() {

        Node max = this.head;
        Node temp = this.head;

        if (this.head == null) {

            System.out.println("No patients left");

            return null;
        }

        while(temp.next!=null) {

            if (temp.patient.getTriageLevel()>max.patient.getTriageLevel()) {

                max = temp;
                temp = temp.next;

            } else {

                temp = temp.next;

            }
        }

        return max;

    }

    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */

    //Defining method - addToList
    public void addToList(Patient patient) {

        Node node = new Node(patient);
        Node temp = this.head;
        this.head = node;
        node.setNext(temp);

    }
            
    //Defining method for printing details.
    public void printList() {

        Node temp = this.head;
        while(temp.next != null) {
            temp.printNode();
            temp = temp.next;

        }
    }

    
    //Check whether the patient is in this list or not
    public boolean isInList(Patient patient) {

        if (this.head == null) {
            return false;
        }
        
        Node temp = this.head;
        
        while(temp != null) {

            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }

            temp = temp.getNext();
        }

        return false;

    }

    //Defining remove method 
    public void remove(int id) {

        if(this.head != null) {

            Node temp = this.head;
            Node prev = null;

            do {

                if (temp.patient.getId() == id) {

                    if(prev != null) {

                        prev.next = temp.next;
                        temp = temp.next;

                    } else {

                        this.head = this.head.next;
                        prev = null;
                        temp = this.head;
                    }

                } else {

                    prev = temp;
                    temp = temp.next;

                }

            } while(temp != null);
        }
    }

    //DEfining method getNumberPatient 
    public int getNumberPatients(int id) {
        int counter = 0;

        if (this.head !=null) {

            Node temp = this.head;

            do {

                if (temp.patient.getId()==id) {
                    break;
                }

                temp = temp.next;

            } while(temp!=null);

            Node node = temp;
            temp = this.head;

            do {

                if (node.patient.getTriageLevel()<temp.patient.getTriageLevel()) {
                    counter++;
                }

                temp = temp.next;
            } while(temp!=null);
        }
        return counter;
    }
}

