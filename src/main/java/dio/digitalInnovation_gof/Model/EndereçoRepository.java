package dio.digitalInnovation_gof.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndereçoRepository extends CrudRepository<Endereço, String>{
    
}
