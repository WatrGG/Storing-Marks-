import java.util.ArrayList;

public class Assign2_StoringMarks {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
			names.add("Dylan");
			names.add("Bobby");
			names.add("Evan");
			names.add("Curt");
			names.add("Gia");
			names.add("Eveline");
			names.add("John");
			names.add("Frank");
			names.add("Kyle");
			names.add("James");
		
		ArrayList<Integer> gradeNum = new ArrayList <Integer>();
			gradeNum.add(10);
			gradeNum.add(11);
			gradeNum.add(12);
			gradeNum.add(11);
			gradeNum.add(10);
			gradeNum.add(12);
			gradeNum.add(12);
			gradeNum.add(10);
			gradeNum.add(11);
			gradeNum.add(12);
		
		ArrayList<Double> exam1 = new ArrayList <Double>();
			exam1.add(67.0);
			exam1.add(83.0);
			exam1.add(75.0);
			exam1.add(42.0);
			exam1.add(20.3);
			exam1.add(76.3);
			exam1.add(99.3);
			exam1.add(46.5);
			exam1.add(48.4);
			exam1.add(56.2);
			
		ArrayList<Double> exam2 = new ArrayList <Double>();
			exam2.add(83.1);
			exam2.add(76.9);
			exam2.add(43.7);
			exam2.add(100.0);
			exam2.add(23.2);
			exam2.add(85.3);
			exam2.add(99.6);
			exam2.add(56.25);
			exam2.add(52.5);
			exam2.add(63.4);
		
		ArrayList<Double> exam3 = new ArrayList <Double>();
			exam3.add(35.4);
			exam3.add(69.6);
			exam3.add(56.2);
			exam3.add(75.9);
			exam3.add(88.7);
			exam3.add(67.5);
			exam3.add(100.0);
			exam3.add(75.4);
			exam3.add(85.8);
			exam3.add(43.4);
		
		for(int i = 0; i < names.size(); i++ ) {
			System.out.println(names.get(i) + "\t" + exam1.get(i) + "\t" + exam2.get(i) + "\t" + exam3.get(i));
		}
		
		exam3.set(0, 40.5);
		exam3.set(1, 74.6);
		exam3.set(2, 61.5);
		exam3.set(3, 80.9);
		exam3.set(4, 93.7);
		exam3.set(5, 72.5);
		exam3.set(6, 105.0);
		exam3.set(7, 80.4);
		exam3.set(8, 90.8);
		exam3.set(9, 48.4);
		
		System.out.println("----------Updated Marks----------");
		
		for(int i = 0; i < names.size(); i++ ) {
			System.out.println(names.get(i) + "\t" + exam1.get(i) + "\t" + exam2.get(i) + "\t" + exam3.get(i));
		
		}
		
		System.out.println("----------The People who are in Grade 11 or 10----------");
		
		for(int i = 0; i < names.size(); i++) {
			if (gradeNum.get(i) == 11 || gradeNum.get(i) == 10) {
				System.out.println(names.get(i) + "\t" + gradeNum.get(i));
			}
		}
		
		System.out.println("----------The People who Failed---------");
		
		for(int i = 0; i < names.size(); i++) {
			if (exam1.get(i) < 50.0) {
				System.out.println(names.get(i) + "\t" + exam1.get(i));
			}
		}
		
		System.out.println("----------The Averages for the 3 Tests----------");
		
	double sum1 = 0;
	
	double sum2 = 0;
	
	double sum3 = 0;
	
	for(int i = 0; i < exam1.size(); i++) {
		sum1 += exam1.get(i);
	}
	
	for(int i = 0; i < exam2.size(); i++) {
		sum2 += exam2.get(i);
	}
	
	for(int i = 0; i < exam3.size(); i++) {
		sum3 += exam3.get(i);
	}
	
	for(int i = 0; i < 1; i++) {
		
		double average1 = sum1/10;
		
			System.out.println("Exam 1: " + average1);
		
		double average2 = sum2/10;
		
			System.out.println("Exam 2: " + average2);
		
		double average3 = sum3/10;
		
			System.out.println("Exam 3: " + average3);
		
		}
	}

}
