abstract class Changes implements Car{
    protected Car jaiCar;

    public Changes (Car newCar){
        jaiCar=newCar;
    }
    public String getSpecification(){
        return jaiCar.getSpecification();
    }
    public double getPrice(){
        return jaiCar.getPrice();
    }
    public int getAge(){return jaiCar.getAge();}
}
