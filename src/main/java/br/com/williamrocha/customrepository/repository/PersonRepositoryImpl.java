package br.com.williamrocha.customrepository.repository;

import br.com.williamrocha.customrepository.domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonRepositoryImpl implements PersonRepositoryCustom{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Person> getAllFromCustom() {
        List<Object[]> list = (List<Object[]>) entityManager.createNativeQuery(
                """
                    SELECT id_person,first_name,last_name,email,address,city,zipcode 
                      FROM Person
                  """
        ).getResultList();
        return list.stream().map((o) ->
            {
                int i=0;
                return Person.builder()
                .id((Long)o[i++])
                .firstName((String)o[i++])
                .lastName((String)o[i++])
                .email((String)o[i++])
                .address((String)o[i++])
                .city((String)o[i++])
                .zipcode((String)o[i++])
                .build();
            }).collect(Collectors.toList());
    }
}
