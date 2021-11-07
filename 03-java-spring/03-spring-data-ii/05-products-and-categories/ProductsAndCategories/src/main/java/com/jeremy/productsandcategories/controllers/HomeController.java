package com.jeremy.productsandcategories.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeremy.productsandcategories.models.Categories_Products;
import com.jeremy.productsandcategories.models.Product;
import com.jeremy.productsandcategories.services.Categories_ProductsService;
import com.jeremy.productsandcategories.services.CategoryService;
import com.jeremy.productsandcategories.services.ProductService;

@Controller
public class HomeController {
	private final CategoryService categoryService;
	private final ProductService productService;
	private final Categories_ProductsService categories_ProductsService;
	
	public HomeController(CategoryService categoryService, ProductService productService, Categories_ProductsService categories_ProductsService) {
		this.categoryService = categoryService;
		this.productService = productService;
		this.categories_ProductsService = categories_ProductsService;
	}
	
	@RequestMapping("/products/new")
	public String enterProduct(Model model) {
		Product prod = new Product();
		model.addAttribute("product", prod);
		return "/pages/newProduct.jsp";
	}
	
	@RequestMapping(value="/products/new", method=RequestMethod.POST)
	public String newProduct(@RequestParam("name") String name, @RequestParam("description") String desc, @RequestParam("price") Double price) {
		Product prod = productService.create(new Product(name,desc,price));
		Long id = prod.getId();
		return "redirect:/products/" + id;
	}
	
	@RequestMapping("/categories/new")
	public String enterCategory(Model model) {
		Category cat = new Category();
		model.addAttribute("category", cat);
		return "/pages/newCategory.jsp";
	}
	
	@RequestMapping(value="/categories/new", method=RequestMethod.POST)
	public String newCategory(@RequestParam("name") String name) {
		Category cat = categoryService.create(new Category(name));
		Long id = cat.getId();
		return "redirect:/categories/" + id;
	}
	
	@RequestMapping("/products/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id) {
		Product prod = productService.findProduct(id);
		List<Category> added = prod.getCategories();
		List<Category> categories = categoryService.findAll();
		
		List<Category> menu = new ArrayList<Category>();
		menu.addAll(categories);
		menu.removeAll(added);
		
		model.addAttribute("product", prod);
		model.addAttribute("added", added);
		model.addAttribute("menu", menu);
		return "/pages/product.jsp";
	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.POST)
	public String newProductCategory(@RequestParam("cid") Long catid, @PathVariable("id") Long proid) {
		Product prod = productService.findProduct(proid);
		Category cat = categoryService.findCategory(catid);
		categories_ProductsService.create(new Categories_Products(cat,prod));
		return "redirect:/products/" + proid;
	}
	
	@RequestMapping("/categories/{id}")
	public String showCategory(Model model, @PathVariable("id") Long id) {
		Category cat = categoryService.findCategory(id);
		List<Product> added = cat.getProducts();
		List<Product> products = productService.findAll();
		
		List<Product> menu = new ArrayList<Product>();
		menu.addAll(products);
		menu.removeAll(added);
		
		model.addAttribute("category", cat);
		model.addAttribute("added", added);
		model.addAttribute("menu", menu);
		return "/pages/category.jsp";
	}
	
	@RequestMapping(value="/categories/{id}", method=RequestMethod.POST)
	public String CategoryProduct(@RequestParam("pid") Long proid, @PathVariable("id") Long catid) {
		Category cat = categoryService.findCategory(catid);
		Product prod = productService.findProduct(proid);
		categories_ProductsService.create(new Categories_Products(cat,prod));
		return "redirect:/categories/" + catid;
	}
}
