package br.com.alessandra.workshopdevweb_project.service;

import br.com.alessandra.workshopdevweb_project.domain.Livro;
import br.com.alessandra.workshopdevweb_project.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> buscarTodos() {
        List<Livro> listaLivros = (List<Livro>) this.livroRepository.findAll();
        return listaLivros;
    }

    public Livro criar(Livro livro){
        return this.livroRepository.save(livro);
    }
}
