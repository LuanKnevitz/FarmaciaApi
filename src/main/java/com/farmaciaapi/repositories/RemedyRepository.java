package com.farmaciaapi.repositories;

import com.farmaciaapi.domain.Remedy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemedyRepository extends JpaRepository <Remedy,Integer> {

}
