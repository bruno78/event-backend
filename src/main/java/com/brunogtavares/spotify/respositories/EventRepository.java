package com.brunogtavares.spotify.respositories;

import com.brunogtavares.spotify.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
