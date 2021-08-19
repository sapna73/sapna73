public class InheritanceExample {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuuus aushuu");
    }
}
class Car extends InheritanceExample{
    private String modelName = "Mustang";
    public static void main (String[] args){
        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}