package model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "conferences")
public class Conference extends Event{
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "event_speaker",
    joinColumns = @JoinColumn(name = "event_id"),
    inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    private List<Speaker> speakers;

    public Conference() {
    }

    public Conference(Date date, int duration, String location, String title, List<Guest> guestList, List<Speaker> speakers) {
        super(date, duration, location, title, guestList);
        this.speakers = speakers;
    }
}
