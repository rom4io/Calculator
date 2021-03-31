import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str1 = scanner.next();
        String str2 = str1.replaceAll(" ","");
        String str = str2.toUpperCase();
        char[] chars = str.toCharArray(); 
        int symbolIndex = 0;
        char ch = 0;
        for (int i = 1; i < str.length() - 1; i++) {
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
            System.out.println("=" + Latin.Calculate(str, symbolIndex,ch));}
        else if (Character.isLetter(chars[0]) && Character.isLetter(chars[chars.length-1])) {
            System.out.println(Roma.Calculate(str, symbolIndex, ch));
        } else throw new ArithmeticException("Некорректное выражение");
    }
}
