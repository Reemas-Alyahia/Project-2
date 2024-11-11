public abstract class Passenger {
    private String name;
    private String id;
    public Car reservedCar;
    public double tripCost;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }
public abstract void reservedCar(Car c)throws Exception;
public void display (){
    System.out.println("The name of passenger is:  "+name);
    System.out.println("The ID of passenger is:  "+id);

    if(reservedCar!=null){
        System.out.println("The start pick up address:  "+reservedCar.getRoute().getPickadd() );
        System.out.println("The destination address: "+reservedCar.getRoute().getDestadd());
        System.out.println("The resevered of car code is: "+reservedCar.getCode());
        System.out.println("The total cost is :  "+reservedCar.getRoute().getTripPrice());
        System.out.println("The cost after the discount  "+tripCost);
        System.out.println("-------------------------");
    }
    else if(reservedCar==null){
            System.out.println("we can't reserve any thing right now, cus it's full");
        }
    }
}


