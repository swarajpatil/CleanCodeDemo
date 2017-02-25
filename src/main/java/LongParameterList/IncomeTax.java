package main.java.LongParameterList;

public class IncomeTax {

    public static final int TAX_SLAB_1_LIMIT = 250000;
    public static final int TAX_SLAB_2_LIMIT = 500000;
    public static final int TAX_SLAB_3_LIMIT = 100000;
    public static final double TAX_SLAB_1_PERCENTAGE = 0.1;
    public static final double TAX_SLAB_2_PERCENTAGE = 0.2;
    public static final double TAX_SLAB_3_PERCENTAGE = 0.3;

    public double calculate(double BasicSalary, double HRA, double TransportAllounce,
                            double SpecialAllounce, double LTA, double MedicalAllounce,
                            double investment80C, double investment80D) {
        double grossSalary = BasicSalary + HRA + TransportAllounce + SpecialAllounce + LTA + MedicalAllounce;

        double deductions = investment80C + investment80D;
        double taxableIncome = grossSalary - deductions;

        if (taxableIncome > TAX_SLAB_1_LIMIT)
            return taxableIncome * TAX_SLAB_1_PERCENTAGE;

        if (taxableIncome > TAX_SLAB_2_LIMIT)
            return taxableIncome * TAX_SLAB_2_PERCENTAGE;

        if (taxableIncome > TAX_SLAB_3_LIMIT)
            return taxableIncome * TAX_SLAB_3_PERCENTAGE;

        return 0;
    }
}
