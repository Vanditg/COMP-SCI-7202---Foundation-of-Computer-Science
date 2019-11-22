//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// id: a1779153
// Semester: 2
// Year: 2019
// Practical Exam Number: 2
//===================================

public class DebuggingDemo {

	// The array index was out of the bound, thus chnaging the index would solve the problem.
    public void bugMethod() {
         int num[] = {1, 2, 3, 4};
         System.out.println(num[3]);
     }

    // The code had int and asks for return the value in float thus chnaging the return type would solve the problem.
    public float bugMethod2() {
            float ans = 0.0f;

            System.out.println("This method had a bug!");
            return (float)ans;
     }


}