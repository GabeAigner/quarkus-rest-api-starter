package at.gabrielaigner.demo.control;

import at.gabrielaigner.demo.model.Person;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.time.LocalDate;
import java.util.logging.Logger;

@ApplicationScoped
public class InitBean {
    @Inject
    PersonDAO personDao;

    private static final Logger LOG = Logger.getLogger(InitBean.class.getSimpleName());
    //Logger : https://quarkus.io/guides/lifecycle

    public void init(@Observes StartupEvent event){
        LOG.info(InitBean.class.getCanonicalName() + "**********************");

        Person chris = new Person("Christian", LocalDate.of(2000,12,17), "ledig");
        personDao.persist(chris);
    }
}
