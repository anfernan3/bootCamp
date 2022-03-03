//package com.example.application.resources;
//
//import java.net.URI;
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import com.example.application.dtos.PaisDTO;
//import com.example.domains.contracts.services.FilmService;
//import com.example.exceptions.DuplicateKeyException;
//import com.example.exceptions.InvalidDataException;
//import com.example.exceptions.NotFoundException;
//
//
//
//@RestController
//@RequestMapping("/api/peliculas")
//public class FilmResource {
//	
//	@Autowired
//	private FilmService srv;
//	
//	@GetMapping
//	public List<FilmDTO> getAll() {
//		return srv.getByProjection(FilmDTO.class);
//	}
//
//	@GetMapping(path = "/{id}")
//	public FilmDTO getOne(@PathVariable int id) throws NotFoundException {
//		return FilmDTO.from(srv.getOne(id));
//	}
//	
//	@PostMapping
//	public ResponseEntity<Object> create(@Valid @RequestBody FilmDTO item) throws InvalidDataException, DuplicateKeyException {
//		var entity = FilmDTO.from(item);
//		if(entity.isInvalid())
//			throw new InvalidDataException(entity.getErrorsMessage());
//		entity = srv.add(entity);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//			.buildAndExpand(entity.getCountryId()).toUri();
//		return ResponseEntity.created(location).build();
//
//	}
//
//	@PutMapping("/{id}")
//	@ResponseStatus(HttpStatus.ACCEPTED)
//	public void update(@PathVariable int id, @Valid @RequestBody FilmDTO item) throws InvalidDataException, NotFoundException {
//		if(id != item.getCountryId())
//			throw new InvalidDataException("No coinciden los identificadores");
//		var entity = FilmDTO.from(item);
//		if(entity.isInvalid())
//			throw new InvalidDataException(entity.getErrorsMessage());
//		srv.change(entity);
//	}
//
//	@DeleteMapping("/{id}")
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void delete(@PathVariable int id) {
//		srv.deleteById(id);
//	}
//
//}
