package com.input.output.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.input.output.request.PersonalIngo;
import com.input.output.response.Ticket;

@RestController
public class MyControler {

	@PostMapping(value = "/ticket", produces = { "application/json" }, consumes = { "application/json" })
	public Ticket information(@RequestBody PersonalIngo info) {

		Ticket ticket = new Ticket();
		ticket.setFullName(info.getFirstName() + " " + info.getLastName());
		ticket.setJournyDate(new Date());
		ticket.setPrice(info.getPrice());
		ticket.setTrainNo(info.getTrainNumber());
		ticket.setTo(info.getTo());
		ticket.setFrom(info.getFrom());
		ticket.setTicketNo("IN-234598S");

		return ticket;
	}

}
