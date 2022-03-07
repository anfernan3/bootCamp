package com.example.application.dtos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

import com.example.domains.entities.Customer;
import com.example.domains.entities.Inventory;
import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class RentalShortDTO {

	@JsonProperty("id")
	private int rentalId;
	@JsonProperty("FechaAlquiler")
	private Date rentalRate;
	@JsonProperty("Titulo")
	private String title;
	@JsonProperty("Cliente")
	private String customer;

	public static RentalShortDTO from(Rental source) {
		return new RentalShortDTO(source.getRentalId(), source.getRentalDate(),
				source.getCustomer().getFirstName() + " " + source.getCustomer().getLastName(),
				source.getInventory().getFilm().getTitle());
	}
}
