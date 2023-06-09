interface CreditCard {
    public String getCardDetails();

    public String getBankDetails();
}

class BankDetails {
    private String bankName;
    private int bankNumber;
    private String holderName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

}

class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void setBankName(String bankName) {

        super.setBankName(bankName);
    }

    @Override
    public void setHolderName(String holderName) {
        // TODO Auto-generated method stub
        super.setHolderName(holderName);
    }

    @Override
    public void setBankNumber(int bankNumber) {
        // TODO Auto-generated method stub
        super.setBankNumber(bankNumber);
    }

    @Override
    public String getCardDetails() {
        return getBankNumber() + " ";
    }

    @Override
    public String getBankDetails() {
        return getBankName() + " " + getBankNumber() + " " + getHolderName();
    }

}

/**
 * Adapter
 */
public class Adapter {
    public static void main(String[] args) {
        BankCustomer bankCustomer = new BankCustomer();
        bankCustomer.setBankName("SBI");
        bankCustomer.setBankNumber(1234);
        bankCustomer.setHolderName("kiran vellanki");
        System.out.println(bankCustomer.getBankDetails());
        System.out.println(bankCustomer.getCardDetails());
    }

}
