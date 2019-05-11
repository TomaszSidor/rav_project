package pl.sda.rav.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PeriodTest {
    @Test

    public void shouldBeAvailable(){

        //given
        Period period = new Period(LocalDate.of(2010,12,01),LocalDate.of(2010,12,05));
        Period period1 = new Period(LocalDate.of(2010,12,01),LocalDate.of(2010,12,05));
        Period period2 = new Period(LocalDate.of(2011,12,01),LocalDate.of(2011,12,05));

        //when
        period.isIncluded(period1);
        period.isIncluded(period2);

        //then
        Assertions.assertTrue( period.isIncluded(period1));
        Assertions.assertFalse( period.isIncluded(period2));

    }



}