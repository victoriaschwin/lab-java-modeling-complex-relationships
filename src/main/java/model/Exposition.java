package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "expositions")
@DiscriminatorValue(value = "EXPOSITION")
public class Exposition extends Event{
    public Exposition() {
    }

    public Exposition(Date date, int duration, String location, String title, List<Guest> guestList) {
        super(date, duration, location, title, guestList);
    }
}
