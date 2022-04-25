package com.input.output.response;

import java.util.Date;

import lombok.Data;

@Data
public class Ticket {
	
	private String ticketNo ;
	private String price ;
	private String from ;
	private String to ;
	private String trainNo ;
	private Date journyDate ;
	private String fullName ;

	

}
