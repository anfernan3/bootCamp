package com.example.application.dtos;

import java.security.Timestamp;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;

import com.example.domains.entities.Customer;
import com.example.domains.entities.Inventory;
import com.example.domains.entities.Payment;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class RentalDTOdetalles {

	@JsonProperty("id")
	@ApiModelProperty(value = "id del alquiler")
	private int rentalId;
	@JsonProperty("fecha alquiler")
	@ApiModelProperty(value = "fecha del alquiler")
	private Date rentalDate;
	@JsonProperty("fecha devolucion")
	@ApiModelProperty(value = "fecha devolucion")
	private Date returnDate;
	@JsonProperty("id inventario")
	@ApiModelProperty(value = "id de inventario")
	private int inventoryId;
	@JsonProperty("id cliente")
	@ApiModelProperty(value = "id cliente")
	private int customerId;
	@JsonProperty("id empleados")
	@ApiModelProperty(value = "id empleados")
	private int staffId;
	@JsonProperty("pagos")
	@ApiModelProperty(value = "lista de pagos")
	private List<Integer> payments;

	public static Rental from(RentalDTOdetalles source) {
		return new Rental(source.getRentalId(), source.getRentalDate(), source.getReturnDate(),
				new Customer(source.getCustomerId()), new Inventory(source.getInventoryId()),
				new Staff(source.getStaffId()));
	}

	public static RentalDTOdetalles from(Rental source) {
		return new RentalDTOdetalles(source.getRentalId(), source.getRentalDate(), source.getReturnDate(),
				source.getCustomer().getCustomerId(), source.getInventory().getInventoryId(),
				source.getStaff().getStaffId(),
				source.getPayments().stream().map(item -> item.getPaymentId()).toList());
	}
}
