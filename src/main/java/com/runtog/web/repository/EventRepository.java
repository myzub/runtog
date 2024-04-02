package com.runtog.web.repository;

import com.runtog.web.dto.EventDto;
import com.runtog.web.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
}
