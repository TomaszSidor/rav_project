package pl.sda.rav.Order;


import java.time.LocalDate;

public class Period {
    private LocalDate start;
    private LocalDate stop;

    public Period(LocalDate start, LocalDate stop) {
        this.start = start;
        this.stop = stop;
    }
}