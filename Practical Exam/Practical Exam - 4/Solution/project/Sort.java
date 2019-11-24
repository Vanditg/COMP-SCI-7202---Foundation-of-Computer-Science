/*
*   Foundations of Computer Science
*   2019, Semester 02
*   Practical-Exam-04
*
*   student (id): a1779153
*   student (name): Vandit Jyotindra Gajjar
*
*
* Note: in order to finish your exam you are NOT required to make any changes in this class
*
*/
public abstract class Sort implements SortInterface{

	public abstract int [] sortInt(int [] arr);
	public abstract int [] sortIntByIndex(int [] arr);

	public abstract String [] sortString(String [] arr);
	public abstract int [] sortStringByIndex(String [] arr);


	public int [] getIndex(int value){
		int [] ans = new int [value];
		for(int i = 0; i < value; i++){
			ans[i] = i;
		}
		return ans;
	}

	public void printArray(int [] arr, String info){
		String ans = info + "[";
		for(int i = 0; i < arr.length; i++){
			ans += arr[i];
			if(i == arr.length-1)
				ans += "];";
			else
				ans += ",";
		}
		System.out.println(ans);
	}
	public void printArray(String [] arr, String info){
		String ans = info + "[";
		for(int i = 0; i < arr.length; i++){
			ans += arr[i];
			if(i == arr.length-1)
				ans += "];";
			else
				ans += ",";
		}
		System.out.println(ans);
	}
}
