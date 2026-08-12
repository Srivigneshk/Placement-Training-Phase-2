public class program6 {
    class vehicleRental{
        long rent;
        String name;
        String brand;
        void vehicle(){
            System.out.println("Vehicle available for rent : BUS CAR BIKE VAN LORRY");
        }
        void vehicle(int days){
            System.out.println("Bus Rent : " + (days * 1000));
        }
        void vehicle(int days, String name){
            System.out.println("Car Rent : " + (days * 500));
        }
        void vehicle(int amount, String name, int days){
            System.out.println("Bike Rent : " + name + " : " + amount*days);
        }
    }
    void main(String[] args){
        vehicleRental v = new vehicleRental();
        v.vehicle();
        v.vehicle(5);
        v.vehicle(5, "Alice");
        v.vehicle(100, "Bob", 5);   
    }
}
