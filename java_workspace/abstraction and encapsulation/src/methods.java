import java.util.Scanner;
public class methods extends student {
 public static void main(String[] args) {{
	 Scanner scanner =new Scanner(System.in);

        student student1 = new student();{		  
		  
  System.out.println("enter the name of the student");
  String Name =scanner.nextLine();
  setName(Name);
  System.out.println("enter the Registration Number "+student1.getName());
  String RegNo =scanner.nextLine();
  scanner.nextLine();
  setRegNo(RegNo);
  System.out.println("enter the age of  "+student1.getName());
  int Age =scanner.nextInt();
  setAge(Age);
  System.out.println("enter the Id-No of  "+student1.getName());
  int Id =scanner.nextInt();
  setId(Id);
  
  
  System.out.println(student1.getName()+" "+student1.getAge()+" "+student1.getId()+" "+student1.getRegNo());
	  }
  student student2 = new student();
  {
  System.out.println("enter the name of the student");
  String Name =scanner.nextLine();
  student2.setName(Name);
  scanner.nextLine();
  System.out.println("enter the Registration Number "+student2.getName());
  String RegNo =scanner.nextLine();
  scanner.nextLine();
  student2.setRegNo(RegNo);
  System.out.println("enter the age of  "+Name);
  int Age =scanner.nextInt();
  student2.setAge(Age);
  System.out.println("enter the Id-No of  "+Name);
  int Id =scanner.nextInt();
  student2.setId(Id);
  System.out.println(student2.getName()+" "+student2.getAge()+" "+student2.getId()+" "+student2.getRegNo());
  }
scanner.close();
/*student s2=new student();s2.setAge(15); s2.setId(344528); s2.setGender('M'); s2.setName("mike"); s2.setRegNo("ccs/00020/030");	  	 
        System.out.println(s2.getName()+" "+s2.getAge()+" "+s2.getId()+" "+s2.getRegNo());
student s3=new student();s3.setAge(16); s3.setId(344528); s3.setGender('M'); s3.setName("wafula"); s3.setRegNo("ccs/00020/030");	  	 
        System.out.println(s2.getName()+" "+s2.getAge()+" "+s2.getId()+" "+s2.getRegNo());	  	
	  	 
	*/  	 
	  	 
	  	 }
	}

}
