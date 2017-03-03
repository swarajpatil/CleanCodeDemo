package test.java.DuplicateCode;

import main.java.DuplicateCode.FullTimeEmployee;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FullTimeEmployeeTest {
    @Test
    public void testcalculateInsuranceAmount() throws Exception {
        LocalDate dateOfBirth = LocalDate.of(1985, 2, 10);
        LocalDate hireDate = LocalDate.of(2009, 2, 10);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John", dateOfBirth, hireDate, 10000, 5000, 3000, 2000);
        assertThat(fullTimeEmployee.calculateInsuranceAmount(), is(349600.0));
    }

    @Test
    public void testcalculateSpecialIncentive() throws Exception {
        LocalDate dateOfBirth = LocalDate.of(1985, 2, 10);
        LocalDate hireDate = LocalDate.of(2009, 2, 10);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John", dateOfBirth, hireDate, 10000, 5000, 3000, 2000);
        assertThat(fullTimeEmployee.calculateSpecialIncentive(), is(169800.0));
    }
}
