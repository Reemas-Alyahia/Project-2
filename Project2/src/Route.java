public class Route {
    private String pickadd;
    private String  destadd;
    private double tripPrice;
    public Route(String pickadd, String destadd, double tripPrice) {
        this.pickadd = pickadd;
        this.destadd = destadd;
        this.tripPrice = tripPrice;
    }

    public void setPickadd(String pickadd) {
        this.pickadd = pickadd;
    }

    public void setDestadd(String destadd) {
        this.destadd = destadd;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public String getPickadd() {
        return pickadd;
    }

    public String getDestadd() {
        return destadd;
    }

    public double getTripPrice() {
        return tripPrice;
    }
}
