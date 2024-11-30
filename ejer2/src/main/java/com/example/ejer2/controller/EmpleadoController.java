/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ejer2.controller;




import com.example.ejer2.model.Empleado;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author LAB_P03
 */
@Controller
public class EmpleadoController {
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "formulario_empleado";
    }

    @PostMapping("/resultado")
    public String procesarFormulario(Empleado empleado, Model model) {
        empleado.calcularSueldoTotal();
        model.addAttribute("empleado", empleado);
        return "resultado_empleado";
    }
}
