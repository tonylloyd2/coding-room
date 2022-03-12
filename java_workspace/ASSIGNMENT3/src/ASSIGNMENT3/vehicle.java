 package ASSIGNMENT3;
 public class vehicle
 {
private String name,color, cargo,make,license;
private int capacity,wheels,passengers;
protected int mileage;
private int yearOfMake;
private int speed;
protected int enginecapacity;	
vehicle(String n,int y)

{
	this.name=n; this.yearOfMake=y;  
}
 void setMileage( int miles) {this.mileage=miles;}
 void setLicense(String license) {this.license=license;}
 void setEnginecapacity(int ecapacity) {this.enginecapacity=ecapacity;}
 void setPassengers(int p) {this.passengers=p;}
 void setMake(String mek) {this.make=mek;}	 
 void setWheels(int w) {this.wheels=w;}
 void setCargo(String c) {this.cargo=c;}
 void setSpeed(int s) {this.speed=s;}
 void setCapacity(int cap) {this.capacity=cap;}
 public	String getName() {return name;} 
 public int getYearOfMake() {return yearOfMake;}
 int getMileage() {return mileage;}
 String getLicense( ) {return license;}
 int  getEnginecapacity() {return enginecapacity;}
 int getPassengers() {return passengers;}
 String getMake() {return make;}	 
 int getWheels( ) { return wheels;}
 String getCargo( ) {return cargo;}
 int getSpeed( ) {return speed;}
 int getCapacity() {return capacity;}
 int calculatemileage(int distance){   return this.enginecapacity*distance;  }
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }