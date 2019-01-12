package bicicletta;
import java.util.Random;

class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicicletta bici1 = new Bicicletta();
        Bicicletta bici2 = new Bicicletta();
        Random r = new Random();
        int a = r.nextInt(20);	//fra parentesi è inserito il range massimo di randomizzazione (n max di random da 0 a 20)

        
        // Invoke methods on 
        // those objects
        System.out.print("Bicicletta 1: ");
        bici1.changeCadence(50);
        bici1.speedUp(10);
        bici1.changeGear(2);
        bici1.printStates();
        
        System.out.print("Bicicletta 2: ");
        bici2.changeCadence(50);
        bici2.speedUp(10);
        bici2.changeGear(2);
        bici2.changeCadence(40);
        bici2.speedUp(a);			//10 (iniziali) + 10 (finali) = 20 velocità
        bici2.changeGear(3);
        bici2.applyBrakes(5);		//decremento di 5
        bici2.printStates();
        
    }
}