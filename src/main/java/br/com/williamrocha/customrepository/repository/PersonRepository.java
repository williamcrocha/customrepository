package br.com.williamrocha.customrepository.repository;

import br.com.williamrocha.customrepository.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>,PersonRepositoryCustom {
}
