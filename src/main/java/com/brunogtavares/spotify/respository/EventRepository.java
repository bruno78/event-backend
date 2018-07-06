package com.brunogtavares.spotify.respository;

import com.brunogtavares.spotify.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
