import java.time.Instant;
import java.util.Date;
import java.util.ArrayList;

public class Voos {
    public static class Flight {
        private final Date date;
        private final int flight_number;
        private final int max_passengers = 100;
        private ArrayList<Integer> available_seats = new ArrayList<Integer>();
        // private ArrayList<Integer> occupied_seats = new ArrayList<Integer>();

        /**
         * Create a new flight with a specified date and number
         * @param flight_number
         * @param date
         */
        public Flight(int flight_number, Date date) {
            this.flight_number = flight_number;
            this.date = date;

            for(int seat = 0; seat <= 100; seat++) {
                available_seats.add(seat);
            }
        };

        /**
         * Check the next free seat
         * @return the number of the next free seat
         */
        public int nextFreeSeat() {
            return available_seats.get(1);
        }

        /**
         * Verify if the seat is available
         * @param seat_number
         * @return true if the seat is occupied
         */
        public boolean verifySeat(int seat_number) {
            if(!available_seats.contains(seat_number)){
                return true;
            }
            return false;
        }

        /**
         * Ocuppies a seat
         * @param seat_number
         * @return whether the seat is occupied
         */
        public boolean occupySeat(int seat_number) {
            if(verifySeat(seat_number)) {
                return false;
            }
            available_seats.remove(seat_number);
            return true;
        }

        /**
         * Get the number of the chairs not occupied
         * @return the number of available seats
         */
        public int availableSeats() {
            //there are 101 elements into the List
            return available_seats.size() - 1;
        }

        public int getFlightNumber() {
            return this.flight_number;
        }

        public Date getFliDate() {
            return this.date;
        }

    }
    public static void main(String args[]){
        Flight alemanha = new Flight(2, Date.from(Instant.now()));
        alemanha.occupySeat(4);
    }
}
