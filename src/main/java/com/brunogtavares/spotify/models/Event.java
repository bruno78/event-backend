package com.brunogtavares.spotify.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor @NoArgsConstructor @Data @Getter @Setter
@Entity @Table(name="EVENT")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_description")
    private String eventDescription;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "user_id")
    private int userId;

    public Event(String event, Date startTime, Date endTime, int userId) {
        this.eventDescription = event;
        this.startTime = startTime;
        this.endTime = endTime;
        this.userId = userId;
    }

}
