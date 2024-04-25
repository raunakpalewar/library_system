package com.example.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    public Rental getRentalById(Long id) {
        Optional<Rental> rentalOptional = rentalRepository.findById(id);
        return rentalOptional.orElse(null);
    }

    public Rental createRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public Rental updateRental(Long id, Rental rental) {
        if (rentalRepository.existsById(id)) {
            rental.setId(id);
            return rentalRepository.save(rental);
        } else {
            return null; // Rental with given id not found
        }
    }

    public void deleteRental(Long id) {
        rentalRepository.deleteById(id);
    }
}
