package com.estudo.estudo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jardel
 */
@Controller
public class TituloController {

    @RequestMapping("/titulos/novo")
    public String novo() {
        return "CadastroTitulo";
    }

}
