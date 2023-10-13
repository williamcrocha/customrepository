package br.com.williamrocha.customrepository.service;

import br.com.williamrocha.customrepository.domain.Person;
import br.com.williamrocha.customrepository.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> listAllFromRepositoryCustom() {
        return personRepository.getAllFromCustom();
    }

    public List<Person> listAllFromJPARepository() {
        return personRepository.findAll();
    }
}
