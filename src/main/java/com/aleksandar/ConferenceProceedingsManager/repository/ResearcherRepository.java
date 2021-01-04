package com.aleksandar.ConferenceProceedingsManager.repository;

import com.aleksandar.ConferenceProceedingsManager.model.Researcher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResearcherRepository extends JpaRepository<Researcher,Long> {
}
