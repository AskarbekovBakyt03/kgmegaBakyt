package kg.mega.rent.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@Table (name = "categories")
@FieldDefaults( level = AccessLevel.PRIVATE)

public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    boolean isActive;

}
