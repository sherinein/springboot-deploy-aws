package com.cts.renibuilders.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;

import com.cts.renibuilders.exception.InValidCityException;

@ControllerAdvice
public class GlobalExceptionHandler {

		@ResponseStatus(HttpStatus.BAD_REQUEST)
		@ExceptionHandler(InValidCityException.class)
		public ModelAndView handleInValidCityException(Exception exception) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("exception", exception);
			modelAndView.setViewName("error");
			return modelAndView;
		}
		
		
		
	}

