import com.castro.estrutura.vetor.Vetor;

public class Aula4Busca {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(4);
		
		vetor.adiciona("elemento1");
		vetor.adiciona("elemento2");
		vetor.adiciona("elemento3");
		vetor.adiciona("elemento4");
		
		System.out.println(vetor.busca(3));
	}

}
