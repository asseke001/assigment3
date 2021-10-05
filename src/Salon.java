public class Salon extends Changes{
    public Salon(Car newCar){
        super(newCar);

        System.out.println("Cabin");
        System.out.println("Air conditioning");
        System.out.println("Heated driver and front passenger seats");
        System.out.println("--------------");
    }

    public String getSpecification(){
        return jaiCar.getSpecification();
    }
    public double getPrice(){
        return jaiCar.getPrice()+100000;
    }
    public int getAge(){return jaiCar.getAge();}
}
