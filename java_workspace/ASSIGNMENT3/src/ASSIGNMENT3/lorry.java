 package ASSIGNMENT3; 
public class lorry extends vehicle{
int carryingcapacity;
//constructor inherited from vehicle
	lorry(String n, int y,int c) {
		super(n, y);
 	
	carryingcapacity=c;
	}
	//overridding the method calculate mileage
int calculatemileage(int distance) 
    {
	return 	this.carryingcapacity*this.enginecapacity*distance;
	  }	
 
	

}
