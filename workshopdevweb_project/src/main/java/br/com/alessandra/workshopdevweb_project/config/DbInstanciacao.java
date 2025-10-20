package br.com.alessandra.workshopdevweb_project.config;

import br.com.alessandra.workshopdevweb_project.domain.Livro;
import br.com.alessandra.workshopdevweb_project.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DbInstanciacao implements CommandLineRunner {

    @Autowired
    private LivroRepository livroRepository;

    @Override
    public void run(String... args) throws Exception {
        this.livroRepository.deleteAll();

        Livro livro1 = new Livro(null, "Admirável mundo novo", "Aldous Huxley", "lido");
        Livro livro2 = new Livro(null, "Laranja mecânica", "Anthony Burgess", "lido");
        Livro livro3 = new Livro(null, "algum livro", "algum autor", ":D");

        this.livroRepository.saveAll(Arrays.asList(livro1, livro2, livro3));
    }
}
