public class Subscribers extends Passenger {

    public Subscribers(String name, String id) {
        super(name, id);
    }
    @Override
    public void reservedCar(Car c) throws Exception {
    this.reservedCar=c;
    this.tripCost=c.getRoute().getTripPrice()-(c.getRoute().getTripPrice()*0.5);
c.resverC();
    }

}
