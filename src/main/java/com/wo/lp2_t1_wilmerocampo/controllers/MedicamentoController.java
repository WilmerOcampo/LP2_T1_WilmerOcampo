package com.wo.lp2_t1_wilmerocampo.controllers;

import com.wo.lp2_t1_wilmerocampo.entities.Medicamento;
import com.wo.lp2_t1_wilmerocampo.repositories.IMedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/", "/medicamentos"})
public class MedicamentoController {

    @Autowired
    private IMedicamentoRepository repos;

    @GetMapping({"/", "/medicamentos"})
    public String listMedicamentos(Model model) {
        List<Medicamento> medicamentos = repos.findAll();
        model.addAttribute("medicamentos", medicamentos);
        return "medicamentos";
    }

    @GetMapping("/new")
    public String newMedicamento(Model model) {
        model.addAttribute("medicamento", new Medicamento());
        return "new-medicamento";
    }

    @PostMapping("/save")
    public String saveMedicamento(@ModelAttribute Medicamento medicamento) {
        repos.save(medicamento);
        return "redirect:/medicamentos/";
    }

    @GetMapping("/edit/{id}")
    public String editMedicamento(@PathVariable Integer id, Model model) {
        Medicamento medicamento = repos.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID del medicamento no válido"));
        model.addAttribute("medicamento", medicamento);
        return "edit-medicamento";
    }

    @GetMapping("/delete/{id}")
    public String deleteMedicamento(@PathVariable Integer id) {
        repos.deleteById(id);
        return "redirect:/medicamentos/";
    }

}
