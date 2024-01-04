package mx.edu.utez.diagnostico.controller;


import lombok.AllArgsConstructor;
import mx.edu.utez.diagnostico.model.dto.PersonDto;
import mx.edu.utez.diagnostico.model.entity.PersonBean;
import mx.edu.utez.diagnostico.services.IPerson;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/person")
public class PersonController {
    private final IPerson personService;


    @GetMapping("/")
    public List<PersonBean> getPerson(){
        return personService.findAll();
    }


    @GetMapping("/{id}")
    public PersonBean showById(@PathVariable Integer id){
        return personService.findById(id);
    }

    @PostMapping("/")
    public PersonDto create(@RequestBody PersonDto personDto){
        PersonBean personSave= personService.save(personDto);
        return  PersonDto.builder()
                .id(personSave.getId())
                .ape1(personSave.getApe1())
                .ape2(personSave.getApe2())
                .name(personSave.getName())
                .date(personSave.getDate())
                .build();
    }


    @PutMapping("/")
    public PersonDto update(@RequestBody PersonDto personDto){
        PersonBean personUpdate= personService.save(personDto);
        return PersonDto.builder()
                .id(personUpdate.getId())
                .ape1(personUpdate.getApe1())
                .ape2(personUpdate.getApe2())
                .name(personUpdate.getName())
                .date(personUpdate.getDate())
                .build();

    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        PersonBean person= personService.findById(id);
        personService.delete(person);
    }
}
