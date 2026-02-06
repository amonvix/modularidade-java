package com.amon.app.calculo;

import com.amon.app.Calculadora;
import com.amon.app.calculo.interno.OperacoesAritimeticas;
import com.amon.app.logging.logger;

public class CalculadoraImpl implements Calculadora{
	
	
	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	public double soma(double... nums) {
		logger.info("Somando...");
		return opAritimeticas.soma(nums);
	}
}
