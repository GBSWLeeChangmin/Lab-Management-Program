package com.example.interconnect.repository;

import com.example.interconnect.model.memberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface memberRepository extends JpaRepository<memberEntity, Integer> {
}
