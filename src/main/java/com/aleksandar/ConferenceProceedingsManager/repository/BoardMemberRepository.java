package com.aleksandar.ConferenceProceedingsManager.repository;

import com.aleksandar.ConferenceProceedingsManager.model.BoardMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardMemberRepository extends JpaRepository<BoardMember,Long> {
}
