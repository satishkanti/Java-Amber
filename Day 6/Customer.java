public class Customer implements Bike,Car {

    @Override
    public void carFeature() {
        System.out.println("Max Speed: 300kmph");
    }

    @Override
    public void bikeFeature() {
        System.out.println("Max Speed: 170 kmph");
    }
    
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.carFeature();
        c1.bikeFeature();
    }
}
