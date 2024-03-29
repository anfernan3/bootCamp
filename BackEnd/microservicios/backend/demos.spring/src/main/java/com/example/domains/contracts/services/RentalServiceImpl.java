package com.example.domains.contracts.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.domains.contracts.repositories.RentalRepository;
import com.example.domains.entities.Rental;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

@Service
public class RentalServiceImpl implements RentalService {

	private RentalRepository dao;

	public RentalServiceImpl(RentalRepository dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Rental> getAll() {
		return dao.findAll();
	}
	
	@Override
	public Iterable<Rental> getAll(Sort sort) {
		return dao.findAll(sort);
	}
	@Override
	public Page<Rental> getAll(Pageable pageable) {
		return dao.findAll(pageable);
	}
	
	@Override
	public <T> List<T> getByProjection(Class<T> type) {
		return dao.findByRentalIdIsNotNull(type);
	}

	@Override
	public <T> Iterable<T> getByProjection(Sort sort, Class<T> type) {
		return dao.findByRentalIdIsNotNull(sort, type);
	}

	@Override
	public <T> Page<T> getByProjection(Pageable pageable, Class<T> type) {
		return dao.findByRentalIdIsNotNull(pageable, type);
	}

	@Override
	public Rental getOne(Integer id) throws NotFoundException {
		var item = dao.findById(id);
		if(item.isEmpty())
			throw new NotFoundException();
		return item.get();
	}
	
	@Override
	public Rental add(Rental item) throws DuplicateKeyException, InvalidDataException {
		if(item == null)
			throw new IllegalArgumentException();
		if(dao.findById(item.getRentalId()).isPresent())
			throw new DuplicateKeyException();
		if(item.isInvalid())
			throw new InvalidDataException(item.getErrorsMessage());
		return dao.save(item);
	}
	@Override
	public Rental change(Rental item) throws NotFoundException, InvalidDataException  {
		if(item == null)
			throw new IllegalArgumentException();
		if(dao.findById(item.getRentalId()).isEmpty())
			throw new NotFoundException();
		if(item.isInvalid())
			throw new InvalidDataException(item.getErrorsMessage());
		return dao.save(item);
	}
	@Override
	public void delete(Rental item) {
		if(item == null)
			throw new IllegalArgumentException();
		deleteById(item.getRentalId());
		
	}
	@Override
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}
}
