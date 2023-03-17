
package com.portfolio.mmieras.Security.Repository;

import com.portfolio.mmieras.Security.Entity.Rol;
import com.portfolio.mmieras.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
