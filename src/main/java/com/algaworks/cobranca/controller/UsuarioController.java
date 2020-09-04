package com.algaworks.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.model.Usuario;
import com.algaworks.cobranca.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/Usuario")
	public ModelAndView novousuario() {
		ModelAndView modelAndView = new ModelAndView("CadastroUsuario");
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/salvarusuarios")
	public ModelAndView salvar(Usuario usuario) {
		usuarioRepository.save(usuario);
		
		ModelAndView modelAndView = new ModelAndView("CadastroUsuario");
		modelAndView.addObject("mensagem", "Usuário salvo com sucesso!");
		return modelAndView;
	}
}
