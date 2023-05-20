class StudentReport{
	void studentGrade(String name, int rollNo, double scienceMarks, double socialMarks, double mathMarks){
		double totalMarks = scienceMarks + socialMarks + mathMarks;
		System.out.println("Your total Marks: " + totalMarks);
		double avg;
		avg = totalMarks/3;

		if(avg > 70){
			System.out.println("You got an A");
		}
		else if(avg <= 70 && avg >= 50){
			System.out.println("You got a B");
		}
		else{
			System.out.println("You got a C");
		}
	}
	public static void main(String[] args){
		StudentReport student = new StudentReport();
		 student.studentGrade("Sushil",1710,50.8,83.9,1.9);
		 student.studentGrade("Anu",1712,100.8,69.65,64.9);
		 student.studentGrade("Shubha",1713,100.53,100.35,100.35);
		 student.studentGrade("Aruna",1714,20.4,50.4,63.9);
		 student.studentGrade("Maki",1715,78.8,93.6,1.53);
		 student.studentGrade("Fred",1716,70.4,24.6,46.8);
		 student.studentGrade("Bil",1717,24.53,47.7,1.9);


	}

}
