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
		
		report_de_pessoas.concatenaPessoa(p);
		
		assertEquals("Juarez", report_de_pessoas._s);
	}
}
