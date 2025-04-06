package com.igniteedcuation.repositories;

import com.igniteedcuation.entities.Enrollment;
import com.igniteedcuation.entities.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
