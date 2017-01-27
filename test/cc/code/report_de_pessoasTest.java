package cc.code;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class report_de_pessoasTest {

	@Test
	public void deveFazerConcatenaPessoa() {
		report_de_pessoas report = new report_de_pessoas();
		
		Pessoa p = new Pessoa();
		p.name = "Juarez";
		String _s = null;
		_s = report_de_pessoas.concatenaNomePessoa(p, _s);
		
		assertEquals("Juarez", _s);
	}
	
	@Test
	public void devePrintarNomesConcatenatos() {
		
	}
	
	@Test
	public void deveConcatenarMaisDeUmaPessoa() {
		report_de_pessoas report = new report_de_pessoas();

		String _s = null;
		
		Pessoa p = new Pessoa();
		p.name = "Juarez";
		_s = report.concatenaNomePessoa(p, null);		
		
		Pessoa p2 = new Pessoa();
		p2.name = "Balboa";
		_s = report.concatenaNomePessoa(p2, _s);
		
		assertEquals("Juarez, Balboa", _s);
	}
}
