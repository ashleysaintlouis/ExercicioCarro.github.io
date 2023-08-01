
package carroa;

public class Car {
    private int marcha;
    private boolean trocarMarcha;
    
    public Car(int marcha){
        this.marcha = marcha;
        this.trocarMarcha = true;
    }
    
    public int getMarcha(){
        return marcha;
    }
    
    public void setMarcha(int marcha){
        this.marcha = marcha;
    }
    
    
    
    public void Marcha1(){
        if (marcha == 1){
            marcha++;
            System.out.println("Trocou de marcha para a marcha 2!!");
        } if (marcha > 2){
            System.out.println("Marcha fora do limite!! ");
        }
        trocarMarcha = true;
    }
    
    public void DiminuirMarcha(){
        if(marcha == 2){
            marcha--;
            System.out.println("Trocou a marcha para a marcha 1!! ");
            trocarMarcha = true;
        } if (marcha > 2){
            System.out.println("Marcha fora do limite!! ");
        }
    }

    
    
    @Override
    public String toString() {
        return "Car " + " marcha = " + marcha + ", trocarMarcha = " + trocarMarcha;
    }

    
    
    
        
}
