public class Roma extends AbstractCalc {
    public static String Calculate(String str, int symbolIndex, char ch) {
        int firstNumber = Roma2Latin.r2L(str.substring(0, symbolIndex));


        int secondNumber = Roma2Latin.r2L(str.substring(symbolIndex + 1, str.length()));
        if (firstNumber == 0 || secondNumber == 0) {
            System.out.println("Некорректное выражение");
            System.exit(0);
        }

        int result = 0;
        switch (ch) {
            case ('+'):
                result = firstNumber + secondNumber;
                break;
            case ('-'):
                result = firstNumber - secondNumber;
                break;
            case ('*'):
                result = firstNumber * secondNumber;
                break;
            case ('/'):
                result = firstNumber / secondNumber;
                break;
        }


        String resultRoma = Latin2Roma.l2R(result);
        //int result = (firstNumber + ch + secondNumber);
        return resultRoma;
    }
}
