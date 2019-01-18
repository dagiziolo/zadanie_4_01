public class TelevisiorTest {
    public static void main(String[] args) {
        Televisor televisior = new Televisor();
//        televisior.setTurnOn(true);  do sprawdzeń, wykomentowane bo miałą być domyślna wartość
        televisior.showStatus();
        televisior.turnOn();
        televisior.showStatus();
        televisior.turnOff();
        televisior.showStatus();
//        televisior.turnOff();  do testów
//        televisior.showStatus();
//        televisior.turnOn();
//        televisior.showStatus();

    }


}
