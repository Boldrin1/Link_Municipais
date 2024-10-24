package com.one.main.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.one.main.model.Bmgs;
import com.one.main.repository.BmgRepository;

@Service
public class BmgsService {

	private BmgRepository bmgRepository;
	
	public Optional<Bmgs> findBmgById(Long id) {
		return bmgRepository.findById(id);
	}
}
