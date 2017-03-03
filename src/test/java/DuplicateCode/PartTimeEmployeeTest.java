package test.java.DuplicateCode;

import main.java.DuplicateCode.PartTimeEmployee;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PartTimeEmployeeTest {
    @Test
    public void testcalculateInsuranceAmount() throws Exception {
        LocalDate dateOfBirth = LocalDate.of(1985, 2, 10);
        LocalDate hireDate = LocalDate.of(2009, 2, 10);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("John", dateOfBirth, hireDate, 10000, 5000, 3000, 2000);
        assertThat(partTimeEmployee.calculateInsuranceAmount(), is(358400.0));
    }

    @Test
    public void testcalculateSpecialIncentive() throws Exception {
        LocalDate dateOfBirth = LocalDate.of(1985, 2, 10);
        LocalDate hireDate = LocalDate.of(2009, 2, 10);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("John", dateOfBirth, hireDate, 10000, 5000, 3000, 2000);
        assertThat(partTimeEmployee.calculateSpecialIncentive(), is(156040.0));
    }
}
