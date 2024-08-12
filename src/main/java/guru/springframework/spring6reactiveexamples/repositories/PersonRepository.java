package guru.springframework.spring6reactiveexamples.repositories;

import guru.springframework.spring6reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 12/08/2024 - 08:53
 * @since jdk 1.21
 */
public interface PersonRepository {

    Mono<Person> getById(Integer id);

    Flux<Person> findAll();
}
