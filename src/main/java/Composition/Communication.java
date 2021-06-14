package Composition;

public class Communication {
    private String internet;
    private boolean hasCommunications;

    public Communication(String internet, boolean hasCommunications) {
        this.internet = internet;
        this.hasCommunications = hasCommunications;
    }
    public void payInternet(){
        System.out.println("Internet payed");
    }
    public String getInternet() {
        return internet;
    }

    public boolean isHasCommunications() {
        return hasCommunications;
    }

    @Override
    public String toString() {
        return String.format("internet %s, Has Communication %b",internet,hasCommunications);
    }
}
