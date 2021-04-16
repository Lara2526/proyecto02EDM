package ar.edu.unju.edm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ProductoController {
	
	
		
		@Autowired
		ProductoController unProducto;
		
		@GetMapping("/producto")
		public String cargarProducto(Model model) {
			model.addAttribute("unProducto", unProducto);
			return("producto");

		}

	}


