// Flyable interface
interface Flyable {
    void fly_obj();
}

// Spacecraft class implementing Flyable interface
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in outer space.");
    }
}

// Airplane class implementing Flyable interface
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

// Helicopter class implementing Flyable interface
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying in the air.");
    }
}

public class app8 {
    public static void main(String[] args) {
        Flyable[] flyingObjects = new Flyable[3];
        
        flyingObjects[0] = new Spacecraft();
        flyingObjects[1] = new Airplane();
        flyingObjects[2] = new Helicopter();
        
        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}

