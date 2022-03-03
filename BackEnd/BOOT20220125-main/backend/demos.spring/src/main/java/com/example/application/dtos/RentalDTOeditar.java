package com.example.application.dtos;

import java.util.Date;
import java.util.List;


import com.example.domains.entities.Customer;
import com.example.domains.entities.Inventory;
import com.example.domains.entities.Payment;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class RentalDTOeditar {
		
	@JsonProperty("id")
	private int rentalId;	
	@JsonProperty("fecha alquiler")
	private Date rentalDate;	
	@JsonProperty("fecha devolucion")
	private Date returnDate;			
	@JsonProperty("id inventario")
	private int inventoryId;
	@JsonProperty("id cliente")
	private int customerId;	
	@JsonProperty("id empleados")
	private int staffId;
	@JsonProperty("pagos")
	private List<Integer> payments;
	

	
	public static Rental from(RentalDTOeditar source) {
		return new Rental(
				source.getRentalId(),
				source.getRentalDate(),
				source.getReturnDate(),
				new Customer (source.getCustomerId()),
				new Inventory (source.getInventoryId()),								
				new Staff (source.getStaffId())				
				);
	}
	
	public static RentalDTOeditar from(Rental source) {
		return new RentalDTOeditar(
				source.getRentalId(), 
				source.getRentalDate(),
				source.getReturnDate(),
				source.getCustomer().getCustomerId(),
				source.getInventory().getInventoryId(),				
				source.getStaff().getStaffId(),
				source.getPayments().stream().map(item -> item.getPaymentId()).toList()
				);
	}
	
	public Rental update(Rental target) {
		target.setRentalDate(rentalDate);
		target.setReturnDate(returnDate);
		
		//borra los pagos que sobran
		var delAlquiler = target.getPayments().stream()
				.filter(item -> !payments.contains(item.getPaymentId()))
				.toList();
		delAlquiler.forEach(item -> target.removePayment(item));
		
		//añade pagos
		payments.stream()
			.filter(idPaymentDTO -> !target.getPayments().stream().anyMatch(payments -> payments.getPaymentId() == idPaymentDTO))
			.forEach(idPaymentDTO -> target.addPayment(new Payment(idPaymentDTO)));		
		
		return target;
		
	}
}
