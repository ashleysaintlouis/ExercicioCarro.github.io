
package carroa;


public class CarroA {

   
    public static void main(String[] args) {
        Car c = new Car(1);
        
        Car c1 = new Car(2);
        
        System.out.println(c.toString());
        System.out.println(c1.toString() + "\n");
        
        c.Marcha1();
        c.DiminuirMarcha();
        
        System.out.println("\n");
        c1.Marcha1();
        c1.DiminuirMarcha();
    }
    
}
