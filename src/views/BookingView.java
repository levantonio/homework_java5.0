package views;

import models.Table;
import presenters.View;
import presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);

    }

    @Override
    public void printReservationTableError(String errorMessage) {
        System.out.printf("Невозможно забронировать столик: #%s\n", errorMessage);

    }

    @Override
    public void printChangeReservationTableResult(int reservationNo) {

    }

    @Override
    public void printChangeReservationTableError(String errorMessage) {

    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }
    public void reservationTable(Date reservationDate, int tableNo, String name) {
        observer.onReservationTable(reservationDate, tableNo, name);
    }
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation,reservationDate,tableNo,name);
    }

}
