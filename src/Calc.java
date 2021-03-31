import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str1 = scanner.nextLine();
        String str2 = str1.toUpperCase();
        String str = str2.replaceAll("\\s+", "");
        char[] chars = str.toCharArray();
        int symbolIndex = 0;
        char ch = 0;
        for (int i = 1; i < chars.length - 1; i++) {
            switch (chars[i]) {
                case ('+'):
                    symbolIndex = i;
                    ch = '+';
                    break;
                case ('-'):
                    symbolIndex = i;
                    ch = '-';
                    break;
                case ('*'):
                    symbolIndex = i;
                    ch = '*';
                    break;
                case ('/'):
                    symbolIndex = i;
                    ch = '/';
                    break;
                case (':'):
                    symbolIndex = i;
                    ch = '/';
                    break;
            }
        }
        if (Character.isDigit(chars[0]) && Character.isDigit(chars[chars.length-1])){
            System.out.print("=" + Latin.Calculate(str, symbolIndex,ch));}
        else if (Character.isLetter(chars[0]) && Character.isLetter(chars[chars.length-1])) {
            System.out.print(Roma.Calculate(str, symbolIndex, ch));
        } else throw new ArithmeticException("Некорректное выражение");
    }
}
