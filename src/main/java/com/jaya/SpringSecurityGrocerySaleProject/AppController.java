package com.jaya.SpringSecurityGrocerySaleProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@Autowired
	private SalesService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Sale> listItems = service.listAll();
		model.addAttribute("listItems", listItems);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewItemForm(Model model) {
		Sale sale = new Sale();
		model.addAttribute("sale", sale);
		
		return "new_product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveItem(@ModelAttribute("sale") Sale sale) {
		service.save(sale);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditItemForm(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_product");
		
		Sale sale = service.get(id);
		mav.addObject("sale", sale);
		
		return mav;
	}	
	
	@RequestMapping("/delete/{id}")
	public String deleteItem(@PathVariable(name = "id") Long id) {
		service.delete(id);
		
		return "redirect:/";
	}
}
