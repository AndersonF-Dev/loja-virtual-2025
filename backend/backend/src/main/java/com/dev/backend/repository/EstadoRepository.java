package com.dev.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dev.backend.entity.Estado;

@SuppressWarnings("unused")
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
    void deleteById(Long id); // método correto para deletar por id
    
}



// package com.dev.backend.repository;

// import java.util.List;

// import com.dev.backend.entity.Estado;

// public class EstadoRepository extends JpaRepository<Estado, Long>{

//     public List<Estado> findAll() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'findAll'");
//     }

//     public Estado saveAndFlush(Estado estado) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
//     }

//     public Estado findById(Long id) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'findById'");
//     }

//     public void delete(Estado estado) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'delete'");
//     }
    
// }
