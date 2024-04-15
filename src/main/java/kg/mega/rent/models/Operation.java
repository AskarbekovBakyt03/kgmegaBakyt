package kg.mega.rent.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Table(name = "operations")
@FieldDefaults( level = AccessLevel.PRIVATE)

public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Instant startDate;
    Instant endDate;
    double price;
}
