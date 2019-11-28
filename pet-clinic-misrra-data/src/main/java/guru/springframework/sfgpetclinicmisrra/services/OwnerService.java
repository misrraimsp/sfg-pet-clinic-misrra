package guru.springframework.sfgpetclinicmisrra.services;

import guru.springframework.sfgpetclinicmisrra.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
