package kg.mega.rent.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "documents")
@FieldDefaults( level = AccessLevel.PRIVATE)

public class Dokument {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Integer serial;
    Integer doc_number;
    boolean isActive;
}
