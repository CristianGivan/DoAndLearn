package CursOld.Objects;
public class Car {
    final int maxSpeed; //atribut final
    static final int NUMBER_OF_WHEELS = 4; //constanta

    String brand;
    String color;
    int currentSpeed;
    int currentGear;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void startCar() {
        System.out.println("Masina a pornit");
        this.currentGear = 1;
        this.currentSpeed = 1;
    }

    public void accelerate(int aSpeed) {
        if (this.currentSpeed + aSpeed > maxSpeed) {
            System.out.println("S-a depasit viteza limita!");
        } else {
            this.currentSpeed += aSpeed;
            if (aSpeed > 20) {
                this.currentGear++;
            }
        }
    }

    public void decelerate(int dSpeed) {
        if (this.currentSpeed - dSpeed < 1) {
            System.out.println("Masina se va opri!");
        } else {
            this.currentSpeed -= dSpeed;
            if (dSpeed > 20) {
                this.currentGear++;
            }
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", currentGear=" + currentGear +
                '}';
    }
}
