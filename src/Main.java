import models.TableModel;
import presenters.BookingPresenter;
import presenters.Model;
import presenters.View;
import views.BookingView;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        ((BookingView) bookingView).reservationTable(new Date(), 1103, "Ctas");
        ((BookingView) bookingView).reservationTable(new Date(), 102, "Ctas");

        ((BookingView) bookingView).changeReservationTable(9001, new Date(), 101, "Станислав");
        ((BookingView) bookingView).changeReservationTable(9001, new Date(), 104, "Станислав");
    }
}