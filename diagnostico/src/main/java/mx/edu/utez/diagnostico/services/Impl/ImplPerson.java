package mx.edu.utez.diagnostico.services.Impl;

import lombok.AllArgsConstructor;
import mx.edu.utez.diagnostico.model.dao.PersonDao;
import mx.edu.utez.diagnostico.model.dto.PersonDto;
import mx.edu.utez.diagnostico.model.entity.PersonBean;
import mx.edu.utez.diagnostico.services.IPerson;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class ImplPerson implements IPerson {

    private final PersonDao personDao;


    @Override
    @Transactional
    public PersonBean save(PersonDto personDto) {
        PersonBean person = PersonBean.builder()
                .id(personDto.getId())
                .ape1(personDto.getApe1())
                .ape2(personDto.getApe2())
                .name(personDto.getName())
                .date(personDto.getDate())
                .build();

        PersonBean savedPerson = personDao.save(person);


        return savedPerson;
    }


    @Override
    @Transactional(readOnly = true)
    public PersonBean findById(Integer id){
        return  personDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonBean> findAll(){
        return (List<PersonBean>) personDao.findAll();
    }

    @Override
    @Transactional
    public void delete(PersonBean person){
        personDao.delete(person);
    }

}
