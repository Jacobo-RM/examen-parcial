package es.cic.ejercicio4examen.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/api/cine")
@RestController
public class PeliculasController {
    
    @Autowired
    private PeliculasService peliculasService;

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculasService.getPeliculas();
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculasById(@PathVariable("id") int id){
        return peliculasService.getPeliculaById(id);
    }

}
