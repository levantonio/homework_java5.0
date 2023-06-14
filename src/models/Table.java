package models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter = 100;
    private final int no;
    private final Collection<Reservation> reservations =new ArrayList<>();

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
