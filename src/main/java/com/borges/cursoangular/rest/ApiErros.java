package com.borges.cursoangular.rest;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiErros {

	private List<String> error;

	public ApiErros(String message) {
		this.error = Arrays.asList(message);
	}

}
