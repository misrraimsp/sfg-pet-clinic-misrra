package guru.springframework.sfgpetclinicmisrra.repositories;

import guru.springframework.sfgpetclinicmisrra.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
