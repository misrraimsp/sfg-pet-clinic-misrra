package guru.springframework.sfgpetclinicmisrra.services.map;

import guru.springframework.sfgpetclinicmisrra.model.Vet;
import guru.springframework.sfgpetclinicmisrra.services.SpecialityService;
import guru.springframework.sfgpetclinicmisrra.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(speciality -> {
                if (speciality.getId() == null){
                    speciality.setId(specialityService.save(speciality).getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
