package com.example.domains.contracts.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domains.entities.Country;
import com.example.domains.entities.Rental;

public interface RentalRepository extends JpaRepository<Rental, Integer>{

	<T> List<T> findByRentalIdIsNotNull(Class<T> type);
	<T> Iterable<T> findByRentalIdIsNotNull(Sort sort, Class<T> type);
	<T> Page<T> findByRentalIdIsNotNull(Pageable pageable, Class<T> type);
}
