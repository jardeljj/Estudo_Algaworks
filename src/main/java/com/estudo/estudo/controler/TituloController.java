package com.estudo.estudo.controler;

import com.estudo.estudo.Model.Titulo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jardel
 */
@Controller
@RequestMapping("/titulos")
public class TituloController {

    @RequestMapping("/novo")
    public String novo() {
        return "CadastroTitulo";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String salvar(Titulo titulo){
        
        System.out.println(">>> " + titulo.getDescricao());
        
        return "CadastroTitulo";
    }
    
}
