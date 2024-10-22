package com.nit.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {
	
	@ExceptionHandler(value=ArrayIndexOutOfBoundsException.class)
	public String handelRunTimeException(ArrayIndexOutOfBoundsException ex,Model model) {
		log.info("Entered into handleRunTimeException() method..");
		model.addAttribute("errorMessage",ex.getMessage());
		return "error";
	}
	@ExceptionHandler(value=NumberFormatException.class)
	public String handelRunTimeException(NumberFormatException ex,Model model) {
		log.info("Entered into handleRunTimeException() method..");
		model.addAttribute("errorMessage",ex.getMessage());
		return "error";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handelRunTimeException(Exception ex,Model model) {
		log.info("Entered into handleRunTimeException() method..");
		model.addAttribute("errorMessage",ex.getMessage());
		return "error";
	}
	
	

}
