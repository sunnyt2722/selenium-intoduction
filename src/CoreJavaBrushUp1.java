import java.util.ArrayList;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		int myNum = 5;
		String myString = "Test";
		char myChar = 'c';
		double myDouble = 5.09;
		boolean myBool = true;
		
		int[] arr = {43,56,23,768,23,125};
		for(int array:arr) {
			System.out.println(array);
		}
		ArrayList<String> arrList = new ArrayList();
		arrList.add("Car"); 
		arrList.add("Bike");
		arrList.add("Plane");
		arrList.add("Boat"); 
		System.out.println("--------------");
		System.out.println("--------------");
		for(String str:arrList)
			System.out.println(str);
		System.out.println("--------------");
		System.out.println("--------------");
		for(String str:arrList)
			System.out.println(str);
		System.out.println("--------------");
		System.out.println("--------------");
		System.out.println(arrList.contains("Boat"));
		
		MethodDemo m = new MethodDemo();
		m.getData();
	}
}
