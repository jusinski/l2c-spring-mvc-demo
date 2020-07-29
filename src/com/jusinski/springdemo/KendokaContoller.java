package com.jusinski.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kendoka")
public class KendokaContoller {

    public String showForm(Model theModel){

        Kendoka theKendoka = new Kendoka();
        theModel.addAttribute("kendoka", theKendoka);

        return "kendoka-form";
    }


}
