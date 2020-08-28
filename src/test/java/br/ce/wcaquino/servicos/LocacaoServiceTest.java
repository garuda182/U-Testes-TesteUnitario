package br.ce.wcaquino.servicos;


import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	
	@Test
	public void teste() {

		// cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario1 = new Usuario("Carlos");
		Filme filme1 = new Filme("Titanic", 1, 2.00);

		// acao

		Locacao locacao = service.alugarFilme(usuario1, filme1);

		// verificacao

		Assert.assertEquals(2.0, locacao.getValor(), 0.01);
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));

		// alugarFilme(usuario1, filme1).setValor(3.00);

	}
}
