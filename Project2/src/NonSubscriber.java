public class NonSubscriber extends Passenger{

private boolean nodiscount;

    public NonSubscriber(String name, String id, boolean nodiscount) {
        super(name, id);
        this.nodiscount=nodiscount;
    }

    public boolean isNodiscount() {
        return nodiscount;
    }

    public void setNodiscount(boolean nodiscount) {
        this.nodiscount = nodiscount;
    }

    @Override
    public void reservedCar(Car c) throws Exception {
        c.resverC();
        this.reservedCar=c;
        if (isNodiscount()){
            //car_object.route_object.price - (car_object.route_object.price 0.1)
            this.tripCost=c.getRoute().getTripPrice()-(c.getRoute().getTripPrice()*0.1);
    }
        else{
            this.tripCost=c.getRoute().getTripPrice();
        }
    }
}
