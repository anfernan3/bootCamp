package com.example.application.resources;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.dtos.RentalDTOdetalles;
import com.example.application.dtos.RentalShortDTO;
import com.example.domains.contracts.services.RentalService;
import com.example.domains.entities.Rental;
import com.example.exceptions.NotFoundException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/rental")
@Api(value = "/rental", description = "Mantenimiento de alquileres", produces = "application/json, application/xml", consumes="application/json, application/xml")
public class RentalResource {

	@Autowired
	private RentalService srv;
	
	@GetMapping
	@ApiOperation(value = "Listado de alquileres")
	@Transactional
	public List<RentalShortDTO> getAll(){
		return srv.getByProjection(RentalShortDTO.class);
	}
	
	@GetMapping(path = "/api/rental/{id}")
	public Rental getOne(@PathVariable int id) throws NotFoundException{
		return srv.getOne(id);
	}
}
