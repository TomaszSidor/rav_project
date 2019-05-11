package pl.sda.rav.order;


import java.time.LocalDate;

public class Period {
    private LocalDate start;
    private LocalDate stop;

    public Period(LocalDate start, LocalDate stop) {
        this.start = start;
        this.stop = stop;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getStop() {
        return stop;
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", stop=" + stop +
                '}';
    }

    public boolean isIncluded(Period period1){
       if (start.isAfter(period1.getStop()) || stop.isBefore(period1.getStart())){
           return false;
       }
       return true;
    }
}