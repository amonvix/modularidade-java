package com.amon.app.financeiro;

import java.util.ServiceLoader;

import com.amon.app.Calculadora;

public class Operation {

	public static void main(String[] args) {
		
		
		Calculadora calculadora = ServiceLoader.load(Calculadora.class).findFirst().get();
		
		System.out.println(calculadora.soma(3,5,8));
		
//		System.out.println(calculadora.soma(5,6,9,8));
	}
}
