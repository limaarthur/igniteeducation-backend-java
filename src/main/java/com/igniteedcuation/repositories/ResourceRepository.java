package com.igniteedcuation.repositories;

import com.igniteedcuation.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
