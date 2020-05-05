package mx.spechtech.ieatlt.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequestMapping(path = "/")
public class ControladorPrincipal {
    @Autowired

    @GetMapping(path = "/")
    public String index() {
        return "index";
    }
}
