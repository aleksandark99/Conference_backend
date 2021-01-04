package com.aleksandar.ConferenceProceedingsManager.repository;

import com.aleksandar.ConferenceProceedingsManager.model.Proceedings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProceedingsRepository extends JpaRepository<Proceedings,Long> {
}
