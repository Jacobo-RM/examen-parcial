package es.cic.ejercicio4examen.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PeliculasService {

    private final PeliculasRepository peliculasRepository;
    private final DirectorRepository directorRepository;

    @Autowired
    public PeliculasService(PeliculasRepository peliculasRepository, DirectorRepository directorRepository) {
        this.peliculasRepository = peliculasRepository;
        this.directorRepository = directorRepository;
    }

    @Transactional(readOnly = true)
    public List<Pelicula> getPeliculas() {
        List<Pelicula> peliculas = peliculasRepository.findAll();
        return peliculas;
    }

    @Transactional(readOnly = true)
    public Pelicula getPeliculaById(int id){
        return peliculasRepository.findById(id).orElse(null);
    }


}