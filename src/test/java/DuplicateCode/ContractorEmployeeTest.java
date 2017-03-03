package test.java.DuplicateCode;

import main.java.DuplicateCode.ContractorEmployee;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContractorEmployeeTest {

    @Test
    public void testcalculateInsuranceAmount() throws Exception {
        LocalDate dateOfBirth = LocalDate.of(1985, 2, 10);
        LocalDate hireDate = LocalDate.of(2009, 2, 10);
        ContractorEmployee contractorEmployee = new ContractorEmployee("John", dateOfBirth, hireDate, 10000, 5000, 3000, 2000);
        assertThat(contractorEmployee.calculateInsuranceAmount(), is(150400.0));
    }

    @Test
    public void testcalculateSpecialIncentive() throws Exception {
        LocalDate dateOfBirth = LocalDate.of(1985, 2, 10);
        LocalDate hireDate = LocalDate.of(2009, 2, 10);
        ContractorEmployee contractorEmployee = new ContractorEmployee("John", dateOfBirth, hireDate, 10000, 5000, 3000, 2000);
        assertThat(contractorEmployee.calculateSpecialIncentive(), is(83760.0));
    }
}