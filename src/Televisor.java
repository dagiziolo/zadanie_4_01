public class Televisor {
    private boolean isTurnOn;


    public void turnOn() {
        if(isTurnOn == false){
            isTurnOn = true;
        }
    }
    public void turnOff() {
        if(isTurnOn == true){
            isTurnOn = false;
        }
    }

    public void showStatus() {
        if(isTurnOn == false)
            System.out.println("Telewizor jest wyłączony");
        else System.out.println("Telewizor jest włączony");
    }

    public boolean isTurnOn() {
        return isTurnOn;
    }

    public void setTurnOn(boolean turnOn) {
        isTurnOn = turnOn;
    }



}
