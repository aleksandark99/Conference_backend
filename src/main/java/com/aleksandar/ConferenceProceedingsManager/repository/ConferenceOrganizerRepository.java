package com.aleksandar.ConferenceProceedingsManager.repository;

import com.aleksandar.ConferenceProceedingsManager.model.ConferenceOrganizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceOrganizerRepository extends JpaRepository<ConferenceOrganizer,Long> {
}
