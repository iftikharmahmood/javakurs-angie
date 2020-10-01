package no.nav.iftikhar.repetisjon.kapittel6;

public class Car {

    private boolean start;
    private boolean light;
    private boolean roof;
    private int speed;
    private String gearStatus;
    private String venchileStatus;


    public Car(boolean start, boolean light, boolean roof, int speed, String gearStatus, String venchileStatus) {
        this.start = start;
        this.light = light;
        this.roof = roof;
        this.speed = speed;
        this.gearStatus = gearStatus;
        this.venchileStatus = venchileStatus;
    }

    //Start
    public boolean isStart() {
        return start;
    }
    public void setStart(boolean start) {
        this.start = start;
    }

    // Light
    public boolean isLight() {
        return light;
    }
    public void setLight(boolean light) {
        this.light = light;
    }

    //Roof
    public boolean isRoof() {
        return roof;
    }
    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    //Speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    //Gear
    public String getGearStatus() {
        return gearStatus;
    }
    public void setGearStatus(String gearStatus) {
        this.gearStatus = gearStatus;
    }

    //Venchile status
    public String getVenchileStatus() {
        return venchileStatus;
    }
    public void setVenchileStatus(String venchileStatus) {
        this.venchileStatus = venchileStatus;
    }


}
