package bicicletta;

class Bicicletta {

    int cadence = 0;	
    int speed = 0;		
    int gear = 1;		//fisicamente la marcia 0 non esiste, quindi partiamo da 1
	

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
    
    

    void printStates() {
         System.out.println("Ritmo:" + cadence + " Velocità:" + speed + " Marcia:" + gear + " 		" + "QUA VORREI METTERE L'OUTPUT DELLA VARIABILE RANDOM" +"+");
    }
}