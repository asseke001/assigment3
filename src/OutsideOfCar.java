public class OutsideOfCar extends Changes{
    public OutsideOfCar(Car newCar){
        super(newCar);
        System.out.println("Out Side Of Car");
        System.out.println("Add Aluminum rims 15 X 6.0");
        System.out.println("Electric rear power windows");
    }
    public String getSpecification(){return jaiCar.getSpecification();}
    public double getPrice(){
        return jaiCar.getPrice()+53100;
    }
    public int getAge(){return jaiCar.getAge();}
}
