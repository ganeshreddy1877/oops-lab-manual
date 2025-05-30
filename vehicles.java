public class vehicles {
    void displayinfo() {
        System.out.println("This is a vehicle");
    }
}

class Car extends vehicles {
    String Name, Model, Capacity;
    int Price;
    boolean Petrol;

    Car(String Name, String Model, String Capacity, int Price, boolean Petrol) {
        this.Name = Name;
        this.Model = Model;
        this.Capacity = Capacity;
        this.Price = Price;
        this.Petrol = Petrol;
    }

    @Override
    public void displayinfo() {
        System.out.println("Car name is: " + Name);
        System.out.println("The model is: " + Model);
        System.out.println("The price of the car is: " + Price);
        System.out.println("The seating capacity of the car is: " + Capacity);
        System.out.println("Is it petrol? " + Petrol);
    }
}

 class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Sedan", "5-Seater", 4500, true);
        c1.displayinfo();
    }
}