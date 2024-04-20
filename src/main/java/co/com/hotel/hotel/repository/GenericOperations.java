package co.com.hotel.hotel.repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GenericOperations<E, D> {
    Mono<E> create(D data);

    Flux<E> getAll();

    Mono<E> update(Integer id, D data);

    Mono<E> getById(Integer id);

    Mono<Void> delete(Integer id);
}
