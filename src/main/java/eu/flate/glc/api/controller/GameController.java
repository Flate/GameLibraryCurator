package eu.flate.glc.api.controller;

import eu.flate.glc.api.exceptions.ResourceNotFoundException;
import eu.flate.glc.api.model.Game;
import eu.flate.glc.api.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @PostMapping("/games")
    public Page<Game> getGames(Pageable pageable) {
        return gameRepository.findAll(pageable);
    }

    @PutMapping("/games/{gameId}")
    public Game updateGame(@PathVariable long gameId,
                           @Valid @RequestBody Game gameRequest) {
        return gameRepository.findById(gameId)
                             .map(game -> {
                                 game.setName(gameRequest.getName());
                                 return gameRepository.save(game);
                             })
                             .orElseThrow(() -> new ResourceNotFoundException("Game not found with id " + gameId));
    }

    @DeleteMapping("/games/{gameId}")
    public ResponseEntity<?> deleteGame(@PathVariable long gameId) {
        return gameRepository.findById(gameId)
                             .map(game -> {
                                 gameRepository.delete(game);
                                 return ResponseEntity.ok()
                                                      .build();
                             })
                             .orElseThrow(() -> new ResourceNotFoundException("Game not found with id " + gameId));
    }
}
