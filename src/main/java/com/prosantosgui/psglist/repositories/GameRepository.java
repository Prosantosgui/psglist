package com.prosantosgui.psglist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prosantosgui.psglist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
