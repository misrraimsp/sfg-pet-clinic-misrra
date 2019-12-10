package guru.springframework.sfgpetclinicmisrra.repositories;

import guru.springframework.sfgpetclinicmisrra.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
