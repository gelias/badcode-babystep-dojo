package cc.code;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Relat√≥rio de pessoas
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
			
			_s = concatenaNomePessoa(p, null);
		}
		//remove first comma
		//_s = _s.substring(2); 
		System.out.print(_s);
	}
	

	public static String concatenaNomePessoa(Pessoa p, String nomeLista) {
		if(nomeLista == null)
			nomeLista = p.name;
		else			
			nomeLista += ", " + p.name;
		return nomeLista;
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
		
		Pessoa p2 = new Pessoa();
		p2.name = "Jo„o";
		p2.cpf = "123123123";
		ArrayList<String> joaoTelefonesFixos = new ArrayList<String>();
		joaoTelefonesFixos.add("98765135");
		p2.telefonesCelulares = joaoTelefonesFixos;
		v.add(p2);
		
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