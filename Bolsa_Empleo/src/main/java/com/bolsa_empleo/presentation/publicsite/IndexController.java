package com.bolsa_empleo.presentation.publicsite;

import com.bolsa_empleo.service.TrabajoService;
import com.bolsa_empleo.logic.Trabajo;
import com.bolsa_empleo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private TrabajoService trabajoService;

    @Autowired
    private UserService userService;

    // Metodo para la página principal: carga los 5 últimos trabajos
    @GetMapping("/")
    public String index(Model model) {
        List<Trabajo> trabajos = trabajoService.trabajosFindAll();

        // Cargar solo los 5 últimos trabajos (en orden descendente por fecha o alguna otra lógica)
        model.addAttribute("trabajos", trabajos.subList(0, Math.min(5, trabajos.size())));

        return "index";  // El HTML que se renderiza (index.html)
    }
}
