public class Latin2Roma {
    public static String l2R(int number) {
        String result = null;

        if (number < 10) {
            result = oneDigit(number);
        } else if (number == 100) result = "C";
        else {
            int numb1 =number%10;
            int numb0 = (number/10)%10;
           if (numb1 == 0) result = twoDigit(numb0);
           else if (numb1 != 0) result = twoDigit(numb0)+ oneDigit(numb1);
    }
        return result;
}

    public static String oneDigit(int number1) {
        String result1 = null;
        switch (number1) {
            case (1):
                result1 = "I";
                break;
            case (2):
                result1 = "II";
                break;
            case (3):
                result1 = "III";
                break;
            case (4):
                result1 = "IV";
                break;
            case (5):
                result1 = "V";
                break;
            case (6):
                result1 = "VI";
                break;
            case (7):
                result1 = "VII";
                break;
            case (8):
                result1 = "VIII";
                break;
            case (9):
                result1 = "IX";
                break;
        }

        return result1;
    }

    public static String twoDigit(int number2) {
        String result2 = null;
        switch (number2) {
            case (1):
                result2 = "X";
                break;
            case (2):
                result2 = "XX";
                break;
            case (3):
                result2 = "XXX";
                break;
            case (4):
                result2 = "XL";
                break;
            case (5):
                result2 = "L";
                break;
            case (6):
                result2 = "LX";
                break;
            case (7):
                result2 = "LXX";
                break;
            case (8):
                result2 = "LXXX";
                break;
            case (9):
                result2 = "XC";
                break;
        }

        return result2;
    }
}
