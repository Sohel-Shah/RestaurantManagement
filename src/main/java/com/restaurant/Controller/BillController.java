package com.restaurant.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.Entity.Bill;
import com.restaurant.Repository.BillRepository;


@RestController
public class BillController {

	@Autowired
	public BillRepository billrepo;
	
	@GetMapping("/get-bill-details")
	public List<Bill> getBillDetails(){
		return billrepo.findAll();
	}
}