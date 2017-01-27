package cc.code;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Relatório de pessoas
 * @author Deus
 */
public class report_de_pessoas {
	/**
	 * a string para somar todos os nomes na lista 
	 */
	static String _s;
	
	public report_de_pessoas() {
		_s = null;
	}
	
	/**
	 * imprime a lista de pessoas
	 * @param paramL
	 */
	public static void print_e_vai(Vector paramL){
		
		for (int i = 0; i < paramL.size(); i++) {
			
			Pessoa p = (Pessoa) paramL.get(i);
			ValidationHaduken validador = new ValidationHaduken();
			List<String> erro = validador.validaPessoa(p);
			
			if(!erro.isEmpty())
				continue;
			
			concatenaPessoa(p, null);			
		}
		//remove first comma
		//_s = _s.substring(2); 
		System.out.print(_s);
	}

	public static void concatenaPessoa(Pessoa p, String nomeLista) {
		if(_s == null)
			_s = p.name;
		else			
			_s += ", " + p.name;
	}
	
	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		
		Pessoa p = new Pessoa();
		p.name = "Guilherme";
		p.cpf = "0023334467";
		ArrayList<String> danielTelefonesFixos = new ArrayList<String>();
		danielTelefonesFixos.add("8765343");
		p.telefonesCelulares = danielTelefonesFixos;
		v.add(p);
		
		print_e_vai(v);
		
	}

}

 class Pessoa{
	String name;
	String cpf;
	int idade;
	List<String> telefonesFixos;
	List<String> telefonesCelulares;
}