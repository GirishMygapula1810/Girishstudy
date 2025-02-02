package amazon.finance.practise.assignment;

public class Car {
    String model;
    int year;

    public  Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    public void carType(){
        System.out.println("My car is " +model+  " and the year is " +year);
    }

    public static void main(String[] args){
        Car c = new Car("SUV" , 2024);
        c.carType();

    }
}
