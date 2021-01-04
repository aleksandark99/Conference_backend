package com.aleksandar.ConferenceProceedingsManager.repository;

import com.aleksandar.ConferenceProceedingsManager.model.Paper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperRepository extends JpaRepository<Paper,Long> {
}
