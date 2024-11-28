package com.miguel.motoalejo.repositories;

import com.miguel.motoalejo.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
