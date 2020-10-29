package com.pumpkin.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pumpkin.business.Pumpkin;
import com.pumpkin.db.PumpkinRepo;

@CrossOrigin
@RestController
@RequestMapping("/pumpkins") // make the name of the main url math the name of the entity but in plural
public class PumpkinController {

	@Autowired
	private PumpkinRepo pumpkinRepo;

	// list all pumpkins
	@GetMapping("/")
	public List<Pumpkin> getallPumpkin() {
		return pumpkinRepo.findAll();
	}

	// get pumpkin by id
	@GetMapping("/{id}")
	public Optional getPumpkin(@PathVariable int id) {
		Optional<Pumpkin> p = pumpkinRepo.findById(id);
		return p;
	}

	// add a pumpkin
	@PostMapping("/")
	/*
	 * incoming json request must be translated into java that's why we add
	 * the @RequstedBody to the Pumpkin object
	 */
	public Pumpkin addPumpkin(@RequestBody Pumpkin p) {
		return pumpkinRepo.save(p);
	}

	// update a pumpkin
	@PutMapping("/")
	// incoming json request must be translated into java that's why
	// we add the @RequstedBody to the Pumpkin object
	public Pumpkin updatePumpkin(@RequestBody Pumpkin p) {
		return pumpkinRepo.save(p);
	}

	// delete a pumpkin
	@DeleteMapping
	public void deletePumpkin(@RequestBody Pumpkin p) {
		pumpkinRepo.delete(p);
	}
}