package com.example.blanket;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class BlanketController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/submission").setViewName("submission");
    }

    @GetMapping("/")
    public String showForm(BlanketInfo blanketInfo) {
        return "blanket";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid BlanketInfo blanketInfo, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "blanket";
        }

        return "redirect:/submission";
    }

    @GetMapping("/vejledning")
    public String vejledning() {
        return "vejledning";
    }
}
