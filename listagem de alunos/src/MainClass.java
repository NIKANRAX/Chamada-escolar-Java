
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Aluno nicolas = new Aluno("Nicolas");
        Aluno anna = new Aluno("Anna");
        Aluno edina = new Aluno("Édina");
        Aluno wilian = new Aluno("Wilian");

        List<Aluno> chamada1 = List.of(nicolas, anna, wilian,edina);
        List<Aluno> chamada2 = List.of(nicolas, anna);
        List<Aluno> chamada3 = List.of(anna, wilian,edina);
        List<Aluno> chamada4 = List.of(nicolas, wilian,edina);

        Presenca presenca1 = new Presenca("01/03/2023",chamada1);
        Presenca presenca2 = new Presenca("02/03/2023",chamada2);
        Presenca presenca3 = new Presenca("03/03/2023",chamada3);
        Presenca presenca4 = new Presenca("04/03/2023",chamada4);

        Map<String, Presenca> chamadas = new HashMap<>();

        chamadas.put("01/03/2023", presenca1);
        chamadas.put("02/03/2023", presenca2);
        chamadas.put("03/03/2023", presenca3);
        chamadas.put("04/03/2023", presenca4);


    }
}
