//package korttiohjelmisto.controller;
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import korttiohjelmisto.bean.Osoite;
//import korttiohjelmisto.dao.OsoiteDAO;
//
//
//@Controller
//@RequestMapping (value="/")
//public class OsoiteController {
//	
//	@Inject
//	private OsoiteDAO dao;
//
//	public OsoiteDAO getDao() {
//		return dao;		
//	}
//	
//	public void setDao(OsoiteDAO dao) {
//		this.dao = dao;
//	}
//	
//	//talleta
//	@RequestMapping(method=RequestMethod.POST, params = { "talleta" })
//	public String talleta(@ModelAttribute(value="osoite") Osoite osoite) {
//		dao.talleta(osoite);
//		return "redirect:/";
//	}
//	
//	//muokkaa
//	@RequestMapping(method=RequestMethod.POST, params = { "muokkaa" })
//	public String muokkaa(@ModelAttribute(value="osoite") Osoite osoite) {
//		dao.muokkaa(osoite);
//		return "redirect:/";
//	}
//	
//	//poista
//	@RequestMapping(method=RequestMethod.POST, params = { "poista" })
//	public String poista(@ModelAttribute(value="osoite") Osoite osoite) {
//		dao.poista(osoite);
//		return "redirect:/";
//	}
//	
//	//hae kaikki
//	@RequestMapping(method=RequestMethod.GET)
//	public String getList(Model model) {
//		List<Osoite> osoitteet = dao.haeKaikki();
//		model.asMap().clear();
//		model.addAttribute("osoitteet", osoitteet);
//		return "index";
//	}
//	
//}
