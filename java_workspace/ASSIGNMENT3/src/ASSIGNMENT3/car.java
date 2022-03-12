 package ASSIGNMENT3;
public class car{
	String name;
	int enginecapacity;
	//constructor to get the name
	
 	
	public car(String name) {
		this.name=name;
 	}
	 
	//overloading the method calculatemileage
  int calculatemileage(int distance)
 {
	return enginecapacity*distance; 

 }
 int calculatemileage(int distance,int year) 
 {
	 return (enginecapacity*distance)/(2021-year);
	 
 }

}


