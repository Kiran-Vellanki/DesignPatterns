import java.net.PortUnreachableException;

interface Bank {
    public String getBankName();

}

class HDFC implements Bank {
    @Override
    public

            String getBankName() {
        return "HDFC";
    }
}

class SBI implements Bank {
    @Override
    public String getBankName() {
        return "SBI";
    }
}

abstract class Loan {
    protected double rate;

    abstract void calculate();
}

class EducationLoan extends Loan {
    public void setRate(double rate) {
        super.rate = rate;
    }

    @Override
    public void calculate() {
        System.out.println(rate * 100);
    }
}

class BusinessLoan extends Loan {
    public void setRate(double rate) {
        super.rate = rate;
    }

    @Override
    public void calculate() {
        System.out.println(rate * 200);
    }
}