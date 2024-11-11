//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //Create 2 routes and assign each of them to a different Car object

        Route r1=new Route("Riyadh","Dmamm",250.5);
        Route r2=new Route("Riyadh","London",700.0);

        ///////////////////////////////////////

       //assign each of them to a different Car object.
        Car c1=new Car("R02#2",r1,4);
        Car c2=new Car("R23@",r2,0);

        /////////////////////////////////////

     //Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.

Passenger []passArr=new Passenger[2];//-- polyma in Array
passArr[0]=new Subscribers("Reemas","R13@");
passArr[1]=new NonSubscriber("Ali","A#12&",true);

    //////////////////////////
try {//// I throw it there exception so when i want to call it here i have to
    //put exception to handle it...
    passArr[0].reservedCar(c1);
       } catch (Exception e) {
        System.out.println(e.getMessage()); }
//////
try {
    passArr[1].reservedCar(c2);
} catch (Exception e){
    System.out.println(e.getMessage());
}
////

 ///Assign a different car object to each passenger and then display their information.
for (Passenger p:passArr){
    p.display();}


    }
}
