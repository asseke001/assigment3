public class BuyCar {
    boolean customClearance=true;

    public static void main(String [] args){

        BuyCar s1=new BuyCar();
        Car completedCar=new OutsideOfCar(new Salon(new WithoutCompleteSet()));
        System.out.println("--------------");

        System.out.println("Car type: "+completedCar.getSpecification());
        System.out.println("Age of car: "+completedCar.getAge()+" year.");
        System.out.println("Custom clearance: "+s1.customClearance);
        System.out.println("Sum of car with addition: "+completedCar.getPrice()+ " тенге.");

    }
}
