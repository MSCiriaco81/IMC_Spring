package br.gov.br.cps.diadema.springprimeiroprojeto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class appController {

    @GetMapping("/imc/{peso}/{altura}/{idade}")
    public String imc(@PathVariable String peso, @PathVariable String altura, @PathVariable String idade, ModelMap model){
        double pesoDouble = Double.parseDouble(peso);
        double alturaDouble = Double.parseDouble(altura);

        double imc = pesoDouble / (alturaDouble * alturaDouble);

        String imcFormatado = String.format("%.2f", imc);

        if(imc < 18.5){
            model.addAttribute("resultado", "magreza");
        }else if(imc < 24.9){
            model.addAttribute("resultado", "normal");
        }else if(imc <29.9){
            model.addAttribute("resultado", "sobrepeso");
        }else if(imc < 39.9){
            model.addAttribute("resultado", "obesidade");
        }else{
            model.addAttribute("resultado", "obesidade grave");
        }

        model.addAttribute("peso", peso);
        model.addAttribute("altura", altura);
        model.addAttribute("idade", idade);
        model.addAttribute("imc", imcFormatado);
        return "imc";
    }

}
