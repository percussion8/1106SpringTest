package com.Spring1106.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Spring1106.domain.JuminVO;
import com.Spring1106.service.JuminService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/jumin/*")
@AllArgsConstructor
public class JuminController {
	private JuminService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("jumin", service.getList());
	}
	
	@GetMapping("/search")
	public void search() {}
	
	@GetMapping("/area")
	public void searchArea(@RequestParam("area") String paddress, Model model) {
		model.addAttribute("areaJumin", service.getArea(paddress));
		model.addAttribute("areaName", paddress);
	}
	
	@GetMapping("/register")
	public void register() {}
	
	@PostMapping("/register")
	public String register(JuminVO jumin, RedirectAttributes rttr) {
		service.register(jumin);
		rttr.addFlashAttribute("result", jumin.getMpno());
		return "redirect:/jumin/list";
	}
	
	@GetMapping("/update")
	public void update(@RequestParam("no") int mpno, Model model) {
		model.addAttribute("juminSelect", service.getOne(mpno));
		
	}
	
	@PostMapping("/update")
	public String update(JuminVO jumin, RedirectAttributes rttr) {
		if(service.modify(jumin)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/jumin/list";
	}
	
	@GetMapping("/delete")
	public String remove(@RequestParam("no") int mpno, RedirectAttributes rttr) {
		if(service.remove(mpno)) {
			rttr.addFlashAttribute("result", "succees");
		}
		return "redirect:/jumin/list";
	}
	
	
}


