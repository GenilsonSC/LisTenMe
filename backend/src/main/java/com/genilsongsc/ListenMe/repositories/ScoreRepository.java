package com.genilsongsc.ListenMe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genilsongsc.ListenMe.entities.Score;
import com.genilsongsc.ListenMe.entities.ScorePK;

public interface ScoreRepository extends JpaRepository <Score, ScorePK> {

}
