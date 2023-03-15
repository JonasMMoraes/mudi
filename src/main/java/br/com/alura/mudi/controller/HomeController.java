package br.com.alura.mudi.controller;

import br.com.alura.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Xiaomi Redmi Note 11 Pro");
        pedido.setUrlProduto("https://www.amazon.com.br/Xiaomi-Branco-Smartphone-Telefone-Celular/dp/B09TP2JKKP/ref=sr_1_2_sspa?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=13YSNXHY7SJ06&keywords=xiaomi+11&qid=1678821697&sprefix=" + "xiami+1%2Caps%2C269&sr=8-2-spons&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147&psc=1&spLa" + "=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzOFAyRVhYT1VYM1I2JmVuY3J5cHRlZElkPUEwMzA3OTI3MzhMOE5KNkQxUDcwQiZlbmNyeXB0ZWRBZElkPUEwMTY1MjY4M1U4S09ZSVpYVFRJNiZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/51yn4p3uIHL._AC_SX679_.jpg");
        pedido.setDescricao("Uma descricao qualquer para o pedido");

        List<Pedido> pedidos = Arrays.asList(pedido);

        model.addAttribute("pedidos", pedidos);

        return "home";
    }


}
