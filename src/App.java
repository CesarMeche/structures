import co.edu.co.st.SimpleList;
import model.PalindromValidator;

public class App {
    public static void main(String[] args) throws Exception {
        PalindromValidator m = new PalindromValidator();
        String palin = "radar./,/ o ,.radar";
        String notPalin = "radar ,. so radar";
        System.out.println(m.isPalindrom(notPalin));
        System.out.println(m.isPalindrom(palin));
        SimpleList sp= new SimpleList();
        
    }
}
