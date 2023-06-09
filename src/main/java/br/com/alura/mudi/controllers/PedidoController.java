package br.com.alura.mudi.controllers;

import br.com.alura.mudi.dto.RequisicaoNovoPedido;
import br.com.alura.mudi.models.Pedido;
import br.com.alura.mudi.repositories.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping(value = "formulario")
    public String formulario(RequisicaoNovoPedido requisicaoNovoPedido) {
        return "/pedido/formulario";
    }

    @PostMapping(value = "novo")
    public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
        if (result.hasErrors()) {
            return "pedido/formulario";
        }

        Pedido pedido = requisicao.toPedido();
        pedidoRepository.save(pedido);
        return "redirect:/home";

    }

}
