package guru.springframework.sfgpetclinicmisrra.repositories;

import guru.springframework.sfgpetclinicmisrra.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
