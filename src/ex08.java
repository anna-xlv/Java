import java.util.ArrayList;
import java.util.Arrays;

public class ex08 {
    public static void main(String[] args){
        String[] disciplinas = {"matemática", "filosofia", "história", "física"};
        ArrayList<String> novalista = new ArrayList<String>(Arrays.asList(disciplinas));
        novalista.add("geografia");
        novalista.add("língua inglesa");

        for(String i: novalista){
            System.out.println("Disciplinas " +i   );
        }
    }
}
