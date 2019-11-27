package guru.springframework.sfgpetclinicmisrra.services;

import guru.springframework.sfgpetclinicmisrra.model.Owner;

import java.util.Set;

public interface VetService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
