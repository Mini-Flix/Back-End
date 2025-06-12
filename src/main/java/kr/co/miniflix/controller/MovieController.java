package kr.co.miniflix.controller;

import java.util.List;
import kr.co.miniflix.domain.Movie;
import kr.co.miniflix.service.MovieService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable(name = "id") Long id) {
        return movieService.getMovieById(id);
    }
}
