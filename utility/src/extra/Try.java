//package extra;
//
//import java.util.Scanner;
//
//public class Try {
//    
//    int top = 0, f = 0;
//    char chArr[];
//    
//    void getData() {
//       
//        int a = 5, b = 2, c = 1, countIden = 0, count = 0, lastCount = 0;
//        
//        Scanner input = new Scanner(System.in);
//        String exp = input.nextLine();
//        
//        char[] str = exp.toCharArray();
//        int len = str.length;    
//        
//        for (int i = 0; i < len; i++) {
//            if (str[i] >= 'a' && str[i] <= 'z' && countIden % 2 == 0) {
//                count++;
//            }
//            if (str[i] == '+' || str[i] == '-' || str[i] == '*' || str[i] == '/' && countIden % 2 != 0) {
//                count++;
//            }
//            if(str[i] == '(') {
//                char ch = str[i];
//                push(ch);
//                count++;
//            }
//            if(str[i] == ')') {
//                char ch = str[i];
//                ch = pop();
//                if(ch != '(') {
//                    f = 1;
//                }
//                count++;
//            }
//            countIden++;
//        }
//        
//        if (str[len - 1] == '+' || str[len - 1] == '-' || str[len - 1] == '*' || str[len - 1] == '/') {
//            lastCount++;
//        } 
//        
//        if (count == len && lastCount == 0 && top == 0 && f == 0) {
//            System.out.println("Expression is OK");
//            //System.out.println(infixToPostfix(exp));
//            
//        } else {
//            System.out.println("Compilation Error");
//        }
//    }
//
//    public void push(char ch) {
//        chArr[top] = ch;
//        top++;
//    }
//    
//    public char pop() {
//        char ch;
//        if (top != 0) {
//            ch = chArr[top];
//            top--;
//            return ch;
//        } else {
//            return 0;
//        }
//    }
//}

package extra;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Try {

    public static void main(String[] args) {

        LocalDate dateOfBirthDay;
        Long age;
        String dateOfBirthString;

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        LocalDate currentDate = LocalDate.now();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Age Calculator\n");
        System.out.println();

        do {
            System.out.print("Enter your date of birth (YYYY-MM-DD): ");
            dateOfBirthString = sc.nextLine();
            try {
                dateOfBirthDay = LocalDate.parse(dateOfBirthString);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format!");
                System.out.println();
                continue;
            }
            if (dateOfBirthDay.isAfter(currentDate)) {
                System.out.println("Birthday must be before current date!");
                System.out.println();
            } else {
                sc.close();
                break;
            }
        } while (true);

        // Format and print user's date of birth
        System.out.println();
        System.out.println("Your date of birth is：" + dtf.format(dateOfBirthDay));

        // Format and print the current date
        System.out.println("The current date is: " + dtf.format(currentDate));

        // Calculate and print the user's age
        age = ChronoUnit.YEARS.between(dateOfBirthDay,  currentDate);
        System.out.format("Which makes you %d years old.", age);
    }
}

// import java.util.Scanner;
//import java.util.GregorianCalendar;
//import java.util.Calendar;
//
//
//
//public class Try {
//
//    private static int age_checker(int y, int m, int d) {
//        Calendar cal = new GregorianCalendar(y, m, d);
//        Calendar now = new GregorianCalendar();
//
//        int age_result = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
//        if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
//                || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH)
//                && cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
//            age_result--;
//        }
//        return age_result;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        char ch;
//        do {
//            int month = 0, day = 0, year = 0;
//            System.out.println();
//            System.out.print("\t Age Checker Program ");
//            System.out.println("\n");
//            System.out.print("Enter Birth Month : ");
//            month = input.nextInt();
//            System.out.print("Enter Birth Day: ");
//            day = input.nextInt();
//            System.out.print("Enter Birth Year : ");
//            year = input.nextInt();
//            System.out.println("\nYour present age is "
//                    + age_checker(year, month, day) + " years old.");
//            System.out.println();
//            System.out.print("\nDo you want to continue (Type y or n) : ");
//            ch = input.next().charAt(0);
//        } while (ch == 'Y' || ch == 'y');
//        System.out.println();
//        System.out.print("\t THANK YOU FOR USING THIS PROGRAM");
//        System.out.println("\n\n");
//    }
//}
