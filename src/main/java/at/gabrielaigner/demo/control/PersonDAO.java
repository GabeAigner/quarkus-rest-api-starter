package at.gabrielaigner.demo.control;

import at.gabrielaigner.demo.model.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PersonDAO implements PanacheRepository<Person> {
}
