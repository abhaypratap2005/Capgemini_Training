package com.cms.employeetransportproblem.repository;

import com.cms.employeetransportproblem.model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRepo extends JpaRepository<Cab, Long> {}
