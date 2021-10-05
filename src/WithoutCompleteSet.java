public class WithoutCompleteSet implements Car{

    @Override
    public String getSpecification(){
        return "Chevrolet Cobalt";
    }


    @Override
    public double getPrice(){
        return 829900;
    }


    @Override
    public int getAge(){return 2021;}
}