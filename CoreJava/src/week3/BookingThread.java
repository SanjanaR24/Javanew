package week3;

class BookingThread extends Thread {
TicketBookingSystem bookingSystem;
  String passengerName;

    public BookingThread(TicketBookingSystem bookingSystem, String passengerName) {
        this.bookingSystem = bookingSystem;
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(passengerName);
    }
}