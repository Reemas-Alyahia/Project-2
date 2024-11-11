public class Car {
    private String code;
    private Route route;
    private double maximumcap;

    public Car(String code, Route route, double maximumcap) {
        this.code = code;
        this.route = route;
        this.maximumcap = maximumcap;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public void setMaximumcap(double maximumcap) {
        this.maximumcap = maximumcap;
    }

    public String getCode() {
        return code;
    }

    public Route getRoute() {
        return route;
    }

    public double getMaximumcap() {
        return maximumcap;
    }
    public void resverC()throws Exception{
        if(getMaximumcap()==0){
            throw new Exception("....."); }
       }
    //The function used to reserve a car for a passenger should throw an exception if the
    //maximum capacity of the car was equal to zero In .
}
