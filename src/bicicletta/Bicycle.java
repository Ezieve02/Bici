package bicicletta;

class Bicycle{

    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;        //fisicamente la marcia 0 non esiste, quindi partiamo da 1
    private int incremento;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        incremento = increment;
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println(
                "Ritmo:" + cadence +
                        " Velocità:" + speed +
                        " Marcia:" + gear +
                        " 		" + "QUA VORREI METTERE L'OUTPUT DELLA VARIABILE RANDOM" + "+");
    }

    @Override
    public String toString() {
        return "Bicicletta{" +
                "cadence=" + cadence +
                ", speed=" + speed +
                ", gear=" + gear +
                ", incremento=" + incremento +
                '}';
    }
}