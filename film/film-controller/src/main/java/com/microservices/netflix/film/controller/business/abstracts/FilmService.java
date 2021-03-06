package com.microservices.netflix.film.controller.business.abstracts;

import com.microservices.netflix.common.entities.Film;
import com.microservices.netflix.common.results.DataResult;
import com.microservices.netflix.common.results.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import javax.xml.crypto.Data;
import java.util.List;
import java.util.Optional;

@Service
public interface FilmService {
    DataResult<List<Film>> findAll();

    DataResult<List<Film>> findAllByIsActive();

    DataResult<List<Film>> findAllByIsNotActive();

    DataResult<List<Film>> findAllByDeletedIsNotNull();

    DataResult<Optional<Film>> findById(Long id);

    Result add(Film film);

    Result update(Long id, Film film);

    Result delete(Long id);

    Result setActive(Long id);

    Result setPassive(Long id);

    DataResult<List<Film>> findActiveFilmsFromUserService();
}
