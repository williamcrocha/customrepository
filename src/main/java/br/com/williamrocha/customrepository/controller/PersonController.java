package br.com.williamrocha.customrepository.controller;

import br.com.williamrocha.customrepository.domain.Person;
import br.com.williamrocha.customrepository.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("persons")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("getAllFromJPARepository")
    public @ResponseBody List<Person> getAllFromJPARepository(){
        return personService.listAllFromJPARepository();
    }

    @GetMapping("getAllFromRepositoryCustom")
    public @ResponseBody List<Person> getAllFromRepositoryCustom(){
        return personService.listAllFromRepositoryCustom();
    }
}
