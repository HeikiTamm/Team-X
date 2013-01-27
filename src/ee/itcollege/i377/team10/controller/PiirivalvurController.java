package ee.itcollege.i377.team10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.lang.String;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import ee.itcollege.i377.team10.entity.Piirivalvur;

@Controller
public class PiirivalvurController {
    
	@RequestMapping(value="/piirivalvur/add")
    public String form(Model uiModel) {
		uiModel.addAttribute("piirivalvur", new Piirivalvur());
        return "piirivalvur/form";
    }
}
