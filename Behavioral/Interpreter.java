package Behavioral;

interface InterpreterPattern {
    public abstract String convert(String string);
}

class Conversion implements InterpreterPattern {

    @Override
    public String convert(String string) {
        String res = "";
        for (char c : string.toCharArray())
            res += (char) (c + 1);

        return res;
    }

}

public class Interpreter {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        String res = conversion.convert("kiran vellanki");
        System.out.println(res);
    }
}
