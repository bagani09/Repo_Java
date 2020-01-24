package String_HW;

// * Create a restaurant class with attribute name, guestCapacity, guestCount
// * 1. Create a method that tells user if the seats are available
//         * 2. Create a method that seatsParty
//         * 3. Create a method that removesParty
//         * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
//        * 5. Create a method that printsRestaurantSummary
public class restaurant {

    private String name;
    private int guestCapacity;
    private int guestCount;

    public void restaurantSummary() {
        System.out.println("Capacity: " + guestCapacity);
        System.out.println("Guests seated: " + guestCount);
    }
//    create a setter to get name and guestCapacity

    public boolean seatAvailability(int partySize) {
        int availableSeats = guestCapacity - guestCount;
        if (availableSeats >= partySize) {
            return true;
        } else {
            return false;
        }
    }

    public void seatParty (int seat) {
        guestCount = guestCount + seat;
    }

    public void  setToRemove (int remove) {
        this.guestCount -= remove;
    }




}







