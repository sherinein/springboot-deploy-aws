package org.hibernate.shopping.controller;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.shopping.entity.Product;
import org.hibernate.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	public Logger logger = Logger.getLogger(ProductController.class.getName());

	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String showIndexPage() {
		logger.info("=========showIndexPage() called==============");
		return "index";
	}

	@RequestMapping("/addproduct")
	public String showAddProductPage(@ModelAttribute("product") Product product) { // binding with controller to jsp page . product- empty object 
		logger.info("==========showAddProductPage===============");
		return "add-product";
	}

	@RequestMapping(value = "/addnewproduct", method = RequestMethod.POST)
	public String addNewProduct(@ModelAttribute("product") Product product,BindingResult result,Model model) { //product object having data -binding with jsp page to controller
		logger.info("==========addNewProduct===============");
		if (result.hasErrors()) {
			logger.info("==========Binding error===============");
			return "add-product";
		} else {
			logger.info("==========Binding success===============" + product.getProductName());
			productService.saveProduct(product); // calling service layer
				model.addAttribute("product", product); // display the result 
				return "success";
			
		}

	}

	@RequestMapping("/displayproduct")
	public ModelAndView showAllProduct() {
		logger.info("=========showAllProduct() called==============");
		List<Product> allproduct = productService.getProducts();
		ModelAndView modelAndView = new ModelAndView("view-product");
		modelAndView.addObject("productlist", allproduct);
		return modelAndView;

	}

	/*
	 * @GetMapping("/update") public String update(@RequestParam("productId") int
	 * pId, Model model) {
	 * 
	 * // get the product from our service Product product =
	 * productService.updateProduct(pId);
	 * 
	 * // set Product as a model attribute to pre-populate the form
	 * model.addAttribute("product", product);
	 * 
	 * // send over to our form return "redirect:/displayproduct"; }
	 */
	@GetMapping("/updateproduct")
	public String updateProduct(@RequestParam("productId") int pId,
									Model model) {
		
		// get the product from our service
		Product product = productService.getProduct(pId);
		
		// set Product as a model attribute to pre-populate the form
		model.addAttribute("product", product);
		
		// send over to our form		
		return "redirect:/displayproduct";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("productId") int pId) {
		
		// delete the customer
		productService.deleteProduct(pId);
						
		// send over to our form	
		return "redirect:/displayproduct";
	}

}
