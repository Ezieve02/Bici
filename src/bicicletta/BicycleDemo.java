package bicicletta;
import java.util.Random;

class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bici1 = new Bicycle();
        Bicycle bici2 = new Bicycle();
        Random r = new Random();
        int a = r.nextInt(20);	//fra parentesi è inserito il range massimo di randomizzazione (n max di random da 0 a 20)

        
        // Invoke methods on 
        // those objects
        System.out.print("Bicycle 1: ");
        bici1.changeCadence(50);
        bici1.speedUp(10);
        bici1.changeGear(2);
        bici1.printStates();
        
        System.out.print("Bicycle 2: ");
        bici2.changeCadence(50);
        bici2.speedUp(10);
        bici2.changeGear(2);
        bici2.changeCadence(40);
        bici2.speedUp(a);			//10 (iniziali) + 10 (finali) = 20 velocità
        bici2.changeGear(3);
        bici2.applyBrakes(5);		//decremento di 5
        bici2.printStates();

        System.out.println("Valore random: " + a);
        System.out.println(bici2);

        Gui finestra = new Gui();
    }
}