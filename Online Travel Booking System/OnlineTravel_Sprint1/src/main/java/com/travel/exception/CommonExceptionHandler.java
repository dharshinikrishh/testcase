package com.travel.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<AllExceptionDTO> vvhjfhj(javax.persistence.EntityNotFoundException e)
	{
		
		System.out.println(" ------------- inside --- @Controller Advice Not Found Exception ----");
		
		AllExceptionDTO dto = new AllExceptionDTO();
		
		dto.setMessage(e.getLocalizedMessage());
		
		
		return new ResponseEntity<AllExceptionDTO>(dto, HttpStatus.BAD_REQUEST);
	}

}
