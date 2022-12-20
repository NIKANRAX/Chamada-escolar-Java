import java.util.List;

public class Presenca {
	
	private String dia;
	private List<Alunos> alunos;
	
	public Presenca (String dia, List<Alunos>alunos) {
		this.alunos = alunos;
		this.dia = dia;
	}
	
	public String getDia() {
		return dia;
	}
	
	public List<Alunos> getAlunos(){
		return alunos;
	}
}
