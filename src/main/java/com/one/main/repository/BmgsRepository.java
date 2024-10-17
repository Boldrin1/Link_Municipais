package com.one.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.main.model.Bmgs;

@Repository
public interface BmgsRepository extends JpaRepository<Bmgs,Long>{

}
