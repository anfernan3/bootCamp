package com.example.domains.contracts.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.domains.contracts.repositories.FilmRepository;
import com.example.domains.entities.Film;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

@Service
public class FilmServiceImpl implements FilmService {

	private FilmRepository dao;
	
	
	public FilmServiceImpl(FilmRepository dao) {
		super();
		this.dao = dao;
	}

	@Override
	public <T> List<T> getByProjection(Class<T> type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Iterable<T> getByProjection(Sort sort, Class<T> type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Page<T> getByProjection(Pageable pageable, Class<T> type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Film> getAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Film> getAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film getOne(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film add(Film item) throws DuplicateKeyException, InvalidDataException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film change(Film item) throws NotFoundException, InvalidDataException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Film item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
