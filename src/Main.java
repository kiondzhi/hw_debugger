import java.time.temporal.ChronoField;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findBiggestEven(numbers));
        System.out.println(changeRegister("Привет, Как Дела"));
        }

        public static String changeRegister(String stroke) {
            StringBuilder result = new StringBuilder();

            for (char c: stroke.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                }   else if (Character.isLowerCase(c)) {
                    result.append(Character.toUpperCase(c));
                }   else {
                    result.append(c);
                }
        }
        return result.toString();
        }

        public static int findBiggestEven(int[] array) {
            int biggest = 0;
            for (int element: array) {
                if (element % 2 == 0 && element > biggest) {
                    biggest = element;
                }
            }
            return biggest;
        }
}
