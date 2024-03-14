package com.last.project.Repository;

import com.last.project.Entity.BootCampers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BootCamperRepository extends JpaRepository<BootCampers,Long> {
    Optional<BootCampers> FindByEmailId(String email);
 }
