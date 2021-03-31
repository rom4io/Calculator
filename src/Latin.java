public class Latin extends AbstractCalc {
    public static int Calculate(String str, int symbolIndex, char ch) {
        int firstNumber = Integer.parseInt(str.substring(0, symbolIndex));
        int secondNumber = Integer.parseInt(str.substring(symbolIndex + 1, str.length()));
        if (firstNumber > 10 || secondNumber > 10) {
            System.out.println("Введенное число больше 10");
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

        //int result = (firstNumber + ch + secondNumber);
        return result;
    }
}
