 
package employee;
 
import static employee.Employee.*;

class Deduction {
    public static float paye(){
         return  (float) (13.21%BasicPay) ;  
    }
    public static float nssf(){
     return (float) (10.5%BasicPay);        
    }
    public static float nHif(){
     return (float) (7.9%BasicPay);
    }
}
