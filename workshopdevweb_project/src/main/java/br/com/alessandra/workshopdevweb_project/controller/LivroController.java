package br.com.alessandra.workshopdevweb_project.controller;

import br.com.alessandra.workshopdevweb_project.domain.Livro;
import br.com.alessandra.workshopdevweb_project.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping("/criar")
    public String criar(){
        return "criar";

    }

    @PostMapping("/criar")
    public String cadastrarLivro(Livro livro){
        this.livroService.criar(livro);
        return "redirect:/listar";
    }

    @GetMapping("/listar")
    public ModelAndView listarLivros(){
        ModelAndView mv = new ModelAndView("listaLivro");
        mv.addObject("livros", this.livroService.buscarTodos());
        return mv;
    }
}
