package week3;

import java.util.ArrayList;
import java.util.List;

class TicketBookingSystem {
    int tickets=5;
   List<String> bookedTickets=new ArrayList<>();
    public synchronized boolean bookTicket(String passengerName) {
        if (tickets > 0) {
            tickets--;
            bookedTickets.add(passengerName);
            System.out.println("Ticket booked for passenger: " + passengerName);
            return true;
        } else {
            System.out.println("Sorry, no tickets available.");
            return false;
        }
    }
}


