package com.igniteedcuation.repositories;

import com.igniteedcuation.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
