package com.portfolio.mmieras.Repository;

import com.portfolio.mmieras.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {
   public Optional<Persona> findByNombre(String nombre);
   public boolean existsByNombre(String nombre); 
}
