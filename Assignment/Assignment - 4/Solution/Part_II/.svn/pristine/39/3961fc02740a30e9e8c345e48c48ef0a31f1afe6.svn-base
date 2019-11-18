//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 4 Part - II
//===================================

public class HanoiTower {
	
    //Instantiating private variable disk here.
    private int disk;

    //Default constructor with disk = 3.
	HanoiTower() {
		disk = 3;
	}

    //Parametric constructor
	HanoiTower(int dTmp) {
		this.disk = dTmp;
	}

    //Creating accessors.
	public int getDisk() {
		return this.disk;
	}

    //Main Logic here.
    //Creating method solve that accepts one int variable n and three string variable
    public void solve(int n, String from_rod, String to_rod, String aux_rod) { 
        
        if (n == 1) { 
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } 
        //Performing recursion here. First move n-1 disk from start to aux rod.
        solve(n-1, from_rod, aux_rod, to_rod); 
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        
        //Performing recursion here. After move disk from aux to final rod.
        solve(n-1, aux_rod, to_rod, from_rod); 
    } 

    public int numberSteps() {
        return ((int)Math.pow(2,this.disk)-1);
    }
} 

