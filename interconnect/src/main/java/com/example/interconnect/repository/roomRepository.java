package com.example.interconnect.repository;

import com.example.interconnect.model.roomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roomRepository extends JpaRepository<roomEntity, String> {
}
