package liming.maven.example.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * git提交测试----
 * @author phantomes
 *
 */
@Controller
public class GeneralController {

	@RequestMapping(value="index.html")
	public void index_jsp(Model model){
		model.addAttribute("liming", "黎明你好");
		System.out.println("index.jsp");
	}
}
