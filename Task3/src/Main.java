import java.util.Scanner;

public class Main {
    public static final String VALID = "((([А-я]+)|([А-я-]+))\\s){2}(([А-я]+)|([А-я-]+))";
    public static void main(String[] args) {
        System.out.println("Аты-жөніңізді жазыңыз: ");
        String info = new Scanner(System.in).nextLine().trim();

        if(info.matches(VALID)){
            String[] split = info.split("\\s+");
            System.out.println("Тегіңіз: " + split[0]);
            System.out.println("Есіміңіз: " + split[1]);
            System.out.println("Әкеңіздің есімі: " + split[2]);
        } else {
            System.out.println("Қате тердіңіз");
        }
    }
}