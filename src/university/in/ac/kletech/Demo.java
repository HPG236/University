package university.in.ac.kletech;

public class Demo {
	public static void main(String[] args) { 
        //creating object of college	
		college KLE=new college("KLE56","KLETECH");
		//displaying no of branches
		KLE.NoOfBranches();
		//creating departments
		KLE.create("cs",400,20);
		KLE.create("Ec",500,30);
		//creating faculty
		KLE.create();
		//calculating salary for each faculty
		KLE.FacultySalary();
		//calculating no of students
		KLE.NoOfStudents();
		KLE.find();
		
		college BVB=new college("BVB345", "BVB");
		//creating faculty
		BVB.create();
		//creating departments
		BVB.create("cs",300,15);
		BVB.create("EC",490,10);
		//calculating salary for each faculty
		BVB.FacultySalary();
		//calculating no of students
		BVB.NoOfStudents();
		BVB.find();
		
		}

}
