package my.movies.project.controller;

import my.movies.project.model.Movie;
import my.movies.project.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MovieController {

    @Autowired
    public MovieService movieService;

    @RequestMapping(value = "/")
    public String index(ModelMap model) {
        model.addAttribute("allMovies", movieService.getAllMovies());
        return "index";
    }

    @RequestMapping(value = "/addMovie")
    public String getAddMovie() {
        return "add";
    }

    @RequestMapping(value = "/addMovie", method = RequestMethod.POST)
    public String addMovie(Movie movie) {
        movieService.add(movie);
        return "redirect:/";
    }


    @RequestMapping(value = "/updateMovie/{id}")
    public String getUpdateMovie(@PathVariable("id") Long id, Model model, Movie movie) {
        movieService.getMovie(id);
        model.addAttribute(movie);
        return "edit";

    }


    @RequestMapping(value = "/updateMovie", method = RequestMethod.POST)
    public String updateMovie(Movie movie) {
        movieService.update(movie);
        return "redirect:/";
    }


    @RequestMapping(value = "/deleteMovie/{id}", method = RequestMethod.GET)
    public String deleteMovie(@PathVariable("id") Long id, Model model, Movie movie) {
        movieService.delete(id);
        model.addAttribute(movie);
        return "redirect:/";
    }


}
