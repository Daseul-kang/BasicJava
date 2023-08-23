package chapter06.Exercise;
//모.르.겠.음.......................................
public class NewCar {
    private double speed;
    private String color;
    private final static double MAX_SPEED = kiloToMile(200);

    public NewCar() {

    }
    public NewCar(String color) {
        this.color = color;
    }
    public double getSpeed() {
        return mileToKilo(speed);
    }
    public void setSpeed(double speed) {
        this.speed = kiloToMile(speed);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static double getMaxSpeed () {
        return MAX_SPEED;
    }

    public boolean speedUp(double speed) {
        if (kiloToMile(speed) + this.speed >= 0 && kiloToMile(speed) + this.speed < kiloToMile(MAX_SPEED))
        {
            this.speed += kiloToMile(speed);
            return true;
        }
        return false;
    }
    private static double kiloToMile(double distance) {
        return distance / 1.6;
    }
    private static double mileToKilo(double distance) {
        return distance * 1.6;
    }

    public String toString() {
        return String.format(color, speed);
    }
}
