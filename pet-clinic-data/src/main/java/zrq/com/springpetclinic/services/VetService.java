package zrq.com.springpetclinic.services;

import zrq.com.springpetclinic.model.Pet;
import zrq.com.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
