package it.sincrono.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController
{
	@RequestMapping("ciccio")
	public String getSecondaPagina(Model m)
	{
	
		m.addAttribute("valore",100);
		return "other/seconda";
	}
}
