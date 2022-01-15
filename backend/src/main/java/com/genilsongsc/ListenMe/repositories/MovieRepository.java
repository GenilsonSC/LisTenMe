package com.genilsongsc.ListenMe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genilsongsc.ListenMe.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie, Long> {

}
