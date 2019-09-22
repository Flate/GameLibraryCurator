package eu.flate.glc.api.web;

import eu.flate.glc.api.exceptions.ResourceNotFoundException;
import eu.flate.glc.api.model.Game;
import eu.flate.glc.api.repository.GameRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {

    private final GameRepository gameRepository;

    public GameController(final GameRepository gameRepository) {this.gameRepository = gameRepository;}

    @GetMapping("/{gameId}")
    public Game getGame(@PathVariable long gameId) {
        return gameRepository.findById(gameId)
                             .orElseThrow(() -> new ResourceNotFoundException("Game not found with id " + gameId));
    }

    @PostMapping()
    public Page<Game> getGames(Pageable pageable) {
        return gameRepository.findAll(pageable);
    }

    @PutMapping("/{gameId}")
    public Game updateGame(@PathVariable long gameId,
                           @Valid @RequestBody Game gameRequest) {
        return gameRepository.findById(gameId)
                             .map(game -> {
                                 game.setName(gameRequest.getName());
                                 return gameRepository.save(game);
                             })
                             .orElseThrow(() -> new ResourceNotFoundException("Game not found with id " + gameId));
    }

    @DeleteMapping("/{gameId}")
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
