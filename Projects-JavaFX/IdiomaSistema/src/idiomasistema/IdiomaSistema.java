package idiomasistema;
import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
       Locale loc = Locale.getDefault();
        System.out.println("A linguagem do sistema é:");
        System.out.println(loc.toString());
        System.out.println(loc.getDisplayLanguage());
    }
}
